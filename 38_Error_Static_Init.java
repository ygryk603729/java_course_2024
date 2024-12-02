public class App {
    final static int START_COUNTER;
    static {
      // Ошибка: NumberFormatException, так как строка "Y-" не может быть преобразована в целое число
      START_COUNTER = Integer.parseInt("Y-");
    }
    public static void main(String[] args) {
      // Строка "Hello" не будет выведена, так как программа завершится с исключением на этапе статической инициализации
      System.out.println("Hello");
    }
  }
  