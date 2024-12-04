package module26;
import java.util.Formatter;

public class Practice3 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        //%tY - Год в четырехзначном формате
        formatter.format("Year (4 digits): %tY\n", new java.util.Date());

        //%tB - Полное название месяца
        formatter.format("Month: %tB\n", new java.util.Date());

        //%tA - Полное название дня недели
        formatter.format("Day of the week: %tA\n", new java.util.Date());

        //%tM - Минуты как десятичное целое
        formatter.format("Minutes: %tM\n", new java.util.Date());

        //%tS - Секунды как десятичное целое
        formatter.format("Seconds: %tS\n", new java.util.Date());

        System.out.println(formatter);
        formatter.close();
    }
}
