package module17;

// Класс с модификатором final
final class FinalClass {
    public void display() {
        System.out.println("Это final класс");
    }
}

// Попытка создать подкласс от final класса вызовет ошибку компиляции
// Ошибка: Cannot subclass the final class 'FinalClass'
//class SubClass extends FinalClass {
//    public void show() {
//        System.out.println("Это подкласс");
//    }
//}

public class Practice2 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
/*
В данном примере класс FinalClass объявлен как final, что означает,
что нельзя создать от него подкласс. Попытка создать подкласс SubClass вызовет ошибку компиляции.
 */