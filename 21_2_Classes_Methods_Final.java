// Класс, объявленный как final
final class A {
    public void display() {
        System.out.println("Display method in class A");
    }
}

// Попытка наследования от final класса приведет к ошибке компиляции
// class B extends A {  // Ошибка компиляции: нельзя наследоваться от final класса
//     public void display() {
//         System.out.println("Display method in class B");
//     }
// }

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.display();  // Вызов метода класса A
    }
}
