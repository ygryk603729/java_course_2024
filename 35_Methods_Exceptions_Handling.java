public class ExceptionHandlingExample {

    /*==========================
    Практика #1
    Пример с генерацией двух исключений, одно из которых будет перехвачено, а другое приведет к аварийной остановке.
    */

    public static void main(String[] args) {
        try {
            // Генерация первого исключения - перехвачено
            int result = 10 / 0; // Деление на ноль вызывает ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException перехвачено: Деление на ноль");
        }

        // Генерация второго исключения - аварийная остановка
        String str = null;
        int length = str.length(); // Здесь возникнет NullPointerException, который не будет перехвачен
    }
}
