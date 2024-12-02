public class Main {
    public static void main(String[] args) {
        // Пример использования перечисления
        System.out.println("Color: " + Color.RED.getColorInfo());
        System.out.println("Color: " + Color.GREEN.getColorInfo());
        System.out.println("Color: " + Color.BLUE.getColorInfo());
    }
}

// Собственное перечисление с дополнительным методом
enum Color {
    RED("Red color - often symbolizes passion and energy"),
    GREEN("Green color - often symbolizes nature and tranquility"),
    BLUE("Blue color - often symbolizes calm and stability");

    private String description;

    // Конструктор для инициализации описания цвета
    Color(String description) {
        this.description = description;
    }

    // Дополнительный метод для получения информации о цвете
    public String getColorInfo() {
        return description;
    }
}
