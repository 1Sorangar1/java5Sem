package module19;

// Суперкласс
class Parent1 {
    public void printMessage() {
        System.out.println("Сообщение из суперкласса.");
    }
}

// Подкласс
class Child1 extends Parent1 {
    @Override
    public void printMessage() { // Переопределение корректное
        System.out.println("Сообщение из подкласса.");
    }

    // Попробуем ошибиться в имени метода
    //@Override // Раскомментирование вызовет ошибку компиляции
    public void printmessage() { // Неверное переопределение (ошибка в имени)
        System.out.println("Неверный метод.");
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Child1 child = new Child1();
        child.printMessage(); // Вызов корректно переопределенного метода
    }
}

/* Объяснение:
Аннотация @Override указывает, что метод переопределяет метод суперкласса.
Если изменить имя метода или сигнатуру (например, вместо printMessage написать printmessage),
компилятор выдаст ошибку, помогая избежать логических ошибок.
*/
