public class Main {
    public static void main(String[] args) {
        // Пример 1: Преобразование double в int (сужающее преобразование)
        double doubleVar = 9.99;
        int intVar = (int) doubleVar; // Преобразуем double в int. Часть после запятой будет отброшена.
        System.out.println("double to int = " + intVar); // Вывод: 9

        // Пример 2: Преобразование long в int (сужающее преобразование)
        long longVar = 5000L;
        int intVar2 = (int) longVar; // Преобразуем long в int. Потенциальная потеря данных, если long больше диапазона int.
        System.out.println("long to int = " + intVar2); // Вывод: 5000

        // Пример 3: Преобразование float в byte (сужающее преобразование)
        float floatVar = 257.75f;
        byte byteVar = (byte) floatVar; // Преобразуем float в byte. Оставим только младшие 8 бит.
        System.out.println("float to byte = " + byteVar); // Вывод: 1 (из-за переполнения, 257 -> 1)

        // Пример 4: Преобразование char в byte (сужающее преобразование)
        char charVar = 'A';
        byte byteVar2 = (byte) charVar; // Преобразуем char в byte. Значение 'A' в ASCII (65) помещается в byte.
        System.out.println("char to byte = " + byteVar2); // Вывод: 65

        // Пример 5: Преобразование double в byte (сужающее преобразование)
        double doubleVar2 = 130.75;
        byte byteVar3 = (byte) doubleVar2; // Преобразуем double в byte. Часть данных будет потеряна (130 -> 130).
        System.out.println("double to byte = " + byteVar3); // Вывод: -126 (переполнение при сужении диапазона)
    }
}
