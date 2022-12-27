Phân biệt feature hiding vs overriding:

Overriding: Khi một subclass khai báo một instance method có cùng signature với method trong superclass, method ở subclass override/hide method ở superclass. (signature = name + parameter)

```java
class A{
    public int DefaultTempeture(){ return 25;}
}
class B extends A{
   @Override
    public int DefaultTempeture(){ return 28;}
}
A a = new B();
int x = a.DefaultTempeture(); // x = 28
```

Hiding: Static method không thể override, nên method ở subclass ko hide method cùng signature ở superclass được.

```java
class A{
    public static int defaultTempeture(){ return 25;}
}
class B extends A{
   @Override //Annotation
    public static int defaultTempeture(){return 28;}
}
A a = new B();
int x = a.defaultTempeture(); // x = 25
```
