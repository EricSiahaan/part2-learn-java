public class CarExample {
    public static void main(String[] args) {
        Car genericCar = new Car("Generic Brand");
        BMW bmwSedan = new BMW("7 Series");
        Mercedes mercedesSedan = new Mercedes("S-Class");

        // Using method overriding
        genericCar.start(); // Output: "Starting the car."
        bmwSedan.start(); // Output: "BMW 7 Series starting..."
        mercedesSedan.start(); // Output: "Mercedes S-Class starting..."

        // Polymorphism with method overriding
        Car[] cars = new Car[2];
        cars[0] = bmwSedan;
        cars[1] = mercedesSedan;

        for (Car car : cars) {
            car.start();
        }
    }
}
