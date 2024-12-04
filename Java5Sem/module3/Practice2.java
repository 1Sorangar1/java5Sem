package module3;

public class Practice2 {
    public static void main(String[] args) {
        // Пример 1: объект String
        Object obj = "This is a string";
        System.out.println("obj instanceof String: " + (obj instanceof String)); // true

        // Пример 2: объект Integer
        obj = 42;
        System.out.println("obj instanceof Integer: " + (obj instanceof Integer)); // true

        // Пример 3: объект null
        obj = null;
        System.out.println("obj instanceof String: " + (obj instanceof String)); // false

        // Пример 4: пользовательский класс
        class Animal {}
        class Dog extends Animal {}

        Animal animal = new Dog();
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog)); // true
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal)); // true
    }
}

