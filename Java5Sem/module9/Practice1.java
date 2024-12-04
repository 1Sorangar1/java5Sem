package module9;

/**
 * Класс демонстрирует использование спецификаторов доступа:
 * - private
 * - protected
 * - public
 * - package-private (без указания модификатора)
 */
class Parent {
    private int privateField = 1; // Только внутри этого класса
    int packagePrivateField = 2; // Доступно в пределах пакета (default)
    protected int protectedField = 3; // Доступно в пакете и подклассах
    public int publicField = 4; // Доступно всем

    // Пример методов с разными модификаторами
    private void privateMethod() {
        System.out.println("Private method");
    }

    void packagePrivateMethod() {
        System.out.println("Package-private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }

    // Метод для демонстрации доступа внутри класса
    public void showAccess() {
        System.out.println("Access within Parent class:");
        System.out.println("Private field: " + privateField);
        System.out.println("Package-private field: " + packagePrivateField);
        System.out.println("Protected field: " + protectedField);
        System.out.println("Public field: " + publicField);

        privateMethod(); // Доступно
        packagePrivateMethod(); // Доступно
        protectedMethod(); // Доступно
        publicMethod(); // Доступно
    }
}

// Подкласс, находящийся в том же пакете
class Subclass extends Parent {
    public void showAccessFromSubclass() {
        System.out.println("Access from Subclass:");
        // System.out.println("Private field: " + privateField); // Ошибка: private недоступен
        System.out.println("Package-private field: " + packagePrivateField); // Доступно
        System.out.println("Protected field: " + protectedField); // Доступно
        System.out.println("Public field: " + publicField); // Доступно

        // privateMethod(); // Ошибка: private недоступен
        packagePrivateMethod(); // Доступно
        protectedMethod(); // Доступно
        publicMethod(); // Доступно
    }
}

// Класс в том же пакете
class SamePackage {
    public void showAccessFromSamePackage() {
        Parent parent = new Parent();
        System.out.println("Access from SamePackage class:");
        // System.out.println("Private field: " + parent.privateField); // Ошибка: private недоступен
        System.out.println("Package-private field: " + parent.packagePrivateField); // Доступно
        System.out.println("Protected field: " + parent.protectedField); // Доступно
        System.out.println("Public field: " + parent.publicField); // Доступно

        // parent.privateMethod(); // Ошибка: private недоступен
        parent.packagePrivateMethod(); // Доступно
        parent.protectedMethod(); // Доступно
        parent.publicMethod(); // Доступно
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Subclass subclass = new Subclass();
        SamePackage samePackage = new SamePackage();

        // Демонстрация доступа внутри класса
        parent.showAccess();

        // Демонстрация доступа из подкласса
        subclass.showAccessFromSubclass();

        // Демонстрация доступа из класса того же пакета
        samePackage.showAccessFromSamePackage();

        // Пример работы с public полями и методами
        parent.publicField = 10; // Доступно
        parent.publicMethod(); // Доступно
    }
}
/*

private: Поля и методы доступны только внутри того же класса.
package-private (без модификатора): Поля и методы доступны всем классам в одном пакете.
protected: Доступно в пакете и подклассах (даже если подкласс находится в другом пакете).
public: Доступно всем классам в любом пакете.
*/