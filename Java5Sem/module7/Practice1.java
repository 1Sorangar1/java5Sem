package module7;

public class Practice1 {
    public static void main(String[] args) {
        // Бесконечный цикл while
        /*
        Этот цикл продолжает выполняться, потому что условие всегда истинно (true).
        Без выхода из цикла программа зависнет.
        */
        while (true) {
            System.out.println("Бесконечный цикл while");
            break; // Пример выхода из бесконечного цикла
        }

        do {
            System.out.println("Бесконечный цикл do-while");
            break; // Пример выхода из бесконечного цикла
        } while (true);
    }
}
