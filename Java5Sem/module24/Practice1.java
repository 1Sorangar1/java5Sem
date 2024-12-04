package module24;

public class Practice1 {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        // 1. length() - возвращает длину строки
        System.out.println("Длина строки: " + str.length());

        // 2. charAt() - возвращает символ по индексу
        System.out.println("Символ на 7-й позиции: " + str.charAt(7));

        // 3. substring() - возвращает подстроку
        System.out.println("Подстрока с 7 по 11: " + str.substring(7, 11));

        // 4. contains() - проверяет, содержит ли строка подстроку
        System.out.println("Содержит 'Java': " + str.contains("Java"));

        // 5. toUpperCase() - переводит строку в верхний регистр
        System.out.println("В верхнем регистре: " + str.toUpperCase());

        // 6. toLowerCase() - переводит строку в нижний регистр
        System.out.println("В нижнем регистре: " + str.toLowerCase());

        // 7. replace() - заменяет символы или подстроки
        System.out.println("Замена 'Java' на 'World': " + str.replace("Java", "World"));

        // 8. trim() - удаляет начальные и конечные пробелы
        String strWithSpaces = "   Hello!   ";
        System.out.println("После trim: '" + strWithSpaces.trim() + "'");

        // 9. indexOf() - возвращает индекс первого вхождения подстроки
        System.out.println("Индекс 'Java': " + str.indexOf("Java"));

        // 10. isEmpty() - проверяет, пуста ли строка
        String emptyStr = "";
        System.out.println("Строка пуста: " + emptyStr.isEmpty());
    }
}
