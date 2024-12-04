package module29;

public class Practice1 {
    public static void main(String[] args) {
        // Блок try-catch для обработки нескольких исключений
        try {
            // Генерация исключений
            int[] arr = new int[5];
            System.out.println(arr[10]);  // Это приведет к ArrayIndexOutOfBoundsException

            // Второе исключение
            String str = null;
            System.out.println(str.length());  // Это приведет к NullPointerException
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            // Обработка двух исключений абсолютно одинаковым образом
            System.out.println("Произошла ошибка: " + e.getClass().getSimpleName());
        }

        // Пример с иерархией исключений:
        //try {
            // Генерация исключений для каждого типа
            //throw new SubException1();  // Генерируем исключение SubException1
            //throw new SubException2();  // Раскомментировать, чтобы сгенерировать SubException2
            //throw new SubException3();  // Раскомментировать, чтобы сгенерировать SubException3
        //} catch (SubException1 | SubException2 | SubException3 e) {
            //// Все три исключения (SubException1, SubException2, SubException3) обрабатываются одинаково
            //System.out.println("Ошибка: " + e.getClass().getSimpleName());
        //}
    }
}

// Иерархия исключений
class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

class SubException1 extends Ex1 {}
class SubException2 extends Ex2 {}
class SubException3 extends Ex3 {}
