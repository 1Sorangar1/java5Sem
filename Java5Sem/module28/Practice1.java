package module28;

public class Practice1 {
    public static void main(String[] args) {
        try {
            // Генерация первого исключения: ArithmeticException (перехвачено)
            int result = 10 / 0;

            // Генерация второго исключения: NullPointerException (не перехвачено)
            String str = null;
            System.out.println(str.length());  // Это приведет к NullPointerException
        } catch (ArithmeticException e) {
            // Перехватываем исключение ArithmeticException и обрабатываем его
            System.out.println("Ошибка: деление на ноль.");
        }

        // Программа не дойдет до этого блока, так как второе исключение приведет к аварийному завершению
    }
}

/*
В блоке try генерируется два исключения:
Первое исключение — ArithmeticException, которое возникает из-за попытки деления на ноль.
Оно перехватывается в блоке catch, и программа продолжает выполнение с сообщением об ошибке.
Второе исключение — NullPointerException, возникает при попытке вызвать метод .length() на объекте,
который равен null. Это исключение не перехватывается в этом блоке, поэтому программа аварийно завершится с ошибкой NullPointerException.
Блок catch перехватывает только первое исключение (ArithmeticException), и программа продолжает выполнение после блока catch.
Аварийное завершение происходит, когда второе исключение (NullPointerException) не обрабатывается внутри блока try-catch.
 */