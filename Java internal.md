**Java Development Procedure:**

Lập trình viên viết mã nguồn (file .java) -> trình biên dịch compile mã nguồn thành mã bytecode (file .class) -> mã bytecode này được JVM thông dịch thành mã máy trên mỗi hệ điều hành khác nhau để execute.

Thật ra thì nó vẫn phụ thuộc vào từng hệ điều hành, vì mỗi JVM ở mỗi hệ điều hành được implement cách khác nhau để thông dịch bytecode thành mã máy khác nhau cho từng hệ điều hành. Nói nó ko phụ thuộc vào nền tảng đó là ở góc nhìn của lập trình viên, 1 người chỉ cần viết 1 đoạn mã nguồn và dùng đoạn mã đó chạy được trên nhiều nền tảng (write once, run everywhere).

**JDK vs JRE:**

JRE là Java Runtime Environment, bao gồm tất cả mọi thứ cần thiết để chạy 1 chương trình Java mà đã được compiled, nhưng ko dùng để tạo chương trình đuợc. Còn JDK là Java Development Toolkit, bao gồm JRE và những gói khác (như javac, javadoc,..) để tạo và compile chương trình,… Trong trường hợp chỉ cần chạy chương trình java (vd chạy trên máy khách hàng), thì chỉ cần cài JRE là đủ. Ở trang chủ java có cho phép download JRE rời.

JRE nằm bên ngoài folder jdk được gọi là Public JRE -> dùng để chạy bất kỳ chương trình nào cần Java để chạy. JRE nằm trong folder jdk được gọi là Private JRE -> cho JDK Tools sử dụng
