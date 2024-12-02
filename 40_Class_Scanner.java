/*==========================
Практика #1
Пример кода для чтения данных из текстового файла с помощью Scanner.
*/

import java.io.*;
import java.util.Scanner;

public class FileScannerExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("input.txt"))) {  // Создаем Scanner для чтения файла
            while (scanner.hasNextLine()) {  // Пока есть строки в файле
                String line = scanner.nextLine();  // Чтение строки из файла
                System.out.println(line);  // Выводим строку на экран
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();  // Обработка исключения, если файл не найден
        }
    }
}
