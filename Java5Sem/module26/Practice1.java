package module26;
import java.util.Formatter;

public class Practice1 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        //%b - Логическое значение аргумента
        boolean isJavaFun = true;
        formatter.format("Is Java fun? %b\n", isJavaFun);

        //%d - Десятичное целое значение аргумента
        int number = 123;
        formatter.format("Number: %d\n", number);

        //%s - Строковое представление аргумента
        String language = "Java";
        formatter.format("Programming language: %s\n", language);

        //%f - Десятичное значение с плавающей точкой
        double pi = 3.14159;
        formatter.format("Value of pi: %f\n", pi);

        //%e - Экспоненциальное представление аргумента
        double largeNumber = 1234567.89;
        formatter.format("Large number in exponential form: %e\n", largeNumber);

        System.out.println(formatter);
        formatter.close();
    }
}
