package Extends2;

public class Circle {
    private int banKinh;
    private String colour;

    // Diện tích hình tròn: PI * r * r
    // Hàm tính chu vi hình tròn: 2 * PI * r
    public int getBankinh() {
        return banKinh;
    }

    public double getArea() {
        return banKinh * banKinh * 3.14;
    }

    public Circle(int banKinh, String colour) {
        this.banKinh = banKinh;
        this.colour = colour;
    }

    public String toString() {
        return "ban kinh : " + banKinh + "mau sac: " + colour + "dien tich: " + getArea();
    }
}