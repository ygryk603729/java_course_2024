/*==========================
Практика №1*/

/* @Override */
class A {
    public void display() {
        System.out.println("Display in A");
    }
}

class B extends A {
    @Override
    public void display() {  // Использование аннотации @Override для явного указания на переопределение метода.
        System.out.println("Display in B");
    }
}

/* @Deprecated */
class OldClass {
    @Deprecated  // Аннотация @Deprecated указывает, что метод устарел и его не следует использовать.
    public void oldMethod() {
        System.out.println("This method is outdated");
    }
}

class Test {
    public static void main(String[] args) {
        B b = new B();
        b.display();  // Выведет: Display in B

        OldClass oldClass = new OldClass();
        oldClass.oldMethod();  // Важно: метод помечен как устаревший, но код все равно компилируется
    }
}

/* @SuppressWarnings */
class Example {
    @SuppressWarnings("unchecked")  // Используется для подавления предупреждений компилятора, например, по поводу типов.
    public void suppressWarningExample() {
        Object obj = new String("Hello");
        String str = (String) obj;  // Здесь будет предупреждение о небезопасном приведении типов, которое подавляется.
        System.out.println(str);
    }
}
