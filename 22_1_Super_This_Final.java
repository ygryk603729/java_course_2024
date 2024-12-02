class A {
    // Поля класса A
    int x = 10;

    // Конструктор класса A
    public A() {
        System.out.println("Конструктор A");
    }

    // Метод класса A
    public void display() {
        System.out.println("Метод display() из класса A");
    }
}

class B extends A {
    // Поле класса B
    int x = 20;

    // Конструктор класса B
    public B() {
        super();  // Вызов конструктора суперкласса A
        System.out.println("Конструктор B");
    }

    // Метод класса B
    public void display() {
        super.display();  // Вызов метода display() из суперкласса A
        System.out.println("Метод display() из класса B");
    }

    public void show() {
        System.out.println("x из класса B: " + x);  // x из класса B
        System.out.println("x из класса A: " + super.x);  // x из класса A
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();  // Создание объекта класса B, вызов конструктора
        b.display();    // Вызов метода display() из класса B
        b.show();       // Вызов метода show() из класса B
    }
}
