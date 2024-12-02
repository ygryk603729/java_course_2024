class Animal {
    // Переопределяемый метод
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Переопределенный метод
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
}
