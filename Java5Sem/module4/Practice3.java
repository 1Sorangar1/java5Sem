package module4;

public class Practice3 {
    public static void main(String[] args) {
        Integer value = null; // Автоупаковка в объект Integer
        try {
            int unboxedValue = value; // Автораспаковка из null, вызовет NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: невозможно распаковать null.");
        }
    }
}

/*
Исключение NullPointerException возникает, когда попытка автораспаковки
(unboxing) применяется к значению null.
Автораспаковка предполагает извлечение базового типа, но у null нет значения.
 */
