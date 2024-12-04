package module14;

public class Practice1 {

    // Метод для печати чисел типа int
    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // Метод для печати объектов типа Object
    public static void printObjects(Object... objs) {
        for (Object obj : objs) {
            System.out.println(obj.toString());
        }
    }

    public static void main(String[] args) {
        // Пример вызова метода с переменным числом параметров для int
        System.out.println("Для int:");
        printNumbers(1, 2, 3, 4); // Вызываем метод с int...

        // Пример вызова метода с переменным числом параметров для Object
        System.out.println("Для Object:");
        printObjects("Hello", 3.14, true); // Вызываем метод с Object...

        // Пример вызова метода с переменным числом параметров для Integer (будет преобразован в int)
        System.out.println("Для Integer:");
        printNumbers(5, 10, 15); // Вызываем метод с int...
    }
}
