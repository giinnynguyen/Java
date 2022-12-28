### Copy vs Cloning
Copy: object gốc và object copy có giá trị giống nhau nhưng vẫn trỏ tới cùng một vùng nhớ, vì vậy thay đổi ở một object sẽ affect tới object còn lại

Cloning: object gốc và object cloning sẽ trỏ tới 2 vùng nhớ khác nhau, thay đổi object không ảnh hưởng object còn lại

Để clone một object, dùng method clone() của class Object. Với điều kiện class phải implement Clonable interface, nếu không sẽ lỗi CloneNotSupportedException
```java
copy = original.clone()
```

### Shallow copy vs Deep copy
Nhưng default, Object's clone method dùng shallow copy, tức là nó sẽ không clone biến reference bên trong object (subobject bên trong object vẫn trỏ cùng vùng nhớ).

Nếu subobject giữa original object và shallow clone object là immutable, hoặc subobject đó không bị tác động bởi bất cứ tiến trình nào (tức final constant), thì shallow copy là ok. <br>
Ngược lại, cần define lại method clone để tạo deep copy.

Deep copy:
```java
class Employee implements Cloneable {
    Date hireDay;
. ..
public Employee clone() throws CloneNotSupportedException {
        // call Object.clone()
        Employee cloned = (Employee) super.clone();
        // clone mutable fields
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
} }
```

### Cloneable interface
Cloneable: là một [tag interface](https://wiki.c2.com/?TagInterface), một dạng interface đặc biệt không có bất cứ method nào. Nhiệm vụ của interface kiểu này là để “tag” - đánh dấu 1 chức năng cho 1 object.

```java
if (obj instanceof Cloneable) . . .
```

### Warning:
Cloneable không được khuyến khích dùng, lý do nếu 1 class implements Cloneable thì tất cả subobject của class đó cũng phải implememts Cloneable

### Alternative: Copy constructor vs Copy Static Factory Method
```java 
// Copy constructor
public Language(Language language) {
    this.name = language.name;
    this.inception = language.inception;
    this.paradigms = new ArrayList<>(language.paradigms);
}
```

```java
// Copy Static Factory Method
public static Language create(Language language) {
    return new Language(language);
}
```
