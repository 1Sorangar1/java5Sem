package module6;

public class Practice1 {
    public static void main(String[] args) {
        // Типы переменных в switch

        // 1. int
        int intValue = 2;
        switch (intValue) {
            case 1:
                System.out.println("int: 1");
                break;
            case 2:
                System.out.println("int: 2");
                break;
            default:
                System.out.println("int: default");
        }

        // 2. char
        char charValue = 'B';
        switch (charValue) {
            case 'A':
                System.out.println("char: A");
                break;
            case 'B':
                System.out.println("char: B");
                break;
            default:
                System.out.println("char: default");
        }

        // 3. String
        String stringValue = "Hello";
        switch (stringValue) {
            case "Hi":
                System.out.println("String: Hi");
                break;
            case "Hello":
                System.out.println("String: Hello");
                break;
            default:
                System.out.println("String: default");
        }

        // 4. Enum
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Enum: Monday");
                break;
            case FRIDAY:
                System.out.println("Enum: Friday");
                break;
            default:
                System.out.println("Enum: Other day");
        }
    }

    // Перечисление для примера с Enum
    enum Day {
        MONDAY, FRIDAY, SUNDAY
    }
}
/* Переменная в switch может быть:

Примитивным типом: byte, short, char, int (или их обертками).
String: начиная с Java 7.
Enum: удобный способ работы с ограниченными наборами значений.
*/