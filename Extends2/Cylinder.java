package Extends2;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(int banKinh, String name, double height) {
        // super viết đầu tiên
        super(banKinh, name);
        this.height = height;
    }

    // surface area = 2π𝒓² + 2π𝒓𝒉 = 2π𝒓(r+h)
    // lấy method từ method cha
    // @Override: annotation - ghi đè
    // Overriding và Overloading
    @Override
    public double getArea() {
        return 2 * 3.14 * super.getBankinh() * (super.getBankinh() + height);
    }

    // volume = π𝒓²𝒉
    public double getVolume() {
        return 3.14 * super.getBankinh() * height;
    }

    @Override
    public String toString() {
        return super.toString() + "Cylinder{" +
                "height=" + height +
                '}' + "dien tich: " + getArea() + "the tich: " + getVolume();
    }

}
