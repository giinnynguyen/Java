Đoạn code này thì s có giá trị empty.
```java
int a = scanner.nextInt();
String s = scanner.nextLine();
```

Lý do là hàm nextInt() chỉ đọc số nguyên thôi (ko đọc newline), nên khi nhập số integer xong bấm enter thì hàm nextLine nó đọc kí tự enter (newline \n), kết quả là một dòng rỗng.

Để fix, bỏ đoạn code skip newline sau đoạn code nextInt() thì dòng nextLine sẽ được execute để đọc chuỗi.

skip newline: scanner.skip("[\r\n]+")
