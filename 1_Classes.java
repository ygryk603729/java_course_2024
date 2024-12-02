// Пример использования принципа подстановки Лисков (Liskov Substitution Principle)
// Все классы наследуют общий интерфейс и корректно работают через его методы.

interface Bird {
    void move();
}

class Sparrow implements Bird {
    @Override
    public void move() {
        System.out.println("Воробей летает.");
    }
}

class Ostrich implements Bird {
    @Override
    public void move() {
        System.out.println("Страус бегает.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow(); // Подстановка: воробей как птица
        Bird ostrich = new Ostrich(); // Подстановка: страус как птица

        sparrow.move(); // Вывод: Воробей летает.
        ostrich.move(); // Вывод: Страус бегает.
    }
}
