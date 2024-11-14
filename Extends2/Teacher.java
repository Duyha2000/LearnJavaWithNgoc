package Extends2;

// Teacher vaf Student deu la 1 Person
// Person : Teacher va Student
// clean code lại
public class Teacher extends Person {
    // teen tuoi dia chi, tien luonwg
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Salary: " + salary);
    }

    // public Teacher() {
    // // 1 dòng sẽ ẩn đi: hay hỏi ở quizz
    // // super();
    // System.out.println("Teacher constructor");
    // }

    // super sẽ gọi đến constructor của lớp cha
    public Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + "Teacher{" +
                "salary=" + salary +
                '}';
    }
}
