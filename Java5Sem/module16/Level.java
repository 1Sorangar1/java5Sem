package module16;

public enum Level {
    LOW(1, "Низкий"),
    MEDIUM(2, "Средний"),
    HIGH(3, "Высокий");

    private int priority;
    private String description;

    // Конструктор для инициализации элемента перечисления
    Level(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    // Метод для получения приоритета уровня
    public int getPriority() {
        return priority;
    }

    // Метод для получения описания уровня
    public String getDescription() {
        return description;
    }
}