package m25_class_and_object;

public class CarClient {
    public static void main(String[] args) {
        Car car = new Car();

        car.make = "Toyota";
        car.model = "Corolla";
        car.year = 2023;
        car.color = "Black";
        car.price = 30_000;

        car.start();
        car.drive();
        car.stop();
        car.showCurrentSpeed(65,70);
        car.showCurrentSpeed(85,70);

        System.out.println(car);

    }
}
