/**
 * Класс для демонстрации использования утилиты javadoc.
 * @author Ваше имя
 * @version 1.0
 */
public class Example {

    /**
     * Метод main, точка входа в программу.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Пример вызова метода с документацией
        System.out.println(getGreeting("Игорь"));
    }

    /**
     * Метод, который генерирует приветственное сообщение.
     * @param name имя пользователя
     * @return строка с приветствием
     */
    public static String getGreeting(String name) {
        return "Привет, " + name + "!";
    }
}
