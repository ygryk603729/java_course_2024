public class Main {
    public static void main(String[] args) {
        // Примеры для всех базовых типов данных с нулевыми значениями

        // Целые числа
        byte b = 0; // byte
        short s = 0; // short
        int i = 0; // int
        long l = 0L; // long

        // Числа с плавающей точкой
        float f = 0.0f; // float
        double d = 0.0; // double

        // Символьный тип
        char c = '\u0000'; // char (нулевой символ)

        // Логический тип
        boolean bool = false; // boolean

        // Строка
        String str = null; // String (нулевое значение для объекта)

        // Выводим все значения
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: '" + c + "'"); // Печатает пустой символ
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str); // null
    }
}
