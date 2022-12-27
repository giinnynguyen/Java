Lý do ra đời:

Đầu tiên generic là một kiểu dữ liệu, chính xác hơn thì là type parameter. 

Giống như parameter trong method thì parameter type là 1 kiểu dữ liệu chung chung đại diện bởi chữ cái in hoa T or E, chúng ta ko biết chính xác kiểu dữ liệu của T là gì cho tới thời điểm runtime.
Xuất phát từ nhu cầu cần có một kiểu dữ liệu chung cho mọi đối tượng, trước khi có generic người ta dùng Object (vì Object là cha của mọi object khác). Sau đó, generic được thêm vào với lợi ích hơn Object là có thể detect lỗi tại compiler time.

Vấn đề :

Problems với generic xảy ra khi phải upgrade từ code cũ lên generics: có vài đoạn code cũ không thể chuyển thành generics, và phải mix generic code với non-generic code:
```java
public static void main(String[] args) {
    List<Integer> mList = new ArrayList<>();//with generics, we can detect error at compile time
    mList.add(4);
    insert(mList);//mix non-generic list into generics
    Integer integer = mList.get(1);//error ClassCastException
}
static void insert(List list){
        list.add(new String("ABc"));//add String to mList, no runtime error
}
```

*type information chỉ tồn tại ở thời điểm biên dịch để compiler đảm bảo get ra đúng type, 
tới thời điểm runtime mọi thứ bị xoá đi (type erasure). Đoạn trên sử dụng generic nên khi access phần tử của mList, 
compiler chỉ cho phép cast về Integer nhưng đoạn dưới dùng raw List nên có thể add bất cứ thứ gì, điều này gây nên lỗi*

Giải pháp là kiểm tra các compiler warning để tránh thêm phần tử có type unsafe vào list.

Java không cho phép khai báo ArrayList<Child> thay thế cho ArrayList<Parrent> lý do để tránh việc truyền sai kiểu dữ liệu. 

```java
  void addAnimal(List<Animal> animals){
    animals.add(new Dog());
}
```
  
nếu truyền List<Cat> vào method trên thì sẽ gây lỗi nhưng về cơ bản generic ko có cơ chế thông báo lỗi vì type information không tồn tại ở thời điểm runtime, JVM không thể detect có lỗi được nên để đảm bảo thì cấm luôn khai báo subtype generic. 

  Nhưng cùng một vấn đề như trên thì Array cho phép, vd truyền mảng Cat[] vào phương thức như trên thì java detect được lỗi và tung ra ArrayStoreException.
polymorphism generic thể hiện ở wildcard <?>, <? extends T>, <? super T> nhưng có điều kiện là trong method không được có thao tác add hoặc modified, nếu không compiler sẽ complain.
