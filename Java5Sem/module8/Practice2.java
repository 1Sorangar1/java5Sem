package module8;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};

        // 1. Метод toString
        /*
        Преобразует массив в строку в удобочитаемом формате.
        */
        System.out.println("Массив: " + Arrays.toString(array)); // [5, 3, 8, 1, 2]

        // 2. Метод sort
        /*
        Сортирует массив по возрастанию.
        */
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array)); // [1, 2, 3, 5, 8]

        // 3. Метод binarySearch
        /*
        Выполняет бинарный поиск элемента в отсортированном массиве.
        Возвращает индекс найденного элемента или отрицательное число, если элемент отсутствует.
        */
        int index = Arrays.binarySearch(array, 3);
        System.out.println("Индекс элемента 3: " + index); // 2

        // 4. Метод equals
        /*
        Проверяет два массива на равенство.
        Возвращает true, если оба массива имеют одинаковую длину и элементы в них совпадают.
        */
        int[] arrayCopy = {1, 2, 3, 5, 8};
        System.out.println("Массивы равны: " + Arrays.equals(array, arrayCopy)); // true

        // 5. Метод compare (начиная с Java 9)
        /*
        Сравнивает два массива лексикографически.
        Возвращает отрицательное значение, ноль или положительное значение в зависимости от порядка.
        */
        int[] anotherArray = {1, 2, 4};
        int comparison = Arrays.compare(array, anotherArray);
        System.out.println("Результат сравнения: " + comparison); // -1 (array < anotherArray)
    }
}
