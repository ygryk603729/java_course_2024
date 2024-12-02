public class Main {
    public static void main(String[] args) {
        
        // 1. Создание экземпляра через конструктор
        Boolean bool1 = new Boolean(true);  // Используем конструктор, передаем значение типа boolean
        System.out.println("bool1: " + bool1);  // true

        // 2. Создание через метод valueOf() с параметром "TRUE"
        Boolean bool2 = Boolean.valueOf("TRUE");  // Строка "TRUE" (не чувствительно к регистру) возвращает true
        System.out.println("bool2: " + bool2);  // true
        
        // 3. Создание через method valueOf() с параметром "false"
        Boolean bool3 = Boolean.valueOf("false");  // Строка "false" возвращает false
        System.out.println("bool3: " + bool3);  // false
        
        // 4. Создание через valueOf() с другой строкой, которая не "true" или "false"
        Boolean bool4 = Boolean.valueOf("someString");  // Любая строка, не равная "true", возвращает false
        System.out.println("bool4: " + bool4);  // false
    }
}
