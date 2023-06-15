# Java world
💦&nbsp;Who invented Java? Which company owns Java now? <br>
=> James Gosling led a team invented Java in 1991 called Oak, then release with name Java b/c trademark issue with Oak Technology company.
Oracle now owned Java (befored it was Sun Microsystems)

💦&nbsp;**Câu nói nổi tiếng của Java về platform independent?** <br>
=> write once, run everywhere <br>
(it means, write one source code and run it on many operating system)

Lập trình viên viết mã nguồn (file .java) -> trình biên dịch compile mã nguồn thành mã bytecode (file .class) -> mã bytecode này được JVM thông dịch thành mã máy trên mỗi hệ điều hành khác nhau để execute.

Thật ra thì nó vẫn phụ thuộc vào từng hệ điều hành, vì mỗi JVM ở mỗi hệ điều hành được implement cách khác nhau để thông dịch bytecode thành mã máy khác nhau cho từng hệ điều hành. Nói nó ko phụ thuộc vào nền tảng đó là ở góc nhìn của lập trình viên, 1 người chỉ cần viết 1 đoạn mã nguồn và dùng đoạn mã đó chạy được trên nhiều nền tảng (write once, run everywhere).

+&nbsp; **Kể 1 số điểm nổi bật của Java**: OOP, platform independent, security, fast, multithreaded 

💦&nbsp;**What kind of application Java can developed?** <br>
=> general-purpose: it means it can used to develop desktop app, web app, mobile app

💦&nbsp;What is Java applet?<br>
 => it is a Java app that run on browser, but now it no longer used b/c security issue

💦&nbsp;What programming language does android use? <br>
=> Java/Kotlin

# JDK, JRE
💦&nbsp;Java specification vs Java API? <br>
=> Java specifition: language design, thông thường từng phiên bản Java sẽ có specification doc<br>
API: language implementation include package java.lang, java.util, java.collections, java.io,…(chứa cụ thể class có thuộc tính gì, phương thức gì)

💦&nbsp;**Trong thư mục jdk có folder jre, jre đó khác gì với jre download rời (nằm bên ngoài thư mục jdk)?** <br>
=> JRE nằm bên ngoài folder jdk được gọi là Public JRE -> dùng để chạy bất kỳ chương trình nào viết bằng java. Nó bao gồm tất cả mọi thứ cần thiết để chạy 1 file Java mà đã được compiled và đóng gói thành application, nhưng ko dùng để tạo chương trình đuợc.<br>
JRE nằm trong folder jdk được gọi là Private JRE -> mục đích để JDK Tools sử dụng. (JDK bao gồm cả JRE và những gói khác như javac, javadoc,… để compiled và chạy chương trình).
Public jre vs Private jre cũng hông có gì khác nhau, ngoài việc nếu chỉ cần chạy chương trình (vd chạy trên máy khách) thì cài jre là đủ.
# A Java program
💦&nbsp;Output direction: vd muốn chuyển hướng từ in output vào console sang in vô file: java Test > text.txt

💦&nbsp;**Tại sao chỉ được phép có 1 public class trong 1 file và class name phải trùng với file name?** <br>
=> Nguyên tắc là ko được có 2 public class cùng 1 file. Vì compiler cần tạo file .class từ một public class cùng tên với tên file đó. <br>
Java có rule là trong 1 file source code .java, nếu có khai báo public class thì bắt buộc nó phải trùng tên file và chỉ được phép khai báo 1 public class trong 1 file (trừ inner class).<br>
Nhưng nếu tất cả class trong file đều là default access thì đặt tên tùy ý, compiler vẫn tạo được tất cả file .class bằng số class khai báo. Vậy lý do thực sự ko phải là “bắt buộc phải trùng tên file thì nó mới compile được”.<br>
Lý do:<br>
Public khác default ở chỗ: public được import ở mọi nơi, default chỉ import nội bộ trong cùng package. Có hạn chế như kia giúp compiler tìm public class nhanh hơn,

Giả sử file A.java có 2 public class A & B, ví dụ cần import class B thì compiler cần duyệt tất cả các file trong package đó để tìm ra B. Trong khi nếu file B.java chỉ gồm 1 public class B duy nhất thì nó nhảy thẳng đến B.java<br>
> The type is declared public (and therefore is potentially accessible from code in other packages). This restriction implies that there must be at most one such type per compilation unit. This restriction makes it easy for a Java compiler to find a named class within a package. In practice, many programmers choose to put each class or interface type in its own compilation unit, whether or not it is public or is referred to by code in other compilation units. Source: https://docs.oracle.com/javase/specs/jls/se8/html/jls-7.html#jls-7.6 

💦&nbsp;How to read user config from command line arguments? <br>
=> chạy command: java ProgramA config1 config2 

Trong hàm main(String[] args): <br> 
String[] args là mảng các arguments lấy từ command line.<br> 
args[0] => lấy ra config1<br> 
args[1] => lấy ra coònig2

💦&nbsp;Lấy 3 vd về syntax error, runtime error, logic error:<br>
=> **syntax error:**<br>
int a = “123”// gán sai kiểu, compiler chửi ngay lúc viết code<br>
-**runtime error:**<br>
int a = b/0; //chia cho 0 = infinity, lúc chạy chương trình tung ra lỗi<br>
-**logic error:**<br>
int a = 7/3; // kết quả = 2, expect là 2.3. Logic error không throw exception, 









