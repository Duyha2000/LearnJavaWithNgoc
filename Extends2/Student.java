package Extends2;

public class Student extends Person {
    // tên, tuổi, địa chỉ
    private double gpa;

    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("gpa : " + gpa);
    }

    public String toString() {
        return super.toString() + "Student{" +
                "gpa=" + gpa +
                '}';
    }

}
