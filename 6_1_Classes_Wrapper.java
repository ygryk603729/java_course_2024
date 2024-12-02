public class Main {
    public static void main(String[] args) {
        
        // Пример использования метода decode() для декодирования строки в формате URL
        try {
            // Строка с закодированными символами
            String encodedString = "Hello%20World%21";
            System.out.println("Encoded String: " + encodedString);
            
            // Декодируем строку с помощью метода decode() из класса java.net.URLDecoder
            // %20 - пробел, %21 - восклицательный знак
            String decodedString = java.net.URLDecoder.decode(encodedString, "UTF-8");
            System.out.println("Decoded String: " + decodedString); // Вывод: "Hello World!"
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // Пример использования decode() для работы с Base64
        try {
            // Строка, закодированная в формате Base64
            String encodedBase64 = "SGVsbG8gd29ybGQh";
            System.out.println("Encoded Base64 String: " + encodedBase64);
            
            // Декодируем строку в Base64 с помощью метода decode() из класса java.util.Base64
            byte[] decodedBase64Bytes = java.util.Base64.getDecoder().decode(encodedBase64);
            String decodedBase64String = new String(decodedBase64Bytes);
            System.out.println("Decoded Base64 String: " + decodedBase64String); // Вывод: "Hello world!"
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
