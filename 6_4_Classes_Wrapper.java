public class Main {
    public static void main(String[] args) {
        int i1 = 128; // Значение вне диапазона IntegerCache
        Integer a1 = i1; // Автоупаковка
        Integer b1 = i1; // Автоупаковка
        
        // a1 и b1 ссылаются на разные объекты, так как 128 не кешируется
        System.out.println("a1==i1 " + (a1 == i1)); // true, a1 распаковывается в int
        System.out.println("b1==i1 " + (b1 == i1)); // true, b1 распаковывается в int
        System.out.println("a1==b1 " + (a1 == b1)); // false, разные объекты
        System.out.println("a1.equals(i1) -> " + a1.equals(i1)); // true, значения совпадают
        System.out.println("b1.equals(i1) -> " + b1.equals(i1)); // true, значения совпадают
        System.out.println("a1.equals(b1) -> " + a1.equals(b1)); // true, значения совпадают
        
        int i2 = 127; // Значение в диапазоне IntegerCache (-128 до 127)
        Integer a2 = i2; // Автоупаковка
        Integer b2 = i2; // Автоупаковка
        
        // a2 и b2 ссылаются на один объект из IntegerCache
        System.out.println("a2==i2 " + (a2 == i2)); // true, a2 распаковывается в int
        System.out.println("b2==i2 " + (b2 == i2)); // true, b2 распаковывается в int
        System.out.println("a2==b2 " + (a2 == b2)); // true, обе ссылки на один объект
        System.out.println("a2.equals(i2) -> " + a2.equals(i2)); // true, значения совпадают
        System.out.println("b2.equals(i2) -> " + b2.equals(i2)); // true, значения совпадают
        System.out.println("a2.equals(b2) -> " + a2.equals(b2)); // true, значения совпадают
    }
}


/*IntegerCache используется для кеширования значений Integer в диапазоне от -128 до 127.
Если значение находится в этом диапазоне,
ссылки на один и тот же объект возвращаются при автоупаковке. */