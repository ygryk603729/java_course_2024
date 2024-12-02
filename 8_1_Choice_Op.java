public class Main {
    public static void main(String[] args) {
        // Пример с типом byte
        byte byteVal = 1;
        switch (byteVal) {
            case 1:
                System.out.println("Byte: 1");
                break;
            case 2:
                System.out.println("Byte: 2");
                break;
            default:
                System.out.println("Byte: default");
        }

        // Пример с типом short
        short shortVal = 2;
        switch (shortVal) {
            case 1:
                System.out.println("Short: 1");
                break;
            case 2:
                System.out.println("Short: 2");
                break;
            default:
                System.out.println("Short: default");
        }

        // Пример с типом int
        int intVal = 3;
        switch (intVal) {
            case 1:
                System.out.println("Int: 1");
                break;
            case 2:
                System.out.println("Int: 2");
                break;
            case 3:
                System.out.println("Int: 3");
                break;
            default:
                System.out.println("Int: default");
        }

        // Пример с типом char
        char charVal = 'A';
        switch (charVal) {
            case 'A':
                System.out.println("Char: A");
                break;
            case 'B':
                System.out.println("Char: B");
                break;
            default:
                System.out.println("Char: default");
        }

        // Пример с типом String
        String stringVal = "hello";
        switch (stringVal) {
            case "hello":
                System.out.println("String: hello");
                break;
            case "world":
                System.out.println("String: world");
                break;
            default:
                System.out.println("String: default");
        }

        // Пример с типом enum
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Enum: Monday");
                break;
            case TUESDAY:
                System.out.println("Enum: Tuesday");
                break;
            default:
                System.out.println("Enum: Other day");
        }
    }

    // Пример enum для switch
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }
}
