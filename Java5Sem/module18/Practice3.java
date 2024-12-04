package module18;

class C {
    int a;
    int b;
    int c;
    int z;

    // Конструктор без параметров
    public C() {
        this(0, 0, 0); // Вызов конструктора с тремя параметрами
    }

    // Конструктор с одним параметром
    public C(int a) {
        this(a, 0, 0); // Вызов конструктора с тремя параметрами
    }

    // Конструктор с двумя параметрами
    public C(int a, int b) {
        this(a, b, 0); // Вызов конструктора с тремя параметрами
    }

    // Конструктор с тремя параметрами
    public C(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1; // Общее действие для всех конструкторов
    }
}

public class Practice3 {
    public static void main(String[] args) {
        C obj1 = new C();
        C obj2 = new C(10);
        C obj3 = new C(10, 20);
        C obj4 = new C(10, 20, 30);
    }
}
