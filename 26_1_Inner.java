public class OuterClass {
    private int outerPrivate = 10;
    protected int outerProtected = 20;
    public int outerPublic = 30;
    int outerDefault = 40;

    // Внутренний класс с private доступом
    private class PrivateInner {
        public void display() {
            System.out.println("PrivateInner: " + outerPrivate);
        }
    }

    // Внутренний класс с protected доступом
    protected class ProtectedInner {
        public void display() {
            System.out.println("ProtectedInner: " + outerProtected);
        }
    }

    // Внутренний класс с public доступом
    public class PublicInner {
        public void display() {
            System.out.println("PublicInner: " + outerPublic);
        }
    }

    // Внутренний класс с default доступом
    class DefaultInner {
        public void display() {
            System.out.println("DefaultInner: " + outerDefault);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        
        // Создание экземпляров внутренних классов
        OuterClass.PrivateInner privateInner = outer.new PrivateInner();
        privateInner.display();

        OuterClass.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.display();

        OuterClass.PublicInner publicInner = outer.new PublicInner();
        publicInner.display();

        OuterClass.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.display();
    }
}
