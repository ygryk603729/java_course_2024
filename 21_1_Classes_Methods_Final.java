class A {
    // Метод final не может быть переопределен в подклассе
    public final void display() {
        System.out.println("Display method in class A");
    }
}

class B extends A {
    // Попытка переопределить final-метод приведет к ошибке компиляции
    // @Override
    // public void display() {
    //     System.out.println("Display method in class B");
    // }

    public void anotherMethod() {
        System.out.println("Another method in class B");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.display();  // Вызов final метода из класса A

        B b = new B();
        b.display();  // Вызов final метода из класса A, так как B не может переопределить display
    }
}


/* Результат
Display method in class A
Display method in class A
 */