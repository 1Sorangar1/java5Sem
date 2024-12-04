package module4;

public class Practice2 {
    public static void main(String[] args) {
        // Способы создания Boolean

        // 1. Использование метода valueOf с boolean
        Boolean bool1 = Boolean.valueOf(true);

        // 2. Использование метода valueOf с String
        Boolean bool2 = Boolean.valueOf("true");
        Boolean bool3 = Boolean.valueOf("false");

        // 3. Автоупаковка
        Boolean bool4 = true;

        // Вывод результатов
        System.out.println("Boolean.valueOf(true): " + bool1);
        System.out.println("Boolean.valueOf(\"true\"): " + bool2);
        System.out.println("Boolean.valueOf(\"false\"): " + bool3);
        System.out.println("Автоупаковка: " + bool4);
    }
}

