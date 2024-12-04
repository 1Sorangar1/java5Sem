package module32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        File file = new File("module32/example.txt"); // Указываем путь к файлу

        try (Scanner scanner = new Scanner(file)) { // Создаем Scanner для чтения из файла
            // Чтение данных по строкам
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // Чтение следующей строки
                System.out.println(line); // Вывод строки в консоль
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}
