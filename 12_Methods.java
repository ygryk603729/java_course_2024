// Перегрузка методов (Overloading)
class Calculator {

    // Перегрузка метода add с разными параметрами
    public int add(int a, int b) {
        return a + b;
    }

    // Перегрузка метода add для трех чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегрузка метода add для чисел с плавающей точкой
    public double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    // Переопределение метода sound в классе-наследнике
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Переопределение метода sound для класса Dog
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        // Перегрузка методов
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(5, 3)); // Используется метод add(int, int)
        System.out.println("Sum of 3 numbers: " + calc.add(5, 3, 2)); // Используется метод add(int, int, int)
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 3.3)); // Используется метод add(double, double)

        // Переопределение методов
        Animal animal = new Animal();
        animal.sound(); // Вызов метода sound из базового класса

        Dog dog = new Dog();
        dog.sound(); // Вызов переопределенного метода sound из класса Dog
    }
}

