package Extends;

public class Vehicle {
    private int year;
    private String brand;

    // Phương thức khởi tạo
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("Phương tiện đang di chuyển");
    }

}
