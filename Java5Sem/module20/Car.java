package module20;

/*
 * Пример простого класса с переопределением метода equals().
 */
public class Car {
    private String model;
    private String num; // Уникальный идентификатор автомобиля

    public Car(String model, String num) {
        this.model = model;
        this.num = num;
    }

    /*
     * Переопределяем метод equals() для сравнения объектов Car.
     */
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка ссылок
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка класса
        Car car = (Car) obj;
        return num.equals(car.num); // Сравнение номера автомобиля
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "123");
        Car car2 = new Car("Toyota", "123");
        Car car3 = new Car("Honda", "456");

        System.out.println("car1 equals car2: " + car1.equals(car2)); // true
        System.out.println("car1 equals car3: " + car1.equals(car3)); // false
    }
}

/*
Соглашения:
x.equals(x) всегда должно возвращать true для любого x.
Если x.equals(y) возвращает true, то и y.equals(x) должно возвращать true.
Если x.equals(y) и y.equals(z) возвращают true, то x.equals(z) тоже должно возвращать true.
Многократные вызовы x.equals(y) должны возвращать одинаковый результат, если объекты не изменились.
Метод x.equals(null) всегда должен возвращать false.
 */
