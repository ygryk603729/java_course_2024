class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Ошибка: метод должен быть с сигнатурой public void speak(), но неверный тип параметра
    @Override
    public void speak(String sound) {  // ошибка: неверная сигнатура метода
        System.out.println("Dog barks: " + sound);
    }
}
