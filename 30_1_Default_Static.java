/*==========================
Практика №1*/

interface MyInterface {
    // Абстрактный метод (без реализации)
    void abstractMethod();

    // Неабстрактный метод с реализацией
    default void defaultMethod() {
        System.out.println("Default method implementation");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("Static method implementation");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Вызов необязательного метода интерфейса
        myClass.defaultMethod();  // Выведет: Default method implementation

        // Вызов абстрактного метода, реализованного в классе
        myClass.abstractMethod();  // Выведет: Abstract method implemented

        // Вызов статического метода интерфейса
        MyInterface.staticMethod();  // Выведет: Static method implementation
    }
}
