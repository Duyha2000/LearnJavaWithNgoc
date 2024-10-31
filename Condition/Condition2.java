package Condition;
// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // String result = "";
// // số chẵn: 2 4 8 10
// // if (n % 2 == 0) {
// // System.out.println("even number");
// // } else {
// // System.out.println("odd number ");
// // }
// // ternary operator:
// // condition ? state true : true
// // condition: n % 2 == 0
// // statement true: even number
// // --------------
// // result = n % 2 == 0 ? "even number" : "odd number ";
// // System.out.println(result);

// // Bài tập 2:
// // int luong1 = sc.nextInt();
// // int luong2 = sc.nextInt();
// // String result = "";
// // result = luong1 > luong2 ? "nguoi 1 luong cao hon" : "nguoi 2 luong cao
// hon";
// // System.out.println(result);

// // Bài tập 3: lowercase, uppercase

// // char a = sc.nextLine().charAt(0); // input character

// // // Hàm kiểm tra viết thường: Character.isLowerCase(a)
// // if (Character.isLowerCase(a)) {
// // System.out.println(a + " is lowercase");
// // }
// // // Hàm kiểm tra viết hoa: Character.isLowerCase(a)
// // else if (Character.isUpperCase(a)) {
// // System.out.println(a + " is uppercase");
// // } else {
// // System.out.println(a + " is non-letter character ");
// // }

// // Bài tập 5:
// // int nam = sc.nextInt();
// // // == -> != : khác
// // if ( nam % 4 == 0 || nam % 400 == 0 && nam % 100 != 0 ) {
// // System.out.println ( nam + " la nam nhuan");
// // }
// // else {
// // System.out.println ( nam + " la nam khong nhuan ");
// // }

// // Bài 6: if, else if và else
// // int so = sc.nextInt();
// // if (so == 0) {
// // System.out.println(" Sunday ");
// // } else if (so == 1) {
// // System.out.println(" Monday ");
// // } else if (so == 2) {
// // System.out.println(" Tuesday ");
// // } else if (so == 3) {
// // System.out.println("Wednesday ");
// // } else {
// // System.out.println(" khong ");
// // }

// // switch: chuyển đổi
// // case: trường hợp
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

// // Bài tập 7: Given two integer variables a and b, and a character variable c
// // entered from the keyboard. The variable c is one of the four characters:
// '+',
// // '-', '*', or '/'. Write a program to display the value of the expression
// when
// // applying the operation c on a and b.
// // sc.nextInt() -> nhập số thập phân (không tạo xuống dòng mới khi input)
// // sc.nextLine() -> nhập chuỗi -> Integer.parseInt: ép chuỗi sang số nguyên
// (vì
// // có nextLine nên khi input sẽ xuống dòng mới)
// // int a = Integer.parseInt(sc.nextLine());
// // int b = Integer.parseInt(sc.nextLine());
// // // int a = sc.nextInt();
// // // int b = sc.nextInt();
// // char c = sc.nextLine().charAt(0);
// // int result = 0;
// // // if else if else

// // switch (c) {
// // case '+': {
// // result = a + b;
// // break;
// // }
// // case '-': {
// // result = a - b;
// // break;
// // }
// // case '*': {
// // result = a * b;
// // break;
// // }
// // case '/': {
// // result = a / b;
// // break;
// // }
// // }

// // System.out.println(result);

// // Bài tập 8: Viết chương trình cho phép người dùng nhập điểm các môn: toán,
// // văn, anh. Tính điểm trung bình các môn học và hiển thị xếp loại theo điều
// // kiện:

// // 8.0 <= ĐTB <= 10: xếp loại GIỎI.

// // 6.5 <= ĐTB <= 7.9: xếp loại KHÁ.

// // 5.0 <= ĐTB <= 6.4: xếp loại TRUNG BÌNH.

// // ĐTB < 5.0: xếp loại YẾU.
// // Cách input thứ 2: Double.parseDouble(sc.nextLine())
// double toan = sc.nextDouble();
// double van = sc.nextDouble();
// double anh = sc.nextDouble();
// double dtb = (toan + van + anh) / 3;
// // 8 -> 10
// if ( 8.0 <= dtb && dtb <= 10 ) {
// System.out.println ( " gioi ");
// }
// else if (6.5 <= dtb && dtb <= 7.9) {
// System.out.println ( " kha ");
// }
// else if ( 5.0 <= dtb && dtb <= 6.4 ) {
// System.out.println (" Trung Binh");
// }
// else if(dtb < 5.0){
// System.out.println(" YẾU ");
// } else{
// System.out.println("Nhập lung tung rồi");
// }
// }
// }