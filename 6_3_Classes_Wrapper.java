public class Main {
    public static void main(String[] args) {
        
        // Пример, где возникает NullPointerException при автораспаковке
        Integer nullableInteger = null; // Обертка Integer, равная null
        
        try {
            int value = nullableInteger; // Попытка автораспаковки, это вызывает исключение
        } catch (NullPointerException e) {
            System.out.println("NullPointerException пойман при автораспаковке!"); 
        }
    }
}
