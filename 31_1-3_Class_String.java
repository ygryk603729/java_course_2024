/*==========================
Практика №1*/

public class StringMethodsDemo {
    public static void main(String[] args) {
        // 1. length() - возвращает длину строки
        String str1 = "Hello, World!";
        System.out.println("Length of str1: " + str1.length());  // Выведет: 13

        // 2. charAt() - возвращает символ по указанному индексу
        System.out.println("Character at index 7: " + str1.charAt(7));  // Выведет: W

        // 3. toUpperCase() - преобразует строку в верхний регистр
        System.out.println("Uppercase: " + str1.toUpperCase());  // Выведет: HELLO, WORLD!

        // 4. toLowerCase() - преобразует строку в нижний регистр
        System.out.println("Lowercase: " + str1.toLowerCase());  // Выведет: hello, world!

        // 5. substring() - извлекает подстроку из строки
        System.out.println("Substring from index 7: " + str1.substring(7));  // Выведет: World!

        // 6. contains() - проверяет, содержится ли подстрока в строке
        System.out.println("Contains 'World': " + str1.contains("World"));  // Выведет: true

        // 7. replace() - заменяет все вхождения подстроки на другую строку
        System.out.println("Replaced 'World' with 'Java': " + str1.replace("World", "Java"));  // Выведет: Hello, Java!

        // 8. startsWith() - проверяет, начинается ли строка с заданного префикса
        System.out.println("Starts with 'Hello': " + str1.startsWith("Hello"));  // Выведет: true

        // 9. endsWith() - проверяет, заканчивается ли строка заданным суффиксом
        System.out.println("Ends with '!': " + str1.endsWith("!"));  // Выведет: true

        // 10. trim() - удаляет пробелы в начале и в конце строки
        String str2 = "  Hello, World!  ";
        System.out.println("Trimmed string: '" + str2.trim() + "'");  // Выведет: 'Hello, World!'
    }
}

/*==========================
Практика №2*/

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // Создание StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");
        System.out.println(joiner.toString());  // Выведет: Apple, Banana, Cherry

        // Использование другого разделителя и строки в начале и конце
        StringJoiner joinerWithPrefixSuffix = new StringJoiner(" | ", "[", "]");
        joinerWithPrefixSuffix.add("Java");
        joinerWithPrefixSuffix.add("Python");
        joinerWithPrefixSuffix.add("C++");
        System.out.println(joinerWithPrefixSuffix.toString());  // Выведет: [Java | Python | C++]
    }
}

/*==========================
Практика №3*/

public class TripleQuotes {
    public static void main(String[] args) {
        // Три двойные кавычки в строках Java — это синтаксическое средство для создания многострочных строковых литералов (Java 13+).
        String multiLineString = """
                This is a multi-line string.
                It can span across multiple lines.
                Java handles this automatically.
                """;
        System.out.println(multiLineString);
    }
}
