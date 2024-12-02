/*==========================
Практика №2*/

interface Interface1 {
    default void commonMethod() {
        System.out.println("Interface1 commonMethod");
    }
}

interface Interface2 {
    default void commonMethod() {
        System.out.println("Interface2 commonMethod");
    }
}

class MyClass implements Interface1, Interface2 {
    @Override
    public void commonMethod() {
        // Нужно явно указать, какой метод интерфейса использовать
        Interface1.super.commonMethod();  // Выведет: Interface1 commonMethod
        Interface2.super.commonMethod();  // Выведет: Interface2 commonMethod
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.commonMethod();
    }
}
