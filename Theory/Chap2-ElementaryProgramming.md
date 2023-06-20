# Scanner & Nummeric data type

### 💦 How to use Scanner to prompt user to enter input from keyboard:
1. Import Scanner class:
```java
   import java.util.Scanner;
```
Scanner là một class nằm trong gói java.util, là một gói thư viện của java chứa các hàm ultilities

2. Create Scanner class instance:
```java
Scanner scanner = new Scanner(System.in);
```
3. Prompt user to enter data:
```java
System.out.print("Enter your data: ");
```
Data từ user console thông thường là primitive data type như number, string, boolean. Các kiểu dữ liệu khác như object, blob, image, binary thì có thể dùng các class InputStream trong java.io

4. Read user data from scanner:<br>

Tuỳ kiểu dữ liệu, sử dụng các hàm tương ứng để đọc primitive data:<br>
VD double => scanner.nextDouble(), int => scanner.nextInt();

Lưu ý: khi gọi hàm nextLine() sau hàm nextInt(), kết quả của nextLine() sẽ là một chuỗi rỗng. Lý do vì nextLine() đọc kí tự "\n" khi user gõ Enter.

Fixed bằng cách sử dụng ```scanner.skip(“[\r\n]+")``` ngay sau dòng nextInt(), truyền vào một RegExp thì scanner sẽ skip kí tự "\n".

5. Handle user data:

Note: Khi sử dụng nextInt(), nextLine(),... để đọc data từ user, java block luồng code đang chạy và đợi cho tới khi nào user nhập data. Có thể set time vd sau 1' user không có động thái gì, thì thông báo ra màn hình rồi terminate program.

6. Close scanner:
```java
scanner.close()
```
Khi làm việc với file và network, luôn luôn đóng connection sau khi đã xong chuyện để release resource.

### 💦 static typed
tuyên ngôn của Java là 'strongly static typed', static typed có nghĩa là kiểu dữ liệu sẽ được xác định ngay tại thời điểm biên dịch và không thay đổi, để tránh cast từ loại object này sang loại object khác, vd cast từ People qua Dog là không được)

Khai báo biến có thể hiểu là khai báo kiểu dữ liệu mà biến đó có thể lưu trữ (cấp phát bộ nhớ).



### 💦 Numeric Data Type
| Name   | Range            | Storage Size    |
|--------|------------------|-----------------|
| byte   | -2^7 to 2^7-1    | 8-bit signed    |
| short  |-2^15 to 2^15 -1 | 16-bit signed   |
| int    | -2^31 to 2^31 - 1 | 32-bit signed   |
| long   | -2^63 to 2^63 - 1 | 64-bit signed   |
| float  |                  | 32-bit IEEE 754 |
| double |                  | 64-bit IEEE 754 |

#### Signed Bit
```java
VD: byte b = 8;
```
- binary format là 00001000
- được lưu trữ bằng 8 bit, bit đầu tiên là bit dấu (0 là số dương, 1 là số âm)
- để biểu diễn giá trị âm của b, thay bit đầu tiên thành 1 => binary là 10001000
- bởi vì bit đầu tiên được lấy làm bit dấu, nên signed byte chỉ có range từ -2^7 tới 2^7-1. Tương tự cho short, int, long
- Khai báo binary trong java:
```java
int binaryNumber = 0b1000;
```

#### Unsigned Bit
Java không hỗ trợ unsigned bit, nhưng unsigned bit hiểu đơn giản là không có bit dấu. Nên nó có có thể biểu diễn giá trị từ 0 tới 2^n (255 giá trị cho kiểu byte). 

#### Tràn số:
VD integer có range là -2^31 tới 2^31-1, giá trị maximum mà int có thể biểu diễn là 2147483647, nếu gán một giá trị vượt quá dung lượng, sẽ gây nên tràn số.

```agsl
int x = 2147483647 + 1; // or int x = 2147483648
```
thì x sẽ trở thành -2^31 (tức -2147483648)

### 💦 Assignment statement:
VD1:
```java
int x = 6/2.0;
```

+ ```x``` là variable (variable là những gì bên trái dấu bằng)
+ ```6/2.0``` là expression (biểu thức)
+ ```int x = 6/2.0``` là 1 phép gán (assignment): gán giá trị của expression 6/2.0 vào biến x <br/>

=> Trong java, kiểu dữ liệu của expression bắt buộc chuyển về cùng kiểu dữ liệu với biến bên trái, vd ```int x = 1.0``` là không hợp lệ vì data type của x là int còn data type của expression là double.  <br>
=> Kết quả của ```6/2.0=3.0```, kết quả này có kiểu dữ liệu là double. Double không thể cast ngầm về kiểu int do có mất dữ liệu nên đoạn code ```int x = 6/2.0``` sẽ bị compile error <br>
Fixed: ```int x = (int) (6/2.0)``` => casting kết quả expression về kiểu int, sẽ có mất dữ liệu

VD2: 
```java 
double x = 6/2;
``` 

=> kết quả của expression trả về int, vì là chuyển đổi từ datatype int có độ lớn nhỏ hơn double nên có thể cast ngầm được


### 💦 Default:
Java lấy default cho số nguyên là int, và default cho số thực là double <br>
4 -> kiểu int <br>
4.0 -> kiểu double <br>
4L or 4l -> kiểu long <br>
4f or 4F -> kiểu float <br>

### 💦 Casting (ép kiểu):
+ Widening Casting (automatically) - converting a smaller type to a larger type size
  ```byte -> short -> char -> int -> long -> float -> double```
+ Narrowing Casting (manually) - converting a larger type to a smaller size type
  ```double -> float -> long -> int -> char -> short -> byte```

convert byte -> short (Widening Casting) <br>
```byte b = 8, binary: 000010000```<br>
```convert to short => add thêm 8 bit => binary: 00000000 00001000, value = 8```
=> no losing bit information

convert short -> byte (Narrowing Casting) <br>
```short b = 400, binary: 00000001 10010000```<br>
```convert to byte => cắt 8 bit => binary: 10010000, tức giá trị -112 => lose information```

### 💦 Promotion:
Hỏi: 2 đoạn code bên dưới có giống nhau không?
```java
byte a = 5;
a += 1;
```
và
```java
byte a = 5;
a = a + 1;
```

=> Đoạn code 1 okay không có vấn đề gì vì cả 2 statement đều cùng kiểu byte <br>
=> Đoạn code 2 sẽ bị compile error, lý do ```a + 1``` là kiểu int và không cùng kiểu với a =)))) <br>
Tại sao ```a + 1``` là kiểu int, thì là vì promotion. Trong 1 phép biểu thức thì java ưu tiên promote kết quả về thằng có độ lớn lớn hơn (rule là cast ngầm sang type bigger) <br>
trong phép ```a + 1``` thì có 2 hạng tử là a và 1, a có kiểu byte và 1 có kiểu int => promote kết quả về int =))))

### 💦 Ưu tiên độ lớn hơn độ chính xác
java cho phép gán float = int ngầm định, nhưng int = float nó la làng, lý do mất độ chính xác

nhưng float x = 1000000001; (1 tỷ lẻ 1) cũng mất độ chính xác

=> answer: the language designers decided that if the target type has a range large enough then an implicit conversion is allowed, even though there may be a loss of precision. Note that it is the range that is important, not the precision.

https://stackoverflow.com/questions/11908429/java-allows-implicit-conversion-of-int-to-float-why

### 💦 Floating-point number (số thực)
trong java có 2 kiểu dữ liệu là float & double để biểu diễn số thực, nói tới floating-point number cần biết 2 thứ là range(độ lớn) và precision (độ chính xác)

Float có độ lớn là 32 bit, biểu diễn được giá trị từ -3.4 x 10^38 đến 3.4 x 10^38 nhưng độ chính xác chỉ được 7-8 digit sau dấu phẩy

Double có độ lớn là 64 bit, biểu diễn được giá trị từ -1.7 x 10^308 to 1.7 x 10^308, độ chính xác được 15-16 digit sau dấu phẩy

### 💦 Formatting 
Rule: ```%[argument_index$][flags][width][.precision]conversion```

### 💦 Gán biến trước khi sử dụng
Line 7 có lỗi không?
```java
public void test() {
    int a = 9;
    int b;
    if (b > 3) {
        b = 4;
    }
    System.out.print(b);//line 7
}
```
=> câu trả lời là compile error <br>
Lý do: compiler chỉ làm những gì nó chắc chắn thui, giả sử có 1 đoạn thread nào đó chạy ngang làm thay đổi giá trị của a, thì đoạn if sẽ không được thực thi

=> Fixed:

C1: gán a thành hằng số => a không thể changed => make sure if được chạy <br>
C2: init giá trị default cho b
