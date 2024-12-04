package module31;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice4 {
    public static void main(String[] args) {
        // Использование try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader("module31/example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Чтение и вывод строки
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
Интерфейс AutoCloseable используется для объектов, которые требуют явного закрытия после использования,
 например, файловые потоки или соединения с базой данных.
Он гарантирует, что метод close() будет вызван автоматически,
когда объект больше не нужен, что уменьшает вероятность утечек ресурсов.
Интерфейс AutoCloseable является частью конструкции try-with-resources, что упрощает управление ресурсами.
 */