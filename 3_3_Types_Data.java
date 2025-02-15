public class Main {
    public static void main(String[] args) {
        int a = 1;
        {
            int b = 2; // Переменная b доступна только в этом блоке
        }
        
        // int c = a + b; // Ошибка компиляции: переменная b не доступна за пределами блока
        
        // Объяснение:
        // В строке "int c = a + b;" возникает ошибка компиляции, потому что переменная b была объявлена
        // внутри блока, и её область видимости ограничена только этим блоком. После окончания блока b становится
        // недоступной, и попытка использовать её за пределами блока вызывает ошибку.
        // Значение переменной c не может быть вычислено, так как переменная b не существует в этой области видимости.

        // Поэтому этот код не скомпилируется и не выполнится.
    }
}
