public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса
        Printer printer = new Printer();
        
        // Вызов метода с переменным числом параметров
        printer.printNumbers(1, 2, 3, 4, 5);  // передаем 5 чисел
        printer.printNumbers(10, 20);        // передаем 2 числа
        printer.printNumbers();              // передаем 0 чисел
    }
}

class Printer {
    // Метод с переменным числом параметров (перегрузка)
    public void printNumbers(int... numbers) {
        // numbers - это массив, содержащий все переданные аргументы
        if (numbers.length == 0) {
            System.out.println("No numbers to print.");
        } else {
            for (int num : numbers) {
                System.out.print(num + " ");  // Выводим каждое число
            }
            System.out.println();
        }
    }

    // Перегрузка метода с другим типом параметров
    public void printNumbers(String... strings) {
        if (strings.length == 0) {
            System.out.println("No strings to print.");
        } else {
            for (String str : strings) {
                System.out.print(str + " ");  // Выводим каждую строку
            }
            System.out.println();
        }
    }
}
