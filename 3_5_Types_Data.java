public class Main {
    public static void main(String[] args) {
        // Пример 1: Сложение int и double
        int intVar = 5;
        double doubleVar = 3.2;
        double result1 = intVar + doubleVar; // int преобразуется в double перед сложением
        System.out.println("int + double = " + result1); // Вывод: 8.2

        // Пример 2: Умножение float и long
        float floatVar = 2.5f;
        long longVar = 10L;
        float result2 = floatVar * longVar; // long преобразуется в float перед умножением
        System.out.println("float * long = " + result2); // Вывод: 25.0

        // Пример 3: Деление double и int
        double result3 = doubleVar / intVar; // int преобразуется в double перед делением
        System.out.println("double / int = " + result3); // Вывод: 0.64

        // Пример 4: Сложение int и String
        String str = "Число: ";
        String result4 = str + intVar; // int преобразуется в String перед конкатенацией
        System.out.println("String + int = " + result4); // Вывод: Число: 5

        // Пример 5: Сложение char и int
        char charVar = 'A';
        int result5 = charVar + intVar; // char преобразуется в его числовое значение (ASCII) перед сложением
        System.out.println("char + int = " + result5); // Вывод: 70 (ASCII для 'A' = 65, 65 + 5 = 70)
    }
}
