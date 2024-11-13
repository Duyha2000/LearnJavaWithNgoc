package ArrayListJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StudentManagement {
    // listStudent 10 thằng
    ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1, "John Doe", 85.5)));

    public void showAll() {
        // for (int i = 0; i < students.size(); i++) {
        // System.out.println(students.get(i));
        // }
        for (Student hs : students) {
            System.out.println(hs);
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        int position = -1;
        for (int i = 0; i < students.size(); i++) {
            if (studentId == students.get(i).getStudentID()) {
                position = i;
                break;
            }
        }
        students.remove(position);
        // int indexDelete = students.indexOf(studentId);
        // students.remove(indexDelete);
    }

    // Nhập id = 5 -> Hiển thị toàn bộ thông tin của học sinh có id là 5
    // (name,age,address)
    public Student findStudentById(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (studentId == students.get(i).getStudentID()) {
                return students.get(i);
            }
        }
        return null;
    }

    public double getAverageScore() {
        int sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).getAverageScore();
        }
        return sum / students.size();
    }

    public void sortByScore() {
        students.sort(Comparator.comparingDouble(Student::getAverageScore));
    }
}