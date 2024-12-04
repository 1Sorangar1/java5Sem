package module21;

/*
 Пример демонстрирует доступ внешнего класса к полям и методам внутреннего класса.
 */
public class OuterClass2 {

    // Приватный внутренний класс
    private class InnerClass {
        private String privateField = "Приватное поле внутреннего класса";

        private void display() {
            System.out.println("Метод внутреннего класса");
        }
    }

    public void accessInnerClass() {
        InnerClass inner = new InnerClass();
        // Доступ к приватным полям и методам внутреннего класса
        System.out.println(inner.privateField);
        inner.display();
    }

    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        outer.accessInnerClass();
    }
}
/*
Внешний класс также имеет доступ к полям и методам внутреннего класса,
даже если они приватные, поскольку внутренний класс объявлен внутри него.
 */
