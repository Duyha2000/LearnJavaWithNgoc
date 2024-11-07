package OOP;

import java.util.*; // dùng tất cả thư viện

// B2 là 1 class
public class B2 {
    public static void main(String[] args) {
        // unit 2:
        // OOP: object để tổ chức code
        // Tạo ra đối tượng mới (new)
        // argument: đối số
        Scanner scanner = new Scanner(System.in);

        // System.out.println(person.average(3, 3.4, 3.5));
        // Input:
        // int age = scanner.nextInt();
        // int age = Integer.parseInt(scanner.nextLine());

        String s2 = "ngoc";
        System.out.println(s2.length()); // 4
        System.out.println(s2.charAt(2)); // o
        // Array: lưu trữ các object, giá trị có cùng kiểu dữ liệu
        String[] names = { "Ngọc", "Quỳnh", "Giang" };
        // In ra các phần tử trong array
        // for (int i = 0; i < names.length - 1; i++) {
        // System.out.println(names[i]);
        // }

        for (String name : names) {
            System.out.println(name);
        }

        int[] ages = new int[5];
        // for (int i = 0; i < ages.length - 1; i++) {
        // ages[i] = scanner.nextInt();
        // }

        // for (int age : ages) {
        // System.out.println(age);
        // }

        // String object
        // int, double, float, boolean, char
        // object: String

        // person.setAge(10);
        // System.out.println(person.getAge());
        // person.setName("Đức");
        // System.out.println(person.getName());
        Person p1 = new Person();
        System.out.println("xxxxx");
        System.out.println(p1);
    }
    // Classes: để làm gì. Ví dụ:

}

// Methods

// Tên class sẽ viết hoa: person -> Person
class Person {
    // attribute : instance of variable:
    private int age;
    private String name;

    // Method signature:
    // Access modifier: phạm vi truy cập (public, private, protected)
    // return type: void(no return type), int/double/String/boolean
    // methodName displayData()
    // (...): parameter list
    // viết hàm gì đấy đi
    // hàm tính điểm trung bình 3 môn toán lý hóa
    public double average(double toan, double li, double hoa) {
        return (toan + li + hoa) / 3;
    }

    // vì sao private?
    // dùng gì để thay đổi thông tin ??
    // getter (lấy ra) - setter (thay đổi giá trị)
    // methods: actions of an object (chạy, nhảy, thay đổi thông tin, in ra thông
    // in)
    // study(), toString(), displayData(), sum()
    // void : in ra thông tin -> không có "return"
    public void displayData() {
        System.out.println("age" + age);
        System.out.println("name" + name);
    }

    // tính tổng 2 số a,b (2 số nguyên)
    // int a, int b gọi là: parameter (tham số)
    public int sum(int a, int b) {
        return a + b;
    }

    // Constructor:
    // this -> trỏ đến attribute
    // public Person(int age, String name) {
    // this.name = name;
    // this.age = age;
    // }

    // getter cho name
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // tuổi
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString
    public String toString() {
        return this.name + " " + this.age;
    }

    // Khi khởi tạo 1 class mặc định nó sẽ 1 default constructor
    Person() {
        this.name = "";
        this.age = 0;
    }
}
