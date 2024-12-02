public class Main {
    public static void main(String[] args) {
        // Создаем объект параметризованного класса для типа Integer
        Box<Integer> boxInt = new Box<>(10);
        
        // Создаем объект параметризованного класса для типа String
        Box<String> boxStr = new Box<>("Hello");

        // Использование instanceof с объектами параметризованных классов
        // Проверяем, является ли объект boxInt экземпляром класса Box с параметром Integer
        System.out.println(boxInt instanceof Box<?>); // true, так как boxInt это объект типа Box<Integer>
        System.out.println(boxInt instanceof Box<Integer>); // true, так как boxInt это объект Box<Integer>
        
        // Проверяем, является ли объект boxStr экземпляром класса Box с параметром String
        System.out.println(boxStr instanceof Box<?>); // true, так как boxStr это объект типа Box<String>
        System.out.println(boxStr instanceof Box<String>); // true, так как boxStr это объект Box<String>

        // Использование instanceof для проверки на родительский класс без параметра
        System.out.println(boxInt instanceof Object); // true, так как все классы наследуют Object

        // Проверка на неверный параметр типа
        System.out.println(boxInt instanceof Box<String>); // false, так как boxInt это Box<Integer>, а не Box<String>
    }
}

// Параметризованный класс Box
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
