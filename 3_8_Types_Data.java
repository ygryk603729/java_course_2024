public class Main {
    public static void main(String[] args) {
        // Пример с использованием var
        var message = "Hello, world!"; // var автоматически определяет тип как String
        System.out.println("Message: " + message); // Вывод: Hello, world!
        
        // Пример с интерфейсом (type interface)
        // Interface используется для определения абстрактных методов, которые должны быть реализованы в классах, использующих этот интерфейс.
        
        // Создаем интерфейс
        interface Animal {
            void sound(); // Абстрактный метод
        }

        // Создаем класс, который реализует интерфейс
        class Dog implements Animal {
            public void sound() {
                System.out.println("Woof!"); // Реализация метода sound
            }
        }

        // Используем var для определения типа объекта
        var dog = new Dog(); // var позволяет не указывать тип явно, компилятор определяет его автоматически как Dog
        dog.sound(); // Вывод: Woof!
    }
}
