// Пример использования ключевых слов this и super

class Animal {
    String name;

    // Конструктор класса Animal
    public Animal(String name) {
        this.name = name; // Использование this для доступа к полям текущего объекта
    }

    // Метод для печати информации о животном
    public void printInfo() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    int age;

    // Конструктор класса Dog, вызывающий конструктор родительского класса Animal
    public Dog(String name, int age) {
        super(name);  // Использование super для вызова конструктора родительского класса
        this.age = age;  // Использование this для доступа к полям текущего объекта
    }

    // Переопределение метода для вывода информации о собаке
    @Override
    public void printInfo() {
        super.printInfo(); // Использование super для вызова метода родительского класса
        System.out.println("Dog age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объекта подкласса Dog
        Dog dog = new Dog("Buddy", 5);
        dog.printInfo();  // Вызов метода printInfo() для объекта Dog
    }
}
