public class Main {
    public static void main(String[] args) {
        // Используем элементы перечисления
        System.out.println(Day.MONDAY.getMessage());
        System.out.println(Day.FRIDAY.getMessage());
    }
}

// Перечисление с инициализацией элементов
enum Day {
    MONDAY("Start of the week"),
    TUESDAY("Second day"),
    WEDNESDAY("Middle of the week"),
    THURSDAY("Almost there"),
    FRIDAY("Last workday"),
    SATURDAY("Weekend begins"),
    SUNDAY("Relax day");

    private String message;

    // Конструктор для инициализации каждого элемента перечисления
    Day(String message) {
        this.message = message;
    }

    // Метод для получения сообщения
    public String getMessage() {
        return message;
    }
}
