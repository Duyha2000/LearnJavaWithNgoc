package Extends;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Tôi đang đi ô tố");
    }
}
