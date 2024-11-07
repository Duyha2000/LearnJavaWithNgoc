package OOP2;

public class Employee {
    private String name;
    private double currentSalary;
    private double newSalary;

    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

    public double getNewSalary() {
        return newSalary;
    }

    public void setNewSalary(double newSalary) {
        this.newSalary = newSalary;
    }

    // currentSalary: 10tr
    // tăng 20% -> newSalary = 12 triệu
    // Constructor, toString:

    public void increaseSalary(double percentage) {
        this.newSalary = this.currentSalary * percentage + this.currentSalary;
    }

    public Employee(String name, double currentSalary) {
        this.name = name;
        this.currentSalary = currentSalary;
    }

    public String toString() {
        return this.name + this.newSalary;
    }

}
