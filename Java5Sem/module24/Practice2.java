package module24;

import java.util.StringJoiner;

public class Practice2 {
    public static void main(String[] args) {
        // Создание StringJoiner с разделителем и границами
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        // Добавление элементов
        joiner.add("Java");
        joiner.add("Python");
        joiner.add("C++");

        // Результирующая строка
        System.out.println("Объединённая строка: " + joiner.toString());

        // Пример объединения двух StringJoiner
        StringJoiner joiner2 = new StringJoiner(" | ");
        joiner2.add("Kotlin").add("Swift");
        joiner.merge(joiner2);

        System.out.println("Объединённый StringJoiner: " + joiner);
    }
}
