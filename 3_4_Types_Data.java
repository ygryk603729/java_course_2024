public class Main {
    public static void main(String[] args) {
        // Пример перегрузки оператора "+" для объектов типа String и переменных других типов

        // Переменная типа String
        String str = "Привет, ";

        // Переменные других типов
        int num = 5;
        double pi = 3.14;
        boolean isJavaFun = true;

        // Используем оператор "+" для объединения строк с переменными других типов
        String result = str + num; // Конкатенация строки и числа (int)
        System.out.println(result); // Вывод: Привет, 5

        result = str + pi; // Конкатенация строки и числа с плавающей точкой (double)
        System.out.println(result); // Вывод: Привет, 3.14

        result = str + isJavaFun; // Конкатенация строки и булевского значения (boolean)
        System.out.println(result); // Вывод: Привет, true

        // Пример использования оператора "+" для сложения строк с объектами
        String name = "Игорь";
        String greeting = "Привет, " + name; // Конкатенация строки и объекта String
        System.out.println(greeting); // Вывод: Привет, Игорь
    }
}
