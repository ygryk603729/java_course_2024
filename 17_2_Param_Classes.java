import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Пример использования <? extends T> (граница сверху)
        List<? extends Number> listExtends = new ArrayList<>();
        // Этот список может содержать типы, являющиеся подтипами Number, например, List<Integer>, List<Double>
        
        // Мы не можем добавлять элементы в listExtends, кроме null, так как точный тип неизвестен
        // listExtends.add(10);  // Ошибка компиляции, тип неизвестен
        
        // Получать элементы можно как Number или его подклассы
        // Number num = listExtends.get(0);  // Это работает

        
        // Пример использования <? super T> (граница снизу)
        List<? super Integer> listSuper = new ArrayList<>();
        // Этот список может содержать Integer, Number, или даже Object
        
        listSuper.add(10);  // Это допустимо, так как Integer является подтипом Number и Object
        
        // Мы не можем безопасно извлекать элементы, так как точный тип неизвестен
        // Integer num = (Integer) listSuper.get(0);  // Ошибка компиляции, тип неизвестен

        
        // Практическое применение
        List<Number> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(3.14);

        printNumbers(numberList); // Применение <? extends Number>

        List<Object> objectList = new ArrayList<>();
        objectList.add(10);
        objectList.add("Hello");

        addNumbers(objectList);  // Применение <? super Integer>
    }

    // Метод, который использует <? extends Number>
    // Можно передавать List<Integer>, List<Double>, List<Number> и т.д.
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);  // Мы можем извлечь элементы как Number
        }
    }

    // Метод, который использует <? super Integer>
    // Можно передавать List<Integer>, List<Number>, List<Object> и т.д.
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);  // Мы можем добавлять Integer и его подклассы
    }
}
