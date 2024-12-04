package module21;

/**
 * Пример демонстрирует, что внутренний класс имеет доступ к полям и методам внешнего класса.
 */
public class OuterClass1 {

    private String privateField = "Приватное поле внешнего класса";
    protected String protectedField = "Защищённое поле внешнего класса";

    public class InnerClass {
        public void displayOuterFields() {
            // Внутренний класс имеет доступ к полям внешнего класса
            System.out.println(privateField);
            System.out.println(protectedField);
        }
    }

    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();
        OuterClass1.InnerClass inner = outer.new InnerClass();
        inner.displayOuterFields();
    }
}

/*
Внутренний класс имеет доступ ко всем полям и методам внешнего класса (включая private),
так как он неявно хранит ссылку на объект внешнего класса.
 */