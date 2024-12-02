import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание массива для демонстрации методов
        Integer[] numbers = {5, 3, 8, 1, 2};

        // Пример использования toString()
        // Метод toString преобразует массив в строку
        System.out.println("Массив как строка: " + Arrays.toString(numbers));

        // Пример использования binarySearch()
        // Ищем индекс элемента (все элементы должны быть отсортированы для корректной работы)
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 3); // Ищем 3 в отсортированном массиве
        System.out.println("Индекс элемента 3: " + index);

        // Пример использования equals()
        Integer[] numbers2 = {1, 2, 3, 5, 8};
        boolean areEqual = Arrays.equals(numbers, numbers2);
        System.out.println("Массивы одинаковы: " + areEqual);

        // Пример использования compare()
        // Сравниваем два массива по лексикографическому порядку
        int comparisonResult = Arrays.compare(numbers, numbers2);
        if (comparisonResult > 0) {
            System.out.println("Первый массив больше");
        } else if (comparisonResult < 0) {
            System.out.println("Второй массив больше");
        } else {
            System.out.println("Массивы равны");
        }

        // Пример использования sort()
        // Сортируем массив
        Arrays.sort(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }
}
