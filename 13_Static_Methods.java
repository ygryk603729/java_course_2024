public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a); // Печатает значение переменной a
        System.out.println(b); // Печатает значение переменной b (по умолчанию 0)
    }

    public static void main(String[] args) {
        // Вызов статического метода через имя класса
        A.printVars(); // Печатает: 1, 0

        // Вызов статического метода через экземпляр класса
        A obj = new A();
        obj.printVars(); // Печатает: 1, 0

        // Статический метод можно вызвать даже без создания объекта, используя ссылку на экземпляр
        obj.a = 10; // Изменение значения переменной a через объект
        A.printVars(); // Печатает: 10, 0
    }
}
