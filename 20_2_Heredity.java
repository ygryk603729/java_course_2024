class A {
    // Пример полей с разными спецификаторами доступа
    int a1;           // Спецификатор по умолчанию (default) - доступно в том же пакете
    public int a2;    // public - доступно везде
    protected int a3; // protected - доступно в том же пакете и в подклассах
    private int a4;   // private - доступно только в своем классе

    // Методы с разными спецификаторами
    void method1() {   // default - доступен в том же пакете
        System.out.println("method1");
    }

    public void method2() {  // public - доступен везде
        System.out.println("method2");
    }

    protected void method3() {  // protected - доступен в том же пакете и в подклассах
        System.out.println("method3");
    }

    private void method4() {  // private - доступен только в своем классе
        System.out.println("method4");
    }
}

class B extends A {
    // Класс B наследует все поля и методы от A, но с ограничениями по доступности

    public void printInfo() {
        // Доступные члены класса A
        System.out.println(a2);  // public - доступен везде
        System.out.println(a3);  // protected - доступен в подклассе
        // System.out.println(a1);  // default - доступен только в том же пакете, если B в другом пакете, то ошибка
        // System.out.println(a4);  // private - доступен только в классе A, ошибка
    }

    @Override
    public void method2() {  // Переопределение public метода
        super.method2();  // доступно, так как метод public
    }

    @Override
    protected void method3() {  // Переопределение protected метода
        super.method3();  // доступно, так как метод protected
    }

    // @Override
    // private void method4() {}  // Ошибка, нельзя переопределить private метод
}

class C extends B {
    // Класс C также наследует от B
    public void accessMethods() {
        // Доступ к методам и полям класса B
        method2();  // public, доступен
        method3();  // protected, доступен
        // method1();  // default - доступен только в том же пакете
        // method4();  // private - не доступен
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.accessMethods();  // Вызываем методы из класса C
    }
}
