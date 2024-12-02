public class MultipleExceptionHandling {

    /*==========================
    Практика #1
    Пример, в котором продемонстрированы следующие ситуации:
    - несколько исключений обрабатываются абсолютно идентичным образом;
    - исключения образуют иерархию Ex1 <|-- Ex2 <|-- Ex3.
    */

    public static void main(String[] args) {
        try {
            // Генерация исключений
            throw new Ex3(); // Это исключение является экземпляром Ex3, которое является подклассом Ex2 и Ex1
        } catch (Ex1 | Ex2 | Ex3 e) {
            // Обработка всех исключений одинаковым образом
            System.out.println("Исключение перехвачено: " + e.getClass().getSimpleName());
        }
    }
}

// Базовое исключение
class Ex1 extends Exception {}

// Подкласс Ex1
class Ex2 extends Ex1 {}

// Подкласс Ex2
class Ex3 extends Ex2 {}



/*==========================
Практика #2
Что означает использование final при в данном объявлении?
try {
   ...
} catch (final Exception e) {
   ...
}
*/

