public class Main {
    public static void main(String[] args) {

        // Создаем объекты разных типов
        Animal animal = new Animal();  // Объект типа Animal
        Dog dog = new Dog();            // Объект типа Dog
        Cat cat = new Cat();            // Объект типа Cat
        
        // Используем оператор instanceof для проверки типа объектов
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal)); // true
        // animal является экземпляром класса Animal, поэтому результат true
        
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal)); //true
        // dog является экземпляром класса Dog, который наследуется от Animal, поэтому результат true
        
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog)); //true
        // dog является экземпляром класса Dog, поэтому результат tru
        
        System.out.println("cat instanceof Dog: " + (cat instanceof Dog)); // false
        // cat не является экземпляром класса Dog, поэтому результат false
        
        // Пример с null
        Dog nullDog = null;
        System.out.println("nullDog instanceof Dog: " + (nullDog instanceof Dog)); // false
        // При применении instanceof к переменной null всегда возвращается false,
        // так как null не может быть экземпляром какого-либо класса
    }
}

// Родительский класс
class Animal {
}

// Подкласс
class Dog extends Animal {
}
class Cat extends Animal {
}
