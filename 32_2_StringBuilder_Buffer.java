public class StringConversionDemo {
    public static void main(String[] args) {
        // Преобразование из String в StringBuilder
        String str = "Hello, World!";
        StringBuilder sb = new StringBuilder(str); // Конструктор StringBuilder принимает строку
        System.out.println("StringBuilder: " + sb); // Выведет: Hello, World!

        // Преобразование из String в StringBuffer
        StringBuffer sbf = new StringBuffer(str); // Конструктор StringBuffer принимает строку
        System.out.println("StringBuffer: " + sbf); // Выведет: Hello, World!

        // Преобразование из StringBuilder в String
        String strFromSB = sb.toString(); // Метод toString() возвращает строку из StringBuilder
        System.out.println("String from StringBuilder: " + strFromSB); // Выведет: Hello, World!

        // Преобразование из StringBuffer в String
        String strFromSBF = sbf.toString(); // Метод toString() возвращает строку из StringBuffer
        System.out.println("String from StringBuffer: " + strFromSBF); // Выведет: Hello, World!

        // Преобразование из StringBuilder в StringBuffer
        StringBuffer sbfFromSB = new StringBuffer(sb.toString()); // Конструктор StringBuffer принимает строку
        System.out.println("StringBuffer from StringBuilder: " + sbfFromSB); // Выведет: Hello, World!

        // Преобразование из StringBuffer в StringBuilder
        StringBuilder sbFromSBF = new StringBuilder(sbf.toString()); // Конструктор StringBuilder принимает строку
        System.out.println("StringBuilder from StringBuffer: " + sbFromSBF); // Выведет: Hello, World!
    }
}
