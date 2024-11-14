package Extends2;

public class Shape {
    private String colour;

    public Shape() {
        // this.colour = "";
        this("");
    }

    public Shape(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return colour;
    }
}