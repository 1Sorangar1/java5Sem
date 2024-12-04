package module31;

import java.io.FileInputStream;
import java.io.IOException;

public class Practice1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("module31/example.txt")) {
            int data;
            // Чтение данных по одному байту
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Преобразуем байт в символ и выводим
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
