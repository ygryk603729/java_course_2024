/*==========================
Практика #1
Пример использования подкласса класса InputStream (например, FileInputStream) для демонстрации работы метода read().
*/
import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);  // выводим символы из файла
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*==========================
Практика #2
Пример использования подкласса класса OutputStream (например, FileOutputStream) для демонстрации работы метода write(int).
*/
import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String data = "Hello, World!";
            for (int i = 0; i < data.length(); i++) {
                fos.write(data.charAt(i));  // записываем символы в файл
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*==========================
Практика #3
Ответ: Дополнительные иерархии, основанные на абстрактных классах Reader и Writer, предназначены для работы с текстовыми данными.
InputStream и OutputStream работают с байтовыми данными, а Reader и Writer - с символьными.
Reader и Writer предоставляют методы, специфичные для работы с текстом, например, read() и write() работают с символами, а не с байтами.
*/
/*==========================
Практика #4
Интерфейс AutoCloseable нужен для автоматического закрытия ресурсов, таких как потоки ввода/вывода, базы данных и другие. Он предоставляет метод close(), который гарантированно будет вызван после завершения работы с ресурсом, даже если произошли исключения.

Пример:
*/
import java.io.*;

public class AutoCloseableExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // После выхода из блока try, файл автоматически закрывается, благодаря AutoCloseable
    }
}
