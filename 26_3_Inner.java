public class OuterClass {
    private int privateField = 10;
    protected int protectedField = 20;
    public int publicField = 30;
    int defaultField = 40;

    private void privateMethod() {
        System.out.println("Private method in OuterClass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in OuterClass");
    }

    public void publicMethod() {
        System.out.println("Public method in OuterClass");
    }

    void defaultMethod() {
        System.out.println("Default method in OuterClass");
    }

    class InnerClass {
        private int privateInnerField = 50;
        protected int protectedInnerField = 60;
        public int publicInnerField = 70;
        int defaultInnerField = 80;

        private void privateInnerMethod() {
            System.out.println("Private method in InnerClass");
        }

        protected void protectedInnerMethod() {
            System.out.println("Protected method in InnerClass");
        }

        public void publicInnerMethod() {
            System.out.println("Public method in InnerClass");
        }

        void defaultInnerMethod() {
            System.out.println("Default method in InnerClass");
        }
    }

    public void accessInnerClassFieldsAndMethods() {
        InnerClass inner = new InnerClass();

        // Доступ к полям внутреннего класса
        // Доступ НЕ имеется, т.к. private поля доступны только внутри внутреннего класса
        // System.out.println(inner.privateInnerField); // Ошибка

        // Доступ имеется, т.к. protected поля доступны в пределах класса-наследника или в том же пакете
        System.out.println(inner.protectedInnerField); // Доступ имеется

        // Доступ имеется, т.к. public поля доступны всем
        System.out.println(inner.publicInnerField); // Доступ имеется

        // Доступ имеется, т.к. поля с default доступные в пределах одного пакета
        System.out.println(inner.defaultInnerField); // Доступ имеется

        // Доступ к методам внутреннего класса
        // Доступ НЕ имеется, т.к. private методы доступны только внутри внутреннего класса
        // inner.privateInnerMethod(); // Ошибка

        // Доступ имеется, т.к. protected методы доступны в пределах класса-наследника или в том же пакете
        inner.protectedInnerMethod(); // Доступ имеется

        // Доступ имеется, т.к. public методы доступны всем
        inner.publicInnerMethod(); // Доступ имеется

        // Доступ имеется, т.к. методы с default доступны в пределах одного пакета
        inner.defaultInnerMethod(); // Доступ имеется
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClassFieldsAndMethods();
    }
}
