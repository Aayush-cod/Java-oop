package Encapsulation;

public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean available;

    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = price;
        this.available = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double price) {
        if (price >= 0) {
            this.rentalPricePerDay = price;
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public void rentCar() {
        if (available) {
            available = false;
            System.out.println("Car rented.");
        } else {
            System.out.println("Car already rented.");
        }
    }

    public void returnCar() {
        available = true;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 50);
        System.out.println("Available: " + car.isAvailable());
        car.rentCar();
        car.returnCar();
        System.out.println("Available after return: " + car.isAvailable());
    }
}
