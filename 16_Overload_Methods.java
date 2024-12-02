public class A {
    public void printNum(Integer i) {
        // Этот метод будет вызываться, если аргумент типа Integer
        System.out.printf("Integer = %d%n", i);
    }
    public void printNum(int i) {
        // Этот метод будет вызываться, если аргумент типа int (примитивный тип)
        System.out.printf("int = %d%n", i);
    }
    public void printNum(Float f) {
        // Этот метод будет вызываться, если аргумент типа Float
        System.out.printf("Float = %.4f%n", f);
    }
    public void printNum(Number n) {
        // Этот метод будет вызываться, если аргумент является объектом типа Number
        System.out.println("Number=" + n);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        // Создаем массив объектов типа Number, включающий различные типы данных
        Number[] num = {new Integer(1), 11, 1.11f, 11.11}; 
        
        // Цикл for (1)
        for (Number n : num) {
            // Здесь для каждого элемента массива будет вызываться подходящий метод
            // Важно: тип элемента массива (Number) будет приводиться к более специфичному типу
            // В зависимости от типа объекта, будет выбран нужный метод перегрузки
            a.printNum(n); 
        }
        
        // Вызовы (2)
        // Здесь явное указание типа аргумента, и вызываются методы перегрузки с учетом точного типа
        a.printNum(new Integer(1)); // вызывается printNum(Integer i)
        a.printNum(11); // вызывается printNum(int i), так как 11 — это примитивный int
        a.printNum(1.11f); // вызывается printNum(Float f), так как 1.11f — это примитивный float
        a.printNum(11.11); // вызывается printNum(Number n), так как 11.11 — это double, который является подтипом Number
    }
}
