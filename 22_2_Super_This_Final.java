class A {
    int a;  // Поле a класса A

    void method() {
        System.out.println("Метод из класса A");
    }
}

class B extends A {
    // Класс B не содержит поля a и метод method
}

class C extends B {
    void method() {
        System.out.println("Метод из класса C");
        int a = super.a;   // Доступ к полю a из класса A через super
        super.method();    // Вызов метода method() из класса A
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.method();  // Вызов метода method() объекта класса C
    }
}
