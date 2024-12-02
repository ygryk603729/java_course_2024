public class A {
    public final int a;

    // Вариант 1: Инициализация в конструкторе
    public A(int value) {
        a = value; // Константа инициализируется в конструкторе
    }

    // Вариант 2: Инициализация при объявлении
    public static final int b = 10; // Можно объявить и проинициализировать константу напрямую

    public static void main(String[] args) {
        A obj = new A(5); // Создание объекта и инициализация a через конструктор
        System.out.println(obj.a); // Печатает 5

        // В случае с b, значение всегда 10, так как это константа
        System.out.println(A.b); // Печатает 10
    }
}
