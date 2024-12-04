package module27;

public class Practice2 {
    public static void main(String[] args) {

        //ArithmeticException - Деление на ноль
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e);
        }

        //ArrayIndexOutOfBoundsException - Выход за пределы массива
        try {
            int[] arr = new int[2];
            arr[3] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e);
        }

        //IllegalArgumentException - Неверный аргумент метода
        try {
            throw new IllegalArgumentException("Неверное значение аргумента");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e);
        }

        //lassCastException - Невозможность приведения типов
        try {
            Object obj = new String("Привет");
            Integer num = (Integer) obj;  // Приведение типа вызовет исключение
        } catch (ClassCastException e) {
            System.out.println("Ошибка: " + e);
        }

        //NullPointerException - Обращение к методу через null
        try {
            String str = null;
            int length = str.length();  // Попытка вызвать метод на null
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
