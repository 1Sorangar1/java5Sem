package module19;

// Суперкласс
class Parent {
    public String getMessage() {
        return "Сообщение из суперкласса.";
    }
}

// Подкласс
class Child extends Parent {
    public String getMessage() { // Тип возвращаемого значения совпадает
        return "Сообщение из подкласса.";
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

        System.out.println(parent.getMessage()); // Вызов метода суперкласса
        System.out.println(child.getMessage()); // Вызов метода подкласса (динамическое связывание)
    }
}

/*
Что произойдет, если тип возвращаемого значения не совпадает?
Пример:
class Child extends Parent {
    @Override
    public int getMessage() { // Ошибка компиляции: несовпадение возвращаемых типов
        return 42;
    }
}

Объяснение:
Тип возвращаемого значения должен совпадать или быть ковариантным (наследуемым от типа суперкласса).
*/
