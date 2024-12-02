// Собственное исключение

// Класс исключения
class MyCustomException extends Exception {
    // Конструктор, принимающий сообщение об ошибке
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Генерация собственного исключения
            throw new MyCustomException("Это собственное исключение!");
        } catch (MyCustomException e) {
            // Обработка собственного исключения
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}
