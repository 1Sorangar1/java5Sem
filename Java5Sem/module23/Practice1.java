package module23;

interface MyInterface {
    // Default method (неабстрактный)
    default void defaultMethod() {
        System.out.println("Вызов default метода из MyInterface");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Вызов static метода из MyInterface");
    }
}

class MyClass implements MyInterface {
    public void defaultMethod() {
        System.out.println("Переопределённый default метод в MyClass");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        MyInterface myObj = new MyClass();

        // Вызов default метода
        myObj.defaultMethod();

        // Вызов static метода через имя интерфейса
        MyInterface.staticMethod();
    }
}

/*
Default метод:
Реализован в интерфейсе. Может быть переопределён в классе, реализующем интерфейс.
Static метод:
Не зависит от экземпляра класса. Вызывается через имя интерфейса.
 */