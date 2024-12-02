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
        void accessOuterFieldsAndMethods() {
            // Доступ к полям
            System.out.println("InnerClass accessing fields of OuterClass:");
            System.out.println("privateField: " + privateField);
            System.out.println("protectedField: " + protectedField);
            System.out.println("publicField: " + publicField);
            System.out.println("defaultField: " + defaultField);

            // Доступ к методам
            privateMethod();
            protectedMethod();
            publicMethod();
            defaultMethod();
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessOuterFieldsAndMethods();
    }
}

