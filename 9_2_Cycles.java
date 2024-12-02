public class Main {
    public static void main(String[] args) {
        // Пример использования break
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Прерываем цикл на числе: " + i);
                break; // Выход из цикла, когда i равно 5
            }
            System.out.println("Текущее значение: " + i);
        }

        System.out.println("-------------------");

        // Пример использования continue
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Пропускаем текущую итерацию для чётных чисел
            }
            System.out.println("Нечётное значение: " + i);
        }
    }
}