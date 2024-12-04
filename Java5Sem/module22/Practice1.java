package module22;

public class Practice1 {

    // Интерфейс с вложенным классом
    public interface MyInterface {

        // Статический вложенный класс
        class NestedClass {
            public void displayMessage() {
                System.out.println("Вложенный класс в интерфейсе вызван!");
            }
        }

        // Метод интерфейса
        void someMethod();
    }

    // Класс, реализующий интерфейс
    public static class MyClass implements MyInterface {
        public void someMethod() {
            System.out.println("Реализация метода интерфейса.");
        }
    }

    public static void main(String[] args) {
        // Вызов метода из вложенного класса
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.displayMessage();

        // Создание объекта реализации интерфейса и вызов его метода
        MyInterface myClass = new MyClass();
        myClass.someMethod();
    }
}
