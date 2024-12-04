package module21;

/**
 * Пример использования внутренних классов с различными спецификаторами доступа.
 */
public class OuterClass {

    // Публичный внутренний класс
    public class PublicInnerClass {
        public void display() {
            System.out.println("Публичный внутренний класс");
        }
    }

    // Защищённый внутренний класс
    protected class ProtectedInnerClass {
        public void display() {
            System.out.println("Защищённый внутренний класс");
        }
    }

    // Класс по умолчанию (без спецификатора)
    class DefaultInnerClass {
        public void display() {
            System.out.println("Внутренний класс с доступом по умолчанию");
        }
    }

    // Приватный внутренний класс
    private class PrivateInnerClass {
        public void display() {
            System.out.println("Приватный внутренний класс");
        }
    }

    public void testInnerClasses() {
        // Доступ ко всем классам из внешнего класса
        new PublicInnerClass().display();
        new ProtectedInnerClass().display();
        new DefaultInnerClass().display();
        new PrivateInnerClass().display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.testInnerClasses();

        // Доступ извне к публичному классу
        OuterClass.PublicInnerClass publicInner = outer.new PublicInnerClass();
        publicInner.display();
    }
}

/*
Доступ ко внутренним классам зависит от их спецификатора доступа:
public — доступен отовсюду.
protected — доступен в пределах пакета и в наследниках.
По умолчанию — доступен только в пределах пакета.
private — доступен только внутри внешнего класса.
 */