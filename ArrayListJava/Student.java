package ArrayListJava;

public class Student {
    private int StudentID;
    private String name;
    private double averageScore;

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public Student(int StudentID, String name, double averageScore) {
        this.StudentID = StudentID;
        this.name = name;
        this.averageScore = averageScore;
    }

    // Cùng 1 function, nếu khác nhau số lượng tham số, overload
    public Student() {
        this(1, "Ngoc", 2.5);
    }

    // Student s1 = new Student(1, "Ngoc", 2.5);
    // Student s1 = new Student();

    public String toString() {
        return "id: " + StudentID + " name : " + name + " AverageScore : " + averageScore;
    }

}