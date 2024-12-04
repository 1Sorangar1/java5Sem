package module18;

// Класс A (суперкласс)
class A {
    int value;

    // Конструктор класса A
    public A(int value) {
        this.value = value;
    }

    // Метод класса A
    public void displayValue() {
        System.out.println("Значение из суперкласса A: " + value);
    }
}

// Класс B (подкласс)
class B extends A {

    // Конструктор класса B вызывает конструктор суперкласса
    public B(int value) {
        super(value); // Вызываем конструктор класса A
    }

    // Метод класса B вызывает метод суперкласса
    public void displayValue() {
        super.displayValue(); // Вызов метода суперкласса A
        System.out.println("Дополнительное сообщение из класса B.");
    }

    // Метод доступа к полю суперкласса
    public void printSuperField() {
        System.out.println("Поле из суперкласса: " + super.value);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        B obj = new B(100);
        obj.displayValue(); // Демонстрируем вызов метода суперкласса
        obj.printSuperField(); // Демонстрируем доступ к полю суперкласса
    }
}
