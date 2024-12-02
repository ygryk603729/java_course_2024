// Пример демонстрации спецификаторов доступа

class AccessModifiersExample {

    // public - доступен везде
    public int publicVar = 1;

    // protected - доступен в пределах пакета и в наследниках
    protected int protectedVar = 2;

    // private - доступен только внутри класса
    private int privateVar = 3;

    // default (без спецификатора) - доступен только в пределах пакета
    int defaultVar = 4;

    public void displayValues() {
        // Внутри класса можно обращаться ко всем переменным
        System.out.println("publicVar: " + publicVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("privateVar: " + privateVar);
        System.out.println("defaultVar: " + defaultVar);
    }
}

class SubClass extends AccessModifiersExample {

    public void displayInheritedValues() {
        // Наследуемые члены с доступом protected доступны
        System.out.println("protectedVar (in subclass): " + protectedVar);

        // privateVar недоступен в наследнике
        // System.out.println("privateVar (in subclass): " + privateVar); // Ошибка
    }
}

public class Main {
    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();
        obj.displayValues();

        // Доступность в разных частях программы
        System.out.println("publicVar: " + obj.publicVar); // доступен везде
        // System.out.println("protectedVar: " + obj.protectedVar); // ошибка, вне пакета нельзя
        // System.out.println("privateVar: " + obj.privateVar); // ошибка, private
        // System.out.println("defaultVar: " + obj.defaultVar); // ошибка, вне пакета

        // Создание экземпляра подкласса
        SubClass subObj = new SubClass();
        subObj.displayInheritedValues();
    }
}
