class A {
    public static void staticMethod() {
        System.out.println("Static method in A");
    }
}

class B extends A {
    public static void staticMethod() {
        System.out.println("Static method in B");
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        A objB = new B();
        
        objA.staticMethod();  // вызовет staticMethod() из A
        objB.staticMethod();  // вызовет staticMethod() из A, а не из B
    }
}
