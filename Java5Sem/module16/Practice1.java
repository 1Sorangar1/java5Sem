package module16;

public class Practice1 {
    public static void main(String[] args) {
        Level level = Level.HIGH;

        // Вывод информации о уровне
        System.out.println("Уровень: " + level);
        System.out.println("Приоритет: " + level.getPriority());
        System.out.println("Описание: " + level.getDescription());
    }
}
