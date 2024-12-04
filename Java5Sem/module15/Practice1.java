package module15;

public class Practice1 {
    public static void main(String[] args) {
        Day day = Day.MONDAY;

        // Использование метода getRussianName() для вывода дня на русском
        System.out.println("Сегодня: " + day.getRussianName());

        // Пример switch с перечислением
        switch (day) {
            case MONDAY:
                System.out.println("Начало недели!");
                break;
            case FRIDAY:
                System.out.println("Пятница!");
                break;
            default:
                System.out.println("Обычный день.");
                break;
        }
    }
}
