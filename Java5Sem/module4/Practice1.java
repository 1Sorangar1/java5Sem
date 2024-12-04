package module4;

public class Practice1 {
    public static void main(String[] args) {
        // Примеры использования Integer.decode()
        Integer decimalValue = Integer.decode("123"); // Десятичное число
        Integer hexValue = Integer.decode("0x7B");   // Шестнадцатеричное число
        Integer octalValue = Integer.decode("0173"); // Восьмеричное число

        System.out.println("Decimal: " + decimalValue); // 123
        System.out.println("Hexadecimal: " + hexValue); // 123
        System.out.println("Octal: " + octalValue);     // 123
    }
}
