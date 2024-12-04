package module3;

public class Practice1 {
    public static void main(String[] args) {
        // Оператор + и +=
        String greeting = "Hello";
        String name = "World";
        String message = greeting + ", " + name + "!"; // Конкатенация строк
        System.out.println(message);
        greeting += " Java"; // Добавление к строке
        System.out.println(greeting);

        // Логические операторы == и !=
        int x = 10, y = 20;
        System.out.println("x == y: " + (x == y)); // false
        System.out.println("x != y: " + (x != y)); // true

        // Оператор присваивания =
        int z = x + y;
        System.out.println("z = " + z);

        // Оператор ?:
        String result = (x > y) ? "x больше y" : "x меньше или равно y";
        System.out.println(result);

        // Логические операторы || и &&
        boolean isTrue = (x < y) || (x > 100);
        System.out.println("x < y || x > 100: " + isTrue);
        isTrue = (x < y) && (y < 50);
        System.out.println("x < y && y < 50: " + isTrue);

        // Побитовые операторы |, &, ^, ~
        int a = 5, b = 3; // 5 = 0101, 3 = 0011
        System.out.println("a | b: " + (a | b)); // 0111 = 7
        System.out.println("a & b: " + (a & b)); // 0001 = 1
        System.out.println("a ^ b: " + (a ^ b)); // 0110 = 6
        System.out.println("~a: " + (~a)); // Побитовое отрицание

        // Операторы сравнения >, <, >=, <=
        System.out.println("x > y: " + (x > y));
        System.out.println("x <= y: " + (x <= y));

        // Операторы сдвига >>, >>>, <<
        int value = 8; // 1000 в двоичном виде
        System.out.println("value << 1: " + (value << 1)); // Сдвиг влево (умножение на 2)
        System.out.println("value >> 1: " + (value >> 1)); // Сдвиг вправо (деление на 2)
        System.out.println("value >>> 1: " + (value >>> 1)); // Логический сдвиг вправо

        // Арифметические операторы +, -, *, /, %
        System.out.println("x + y: " + (x + y));
        System.out.println("x - y: " + (x - y));
        System.out.println("x * y: " + (x * y));
        System.out.println("x / y: " + (x / y));
        System.out.println("x % y: " + (x % y));

        // Префиксная и постфиксная форма операторов ++ и --
        int counter = 0;
        System.out.println("Префиксный ++: " + (++counter)); // Увеличение перед использованием
        System.out.println("Постфиксный ++: " + (counter++)); // Использование перед увеличением
        System.out.println("Значение после постфиксного ++: " + counter);
        System.out.println("Префиксный --: " + (--counter)); // Уменьшение перед использованием
        System.out.println("Постфиксный --: " + (counter--)); // Использование перед уменьшением
        System.out.println("Значение после постфиксного --: " + counter);
    }
}

