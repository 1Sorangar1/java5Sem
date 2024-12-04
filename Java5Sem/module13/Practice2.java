package module13;
import java.util.*;

public class Practice2 {

    // Пример использования <? extends T>
    public static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    // Пример использования <? super T>
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);  // Можно добавить Integer
        // list.add(3.14); // Ошибка: нельзя добавить Double, потому что список может быть родителем Integer
    }

    public static void main(String[] args) {
        // Пример с <? extends T> - может быть List с типами, наследующимися от Number
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        printNumbers(integerList);  // Выводит Integer элементы

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        printNumbers(doubleList);  // Выводит Double элементы

        // Пример с <? super T> - может быть List с типами, которые являются родителями Integer
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);  // Добавление Integer в список

        List<Object> objectList = new ArrayList<>();
        addIntegers(objectList);  // Добавление Integer в список
    }
}

/*
<? extends T>:
Этот параметр используется в методе printNumbers, который принимает коллекцию,
содержащую элементы типа Number или любого его подкласса.
Мы передаем в метод списки Integer и Double, так как они оба являются подклассами Number.

<? super T>:
В методе addIntegers мы указываем параметр типа List<? super Integer>,
что означает, что список может быть либо List<Number>, либо List<Object>.
В этот список можно безопасно добавлять элементы типа Integer.

instanceof с параметризированными классами:
В примере с Wrapper<T> мы используем instanceof для проверки,
является ли объект экземпляром класса Wrapper с любым параметром типа (Wrapper<?>),
а также с конкретными параметрами типа (Wrapper<Integer> и Wrapper<String>).
 */