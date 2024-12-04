package module10;

/**
 * Класс демонстрирует перегрузку и переопределение методов.
 */
class Parent {

    /**
     * Базовый метод, который будет переопределён.
     */
    public void show() {
        System.out.println("Method from Parent class.");
    }

    /**
     * Пример перегрузки метода: разное количество и типы аргументов.
     */
    public void calculate(int a) {
        System.out.println("Single integer argument: " + a);
    }

    public void calculate(int a, int b) {
        System.out.println("Two integer arguments: " + a + ", " + b);
    }

    public void calculate(String s) {
        System.out.println("Single string argument: " + s);
    }
}

/**
 * Класс-подкласс, демонстрирующий переопределение методов суперкласса.
 */
class Subclass extends Parent {

    /**
     * Переопределение метода show().
     * Используется для изменения поведения родительского метода.
     */
    @Override
    public void show() {
        System.out.println("Overridden method from Subclass.");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Создание объектов классов
        Parent parent = new Parent();
        Subclass subclass = new Subclass();

        // Вызов базового метода
        parent.show(); // Вызов метода из Parent

        // Вызов переопределённого метода
        subclass.show(); // Вызов переопределённого метода из Subclass

        // Примеры перегрузки методов
        parent.calculate(10); // Одно целое число
        parent.calculate(5, 15); // Два целых числа
        parent.calculate("Hello, World!"); // Строка

        // Использование переопределения через ссылку на родительский тип
        Parent poly = new Subclass(); // Полиморфизм
        poly.show(); // Вызов переопределённого метода
    }
}
/*

Перегрузка методов:

Создан метод calculate с разными сигнатурами: один принимает целое число,
другой два целых числа, третий — строку.
Это демонстрирует использование перегрузки на основе различий в типах и количестве аргументов.

Переопределение методов:

Метод show из суперкласса Parent был переопределён в подклассе Subclass.
С помощью аннотации @Override указывается, что метод из суперкласса переопределяется.
Полиморфизм:

Показан вызов переопределённого метода через ссылку типа Parent, указывающую на объект типа Subclass.
*/