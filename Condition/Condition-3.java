package Condition;

// public class Condition {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
/*
 * Bài tập 1: Nhập từ bàn phím một số nguyên, kiểm tra và in kết quả số đó có
 * chia hết cho cả 3 và 5 không .
 * 3 bước:
 * 1. Nhập số nguyên number .
 * 2. Sử dụng câu lệnh điều kiện if-else
 * 3. In kết quả .
 */
// input cách khác
// int number = sc.nextInt();
// toán tử 3 ngôi: ternary operator
// String result = condition ? statment true : statement false
// String result = (number % 3 == 0 && number % 5 == 0) ? "chia het cho 3 va 5"
// : "khong chia het cho 3 va 5";
// System.out.println ( result);
// if ( number % 5 == 0 && number % 3 == 0 ) {
// System.out.println ( number + " chia het cho 3 va 5");
// }
// else {
// System.out.println( " khong chia het cho 3 va 5");
// }

// Bài tập 2:
// double a = Double.parseDouble(sc.nextLine()); // 4
// double b = Double.parseDouble(sc.nextLine());
// double c = Double.parseDouble(sc.nextLine());

// if (a > 0 && b > 0 && c > 0 && (a + b) > c && (a + c) > b && (c + b) > a) {
// System.out.println("tam giac thuong");
// // tam giác cân
// if (a == b || a == c || c == b) {
// System.out.println("tam giac cân");
// } else if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b
// == a * a) {
// System.out.println(" tam giac vuong");
// } else if (a == b && b == c && c == a) {
// System.out.println(" tam giac deu ");
// } else {
// System.out.println("tam giac vuong can");
// }
// } else {
// System.out.println("khong la tam giac");
// }
// a^2 + b^2 = c^2
// 5 câu lệnh điều kiện: mệnh đề đầu là if-
// else if là những mệnh đề ở giữa
// else là mệnh đề cuối

// sql: cơ sở dữ liệu
// linux: unix - web system -> siêu khó

// information system - SQL
// double chiSoMoi = Double.parseDouble(sc.nextLine());
// double chiSoCu = Double.parseDouble(sc.nextLine());
// double soDien = chiSoMoi - chiSoCu;

// if (0 <= soDien && soDien <= 50) {
// System.out.println(" 10k ");
// } else if (50 <= soDien && soDien < 100) {
// System.out.println("15k");
// } else if (100 <= soDien && soDien < 150) {
// System.out.println("20k");
// } else if (150 <= soDien && soDien < 200) {
// System.out.println("25k");
// } else if (200 <= soDien) {
// System.out.println("30k");
// } else {
// System.out.println("khong");
// }
// int ngay = Integer.parseInt(sc.nextLine());
// int thang = Integer.parseInt(sc.nextLine());
// int nam = Integer.parseInt(sc.nextLine());

// if (nam > 0 && (1 <= thang && thang <= 12) && (0 < ngay && ngay < 32)) {
// System.out.println(" hom nay la " + "ngay " + ngay + "thang " + thang + "nam
// " + nam);
// } else {
// System.out.println("khong");
// }
// bôi đen rồi ctrl ?
// làm lại đi anh đi lấy đồ ăn tí

// chuỗi và số trong java công lại thành phép nối chuỗi
// int b = 5;
// System.out.println("4" + b + 10); // "45" + 10 // "4510"
// int ngayCongTrongThang = 26;
// double luongCoBan= Double.parseDouble(sc.nextLine());
// int ngayCongThucTe= Integer.parseInt(sc.nextLine());
// double tienMotNgayCong = luongCoBan / ngayCongTrongThang;
// double luongThat = tienMotNgayCong * 26;
// if ( ngayCongThucTe > ngayCongTrongThang ) {
// double quaGio = (ngayCongThucTe - ngayCongTrongThang ) * 1.5 *
// tienMotNgayCong;
// System.out.println("luong that : " + (luongThat+ quaGio));
// }
// else {
// System.out.println("luong that : " + luongThat);
// }
// int lưu được 8 chữ số khi nhập
// int doanhThuBanHang = Integer.parseInt(sc.nextLine());
// if (doanhThuBanHang <= 100000000) {
// System.out.println(" hoa hong 5%");
// }
// // số nào to thì thêm L (long)
// else if (doanhThuBanHang <= 3000000000L) {
// System.out.println("hoa hong 10%");
// } else if (doanhThuBanHang > 300000000) {
// System.out.println("hoa hong 20%");
// } else {
// System.out.println("khong");
// }
// // morning
// }
// }
