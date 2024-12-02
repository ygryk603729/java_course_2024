interface OuterInterface {
    void outerMethod();

    // Вложенный класс в интерфейсе
    class NestedClass {
        void nestedMethod() {
            System.out.println("Method in NestedClass");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра вложенного класса
        OuterInterface.NestedClass nested = new OuterInterface.NestedClass();

        // Вызов метода вложенного класса
        nested.nestedMethod(); // Метод в NestedClass
    }
}
