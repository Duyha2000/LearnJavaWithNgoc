package ArrayListJava;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManagement {
    // listStudent 10 thằng
    ArrayList<Student> students = new ArrayList<>();

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
        int position = -1; // k tìm thấy position trả về -1 (quy ước)
        // Sử
        // Toán (0) Lý (1) Hóa(2)
        for (int i = 0; i < students.size(); i++) {
            if (studentId == students.get(i).getStudentID()) {
                position = i;
                break;
            }
        }
        if (position == -1)
            System.out.println("không có sách");
        else {
            students.remove(position);
            System.err.println("Xóa thành công");
        }
        // nếu không có sách thì trả về -1 -> if(position = -1) -> in ra lỗi
        // còn nếu có trả về position rồi xóa sách
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