### Abstraction: 
Theo oop, là một concept về một đối tượng ko có thực, một khái niệm chỉ có vai trò là định nghĩa hành vi/bản chất cho các class con của nó. (Trong triết học, một cái gì đó abstract là một thứ được tạo ra để định nghĩa bản chất chung cho một tập các đối tượng liên quan). Vì vậy, một đối tượng là abstract thì không có instance, không thể dùng toán tử new.

Tuy nhiên, theo hướng oop là rất khó để tiếp cận nên có thể hiểu theo hướng kỹ thuật, tức một class abstract là một class cha có hành vi ko thể tự implement được mà phải đẩy xuống cho các class con cụ thể của nó thực thi. VD như class Shape có method tính S và vì nó là một shape chung chung ko có cách nào tính S được. Hành vi tính S sẽ được các class con cụ thể như Square, Circle, Triangle định nghĩa.
Interface: interface là một trường hợp đặc biệt của abstract class, vì thế nên người ta thường đặt khái niệm interface cạnh khái niệm abstract class để so sánh. Khác với abstract class, interface trừu tượng hoàn toàn, chỉ có thể khai báo hằng và abstract method.

Về mục đích thì abstract class vs interface có thể rất khác nhau: Interface chỉ gồm mỗi phương thức abstract, nó có thể dùng trong quá trình thiết kế khi mà người ta chỉ định nghĩa chức năng mà chưa cần implement. Hệ quả là trong quá trình phát triển phần mềm, một developer có thể dựa vào interface để nắm bức tranh toàn cảnh tốt hơn.

### Encapsulation:
là quá trình gói data và method vào một chỗ, thể hiện trong java ở chỗ mọi thứ trong một chương trình java đều nằm trong class. Một concept liên quan đến encapsulation là các access modifier, nó quản lý level truy cập đến data và method để che giấu thông tin.

### Inheritance:
bản chất của kế thừa là class con lấy tất cả data và method của class cha làm thành của mình.

### Polymorphism:
Tính đa hình chỉ xảy ra khi có kế thừa, nó mô tả tính chất đa dạng của class con: cùng kế thừa từ class cha nhưng mỗi class con lại có các kiểu hình khác nhau và hành vi khác nhau.

Tính đa hình được implement trong java thông qua overriding.
