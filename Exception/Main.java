package Exception;

import java.util.*;
// Bài tập: Trong phần này, chúng ta sẽ phát triển một ứng dụng tính chu vi và
// diện tích theo từng loại hình dựa trên menu chức năng.
// Menu gồm :

// Tính chu vi và diện tích hình chữ nhật .
// Tính chu vi và diện tích hình tam giác
// Thoát

// viết function/method bắt try catch input

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so;
        do {
            System.out.println("Nhập một số trong menu: ");
            System.out.println("Menu gồm:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình vuông");
            System.out.println("3. Thoát");
            so = sc.nextInt(); // a

            switch (so) {
                case 1:
                    System.out.println("Nhập chiều dài: ");
                    int a = sc.nextInt();
                    System.out.println("Nhập chiều rộng: ");
                    int b = sc.nextInt();
                    int chuVi = (a + b) * 2;
                    int dienTich = a * b;
                    System.out.println("Chu vi hình chữ nhật là: " + chuVi);
                    System.out.println("Diện tích hình chữ nhật là: " + dienTich);
                    break;

                case 2:
                    System.out.println("Nhập cạnh: ");
                    int c = sc.nextInt();
                    int chuViHinhVuong = c * 4;
                    int dienTichHinhVuong = c * c;
                    System.out.println("Chu vi hình vuông là: " + chuViHinhVuong);
                    System.out.println("Diện tích hình vuông là: " + dienTichHinhVuong);
                    break;

                case 3:
                    System.out.println("Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }

        } while (so != 3);
    }

    // Nhập thông tin cho số nguyên, nếu nhập chữ sẽ hiển thị ra lỗi và bắt nhập
    // lại:
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        // bắt nhập đi nhập lại cho đến khi người dùng phải nhập số nguyên thì thôi
        while (true) {
            System.out.println("Nhập vào 1 số");
            try {
                number = scanner.nextInt();

            } catch (InputMismatchException ime) {
                System.out.println("Nhập sai kiểu dữ liệu số nguyên");
            }
        }
        // return number;

    }

}

// Condition 2.java

// bài tập : nhập vào 1 ngày và check xem ngày thứ mấy trong tuần? day = 2 ->
// Monday, day = 3 -> Tuesday...
// day -> 2,3,4,5,6,7,CN
// int day = sc.nextInt();
// switch (day) {
// case 2:
// System.out.println("Thứ 2");
// break;
// default:
// System.out.println("Nhập sai rồi!!!!");
// }
// // String result = "";
// // switch (so) {
// // case 0: {
// // result = "Sunday";
// // break;
// // }
// // case 1: {
// // result = "Monday";
// // break;
// // }
// // case 2: {
// // result = "Tuesday";
// // break;
// // }
// // case 3: {
// // result = "Wednesday";
// // break;
// // }
// // default: {
// // result = "Khong";
// // break;
// // }
// // }

// // System.out.println(result);

// 1 ví dụ: try - catch - finally
// System.out.println("Nhập tuổi của bạn:");
// try {
// int age = scanner.nextInt();
// System.out.println("Tuoi cua ban la:" + age);
// int error = age / 0; // 2 / 0
// System.out.println(error);
// } catch (InputMismatchException ime) {
// System.out.println("Mời bạn nhập số vào");
// } catch (ArithmeticException ae) {
// System.out.println("Không được chia 1 số cho 0");
// }

// array 5 phần tử

// java.lang.ArrayIndexOutOfBoundsException
// try {
// int[] number = new int[] { 1, 2, 3, 4, 5 };
// System.out.println(number[6]);
// } catch (ArrayIndexOutOfBoundsException aioobe) {
// System.out.println(aioobe);
// }
// set up project thì sẽ làm luôn try catch sẵn

// try {
// int age = scanner.nextInt();
// System.out.println("Tuoi cua ban la:" + age);
// int error = age / 3; // 2 / 0
// System.out.println(error);
// } catch (Exception e) {
// System.out.println(e);
// }
// System.out.println("1234");

// int number; // Variable for storing user choice

// do {
// System.out.println("Chào mừng bạn đến chương trình. Menu gồm:");
// System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số.");
// System.out.println("2. Kiểm tra một số có chia hết cho 3 không.");
// System.out.println("3. Thoát");
// System.out.print("Nhập lựa chọn của bạn: ");
// number = sc.nextInt(); // Get user input

// // Menu processing using switch-case
// switch (number) {
// case 1:
// System.out.print("Nhập vào 1 số: ");
// int a = sc.nextInt();
// if (a % 2 == 0) {
// System.out.println("Số chẵn.");
// } else {
// System.out.println("Số lẻ.");
// }
// break;

// case 2:
// System.out.print("Nhập vào 1 số: ");
// int b = sc.nextInt();
// if (b % 3 == 0) {
// System.out.println("Số chia hết cho 3.");
// } else {
// System.out.println("Số không chia hết cho 3.");
// }
// break;

// case 3:
// System.out.println("Thoát chương trình. Tạm biệt!");
// break;

// default:
// System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
// }

// System.out.println(); // Add a blank line for readability
// } while (number != 3); // Loop until user selects option 3
// // chọn 1 hoặc 2 thì vẫn sẽ show menu lên, chọn 3 mới thoát