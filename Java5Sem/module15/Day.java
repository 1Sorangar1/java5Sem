package module15;

public enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String russianName;

    // Конструктор для инициализации элемента перечисления
    Day(String russianName) {
        this.russianName = russianName;
    }

    // Метод для получения русского названия дня недели
    public String getRussianName() {
        return russianName;
    }
}