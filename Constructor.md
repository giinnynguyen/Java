1. Constructor:

Định nghĩa: A constructor is used in the creation of an object that is an instance of a class

Tức là constructor ko được dùng để tạo object, mà được gọi sau cùng trong quá trình tạo đối tượng. Mục đích để khởi tạo giá trị cho các thuộc tính mà người dùng mong muốn tác động vào.

Vậy bạn sử dụng constructor khi muốn sử dụng thông tin tùy biến từ người dùng. Vd bạn tạo một đối tượng Car để đem bán cho khách hàng, bạn muốn khách cung cấp thông tin về "Màu Sắc", "Kiểu Dáng" như ý họ thì bạn dùng constructor. Còn một số thông số như "Giá Tiền", bạn chỉ có một giá cố định thì bạn ko cần tạo constructor mà dùng giá trị mặc định.

Đấy là ý nghĩa, còn với góc nhìn của lập trình viên thì bất cứ khi nào cần tạo object mà các thuộc tính của object đó có đặc điểm là dynamic/nhận vào từ tham số thì dùng constructor.

Ngoài ra, có một luật về constructor đó là: Mọi class trong java đều gọi đến constructor rỗng của class cha trực tiếp. Nên với trường hợp bạn kế thừa một class, mà class cha đó ko có constructor rỗng thì bạn phải khai báo trong trường hợp này để hết lỗi.

2. private, public, protected & getter, setter

Này đọc kĩ mô tả là hiểu. Tuy nhiên thực tế, protected không được khuyến khích sử dụng. Vì bạn thường làm việc trong 1 team, có một số lý do cho việc sử dụng protected dẫn tới một số vấn đề, nên nếu ko phải là bắt buộc thì khuyến khích sử dụng private cho biến.

Dẫn đến trong trường hợp khi bạn ko thể access property nào đó, thì getter/setter là cách để get thông tin và chỉnh sửa property đó.

3. main & class:

có thể bỏ tất cả vào main, cũng có thể ko tách class, nhưng thế thì bỏ qua lợi thế của oop.
+ Việc tách class là nguyên lý Single Reponsibility trong SOLID.
+ Hàm main thường giữ nhiệm vụ run application, start config một số tài nguyên. Ko có hướng dẫn chi tiết cái nào nên bỏ vào main, cái nào ko. Tùy thuộc vào hàm main của bạn làm gì trong ứng dụng, keep it simple sao cho khi đọc source code bạn có thể hình dung luồng ứng dụng bạn chạy ntn
