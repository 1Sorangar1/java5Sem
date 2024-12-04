package module17;

class Parent {
    // Метод с final не может быть переопределен в подклассе
    public final void finalMethod() {
        System.out.println("Это final метод суперкласса");
    }
}

class Child extends Parent {
    // Попытка переопределить final метод вызовет ошибку компиляции
    // Ошибка: Cannot override the final method from Parent
    //@Override
    //public void finalMethod() {
        //System.out.println("Пытаемся переопределить final метод");
    //}
}

public class Practice1 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.finalMethod(); // Это вызовет метод суперкласса
    }
}

/*
В данном примере метод finalMethod() в классе Parent объявлен как final,
что означает, что его нельзя переопределить в классе Child. Попытка переопределения вызовет ошибку компиляции.
 */
