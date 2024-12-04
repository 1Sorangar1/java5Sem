package module31;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String message = "Hello, OutputStream!";
            for (int i = 0; i < message.length(); i++) {
                fos.write(message.charAt(i)); // Запись символа в файл по одному байту
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
