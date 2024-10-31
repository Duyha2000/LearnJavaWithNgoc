package OOP;

import java.util.Scanner;

public class B1 {
  public static void b1(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Person nguoi1 = new Person(" Ngoc ", " Phan ", 18, true);
    // in thông tin ra ngoài màn hình

    // System.out.println(nguoi1);
    // Khởi tạo đối tượng:
    // Student student1 = new Student("Quang", "Male", 24, 7.7);
    // System.out.println(student1);
    // student1.displayInfo();

    // phải có constructor mới truyền đối số (argument) vào bên trong new Student
    // được
    // Student hocSinh1 = new Student();
    // hocSinh1.getInformation();
    // hocSinh1.display();
    // Rectangle r1 = new Rectangle();
    // r1.getInformation();
    // r1.display();
  }
}

// class Student {
// // biến chỉ khởi tạo 1 lần duy nhất
// private String name;
// private int age;

// // Trong java, các method để nhập thông tin và in thông tin sẽ có kiểu trả về
// là void (nghĩa là không cần return về 1 giá trị gì)
// // void nghĩa là: không có giá trị, không trả về gì cả
// public void getInformation(){
// // nhập thông tin bằng scanner
// Scanner sc = new Scanner(System.in);
// name = sc.nextLine();
// age = Integer.parseInt(sc.nextLine());
// };
// public void display(){
// // in ra các thông tin
// System.out.println(name);
// System.out.println(age);
// };

// }

// class Student {
// private String name, gender;
// private int age;
// private double gpa;

// public void displayInfo() {
// System.out.println(name);
// System.out.println(age);
// System.out.println(gender);
// System.out.println(gpa);
// }

// public String toString() {
// return name + age + gender + gpa;
// }

// // constructor có 4 tham số

// Student(String name, String gender, int age, double gpa) {
// this.name = name;
// this.gender = gender;
// this.age = age;
// this.gpa = gpa;
// }

// // constructor không có tham số
// Student() {
// this.name = "unknown";
// this.gender = "unknown";
// this.age = 0;
// this.gpa = 0.0;
// }
// }
// class Person {
// private String firstName;
// private String lastName;
// private int age;
// private boolean isStudent;

// public void displayInfo() {
// System.out.println(firstName);
// System.out.println(lastName);
// System.out.println(age);
// System.out.println(isStudent);
// }

// public String toString() {
// return firstName + lastName + age + isStudent;
// }

// // nhìn số 3 sẽ có tên method
// public boolean isAdult() {
// if (age > 18)
// return true;
// else
// return false;
// // return true/ false
// }

// Person(String firstName, String lastName, int age, boolean isStudent) {
// this.firstName = firstName;
// this.lastName = lastName;
// this.age = age;
// this.isStudent = isStudent;
// }
// }
// class Rectangle {
// // Attribute hay còn gọi là instance variable sẽ có phạm vi truy cập là
// private
// // (vì thông tin class cần được giấu đi)
// private double chieuDai;
// private double chieuRong;

// public void getInformation() {
// Scanner sc = new Scanner(System.in);
// chieuRong = Double.parseDouble(sc.nextLine());
// chieuDai = Double.parseDouble(sc.nextLine());
// };

// public void display() {
// System.out.println(chieuDai);
// System.out.println(chieuRong);
// System.out.println("area = " + getArea());
// System.out.println("Perimeter = " + getPerimeter());
// }

// // getArea() và getPerimeter()
// public double getArea() {
// return chieuDai * chieuRong;
// }

// public double getPerimeter() {
// return (chieuDai + chieuRong) * 2;
// }
// };
