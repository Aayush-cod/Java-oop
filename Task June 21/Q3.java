abstract class Vehicle {
    abstract double calculateRental(int days);
}

class Car extends Vehicle {
    double calculateRental(int days) {
        return days * 50.0;
    }
}

class Motorcycle extends Vehicle {
    double calculateRental(int days) {
        return days * 30.0;
    }
}

class Bicycle extends Vehicle {
    double calculateRental(int days) {
        return days * 10.0;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(),
            new Motorcycle(),
            new Bicycle()
        };
        int days = 3;
        for (Vehicle v : vehicles) {
            System.out.println("Rental Cost: $" + v.calculateRental(days));
        }
    }
}
