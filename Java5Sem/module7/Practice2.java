package module7;

public class Practice2 {
    public static void main(String[] args) {
        // Использование break и continue в цикле for
        for (int i = 1; i <= 10; i++) {
            /*
            Если i равно 5, пропускаем текущую итерацию (continue).
            Если i равно 8, выходим из цикла (break).
            */
            if (i == 5) {
                System.out.println("Пропускаем итерацию для i = " + i);
                continue; // Пропустить текущую итерацию
            }

            if (i == 8) {
                System.out.println("Выходим из цикла при i = " + i);
                break; // Выход из цикла
            }

            System.out.println("Текущая итерация i = " + i);
        }
    }
}
