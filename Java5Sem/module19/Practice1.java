package module19;

public class Practice1 {
    // Метод без параметров
    public void printMessage() {
        System.out.println("Сообщение без параметров.");
    }

    // Метод с одним параметром типа String
    public void printMessage(String message) {
        System.out.println("Сообщение: " + message);
    }

    // Метод с двумя параметрами
    public void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Сообщение " + (i + 1) + ": " + message);
        }
    }

    public static void main(String[] args) {
        Practice1 obj = new Practice1();
        obj.printMessage(); // Вызов метода без параметров
        obj.printMessage("Привет, мир!"); // Вызов метода с одним параметром
        obj.printMessage("Привет, Java!", 3); // Вызов метода с двумя параметрами
    }
}
