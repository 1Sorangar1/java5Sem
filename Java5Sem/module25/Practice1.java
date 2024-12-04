package module25;

public class Practice1 {
    public static void main(String[] args) {
        // Создание объектов StringBuffer и StringBuilder
        StringBuffer sbf = new StringBuffer("Hello");
        StringBuilder sbd = new StringBuilder("World");

        // 1. append() - добавляет текст к строке
        sbf.append(", Java!");
        System.out.println("StringBuffer после append: " + sbf);

        // 2. insert() - вставляет текст на указанную позицию
        sbd.insert(0, "Hello ");
        System.out.println("StringBuilder после insert: " + sbd);

        // 3. replace() - заменяет часть строки на новую
        sbf.replace(0, 5, "Hi");
        System.out.println("StringBuffer после replace: " + sbf);

        // 4. delete() - удаляет часть строки
        sbd.delete(5, 11);
        System.out.println("StringBuilder после delete: " + sbd);

        // 5. reverse() - переворачивает строку
        sbf.reverse();
        System.out.println("StringBuffer после reverse: " + sbf);
        sbf.reverse(); // Восстановим строку

        // 6. setLength() - изменяет длину строки
        sbd.setLength(5);
        System.out.println("StringBuilder после setLength: " + sbd);

        // 7. charAt() - возвращает символ по индексу
        System.out.println("Символ на индексе 1 в StringBuffer: " + sbf.charAt(1));

        // 8. substring() - возвращает подстроку
        System.out.println("Подстрока StringBuilder: " + sbd.substring(0, 2));

        // 9. capacity() - возвращает текущую ёмкость
        System.out.println("Ёмкость StringBuffer: " + sbf.capacity());

        // 10. ensureCapacity() - задаёт минимальную ёмкость
        sbd.ensureCapacity(50);
        System.out.println("Новая ёмкость StringBuilder после ensureCapacity: " + sbd.capacity());
    }
}
