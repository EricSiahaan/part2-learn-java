public class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Starting the car.");
    }
}

class BMW extends Car {
    BMW(String model) {
        super("BMW");
    }

    @Override
    void start() {
        System.out.println("BMW " + "starting...");
    }
}

class Mercedes extends Car {

    Mercedes(String model) {
        super("Mercedes");
    }

    @Override
    void start() {
        System.out.println("Mercedes" + " starting...");
    }
}

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