package OOP2;

public class Triangle {
    private int base;
    private int height;

    public double calculateArea() {
        return 0.5 * (this.base * this.height);
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    // Getter - setter
    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // toString
    public String toString() {
        return "Base: " + this.base + "Height: " + this.height;
    }
}
