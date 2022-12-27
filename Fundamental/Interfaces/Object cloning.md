### Copy vs Cloning
Copy: object gốc và object copy có giá trị giống nhau nhưng vẫn trỏ tới cùng một vùng nhớ, vì vậy thay đổi ở một object sẽ affect tới object còn lại

Cloning: object gốc và object cloning sẽ trỏ tới 2 vùng nhớ khác nhau, thay đổi object không ảnh hưởng object còn lại

Để clone một object, dùng method clone() của class Object. Với điều kiện class phải implement Clonable interface, nếu không sẽ lỗi CloneNotSupportedException
```java
copy = original.clone()
```

### Shallow copy vs Deep copy
Nhưng default, Object's clone method dùng shallow copy, tức là nó sẽ không clone biến reference bên trong object (subobject bên trong object vẫn trỏ cùng vùng nhớ).

Nếu subobject giữa original object và shallow clone object là immutable, hoặc subobject đó không bị tác động bởi bất cứ tiến trình nào, thì shallow copy là an toàn. <br>
Ngược lại, cần define lại method clone để sử dụng deep copy.

Deep copy:
```java
class Employee implements Cloneable
    {
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
Cloneable (tagging interfaces or marker interface): indicating that the class designer understands the cloning process

tagging interface: has no methods; its only purpose is to allow the use of instanceof in a type inquiry
```java
if (obj instanceof Cloneable) . . .
```

