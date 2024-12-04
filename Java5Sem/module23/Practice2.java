package module23;

interface InterfaceA {
    default void commonMethod() {
        System.out.println("Метод commonMethod из InterfaceA");
    }
}

interface InterfaceB {
    default void commonMethod() {
        System.out.println("Метод commonMethod из InterfaceB");
    }
}

class MultiInterfaceClass implements InterfaceA, InterfaceB {
    // Разрешение конфликта
    public void commonMethod() {
        // Можно вызвать методы каждого интерфейса, если необходимо
        InterfaceA.super.commonMethod();
        InterfaceB.super.commonMethod();
        System.out.println("Реализация commonMethod в MultiInterfaceClass");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        MultiInterfaceClass obj = new MultiInterfaceClass();
        obj.commonMethod();
    }
}

/*
Если класс реализует два интерфейса с одинаковыми default методами, возникает конфликт.
Для разрешения конфликта в классе необходимо переопределить метод и явно указать, какой из интерфейсов вызывать (используя super).
 */