public class Main {
    public static void main(String[] args) {
        
        // Операторы с наименьшим приоритетом
        int a = 5, b = 10, c;
        
        // Оператор присваивания (=)
        c = a + b; // Присваиваем результат сложения переменных a и b переменной c
        System.out.println("c = a + b: " + c); // c = 15

        // Оператор +=
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c); // c = 20
        
        // Оператор -=
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c); // c = 17
        
        // Оператор *=
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c); // c = 34
        
        // Оператор /=
        c /= 2; // c = c / 2
        System.out.println("c /= 2: " + c); // c = 17
        
        // Оператор %=
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c); // c = 2

        // Оператор тернарного условия ?:
        String result = (a > b) ? "a больше b" : "a не больше b";
        System.out.println("Тернарный оператор: " + result); // a не больше b
        
        // Логические операторы
        boolean x = true, y = false;
        
        // Оператор ||
        System.out.println("x || y: " + (x || y)); // true

        // Оператор &&
        System.out.println("x && y: " + (x && y)); // false
        
        // Побитовые операторы
        int d = 12, e = 5;
        
        // Оператор |
        System.out.println("d | e: " + (d | e)); // 13 (10012 | 01012 = 11012)
        
        // Оператор ^
        System.out.println("d ^ e: " + (d ^ e)); // 9 (10012 ^ 01012 = 01012)
        
        // Оператор &
        System.out.println("d & e: " + (d & e)); // 4 (10012 & 01012 = 01012)

        // Оператор сравнения ==
        System.out.println("a == b: " + (a == b)); // false
        
        // Операторы сравнения >, >=, <, <=
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("a <= b: " + (a <= b)); // true
        
        // Операторы сдвига: >>, >>>, <<
        int f = 16; // 10000 в двоичной системе
        
        // Оператор >>
        System.out.println("f >> 2: " + (f >> 2)); // 4 (10000 >> 2 = 100)
        
        // Оператор >>>
        System.out.println("f >>> 2: " + (f >>> 2)); // 4 (10000 >>> 2 = 100)
        
        // Оператор <<
        System.out.println("f << 2: " + (f << 2)); // 64 (10000 << 2 = 1000000)
        
        // Арифметические операторы +, -, *, /, %
        
        // Оператор +
        int sum = a + b;
        System.out.println("a + b: " + sum); // 15
        
        // Оператор -
        int difference = a - b;
        System.out.println("a - b: " + difference); // -5
        
        // Оператор *
        int product = a * b;
        System.out.println("a * b: " + product); // 50
        
        // Оператор /
        int quotient = b / a;
        System.out.println("b / a: " + quotient); // 2
        
        // Оператор %
        int remainder = b % a;
        System.out.println("b % a: " + remainder); // 0
        
        // Операторы инкремента и декремента ++, -- и побитовый оператор ~ и логический оператор !
        
        // Префиксный инкремент
        System.out.println("++a: " + (++a)); // 6
        
        // Постфиксный инкремент
        System.out.println("a++: " + (a++)); // 6
        System.out.println("a после a++: " + a); // 7
        
        // Префиксный декремент
        System.out.println("--b: " + (--b)); // 9
        
        // Постфиксный декремент
        System.out.println("b--: " + (b--)); // 9
        System.out.println("b после b--: " + b); // 8
        
        // Побитовый оператор ~ (инверсия всех битов)
        int g = 5; // 0101 в двоичной системе
        System.out.println("~g: " + (~g)); // -6, инверти
