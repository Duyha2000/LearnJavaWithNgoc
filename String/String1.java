package String;

import java.util.*;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine(); // chuoi = chuối 1
        String text2 = sc.nextLine();
        if (text1.length() > text2.length()) {
            System.out.println(text1);
        } else {
            System.out.println(text2);
        }

        /*
         * Bài tập 4: Xây dựng chương trình tìm chuỗi dài hơn trong hai chuỗi nhập từ
         * bàn phím
         * Nhập vào hai chuỗi text1 và text2
         * Sử dụng phương thức length() để tìm kích thước hai chuỗi, so sánh chúng và in
         * ra chuỗi dài hơn
         * Input: fibonacci - palindrome
         * Output: palindrome
         */
    }
}

// String name = "giang".toUpperCase();
// System.out.println(name);
// toLowerCase() : viết thường
// toUpperCase() : viết hoa

/*
 * Bài tập 4: Viết chương trình đếm số lượng nguyên âm trong một chuỗi.
 * 
 * Lấy chuỗi đầu vào cho một biến có tên là text.
 * Chuyển đổi chuỗi thành chữ thường bằng cách sử dụng toLowerCase() và gán nó
 * cho biến text.
 * Tạo biến số nguyên count để đếm số lượng nguyên âm của các từ.
 * Chạy một vòng lặp for trên chuỗi.
 * Trong mỗi lần lặp của vòng lặp, hãy sử dụng charAt() để truy cập từng ký tự
 * và kiểm tra xem ký tự có phải là nguyên âm hay không.
 * Nếu đó là nguyên âm, hãy tăng giá trị của count lên 1.
 * Input: i love Java Programming (u,e,o,a,i)
 * Output: 8
 */
// String name = sc.nextLine();
// int count = 0;
// for (int i = 0; i < name.length(); i++) {
// // không viết gộp được
// // 2 chuỗi mới dùng equals hoặc equasIgnoreCase
// // so sánh ký tự hay số chỉ cần dùng ==
// if (name.charAt(i) == 'u' || name.charAt(i) == 'e' || name.charAt(i) == 'o'
// || name.charAt(i) == 'a' ||
// name.charAt(i) == 'i') {
// count += 1;
// }
// }
// System.out.println(count);
// Bài tập 3: Mô tả bài toán
// Cho chuỗi "Fool Mouse". Hãy thay đổi chuỗi thành "Wool House".
// ĐỔi fool -> wool
// thay thế: replace ( Cú pháp: (chuỗi em muốn thay đổi).replace(char oldValue,
// char newValue)
// replace sẽ không thay đổi chuỗi gốc-> phải gán cho nó 1 biến khác để nhận giá
// trị
// String name = "Fool Mouse";
// String name2 = name.replace('F', 'W');
// System.out.println(name2);
/*
 * Bài tập 2: so sánh chuỗi
 * Viết chương trình so sánh hai chuỗi đầu vào.
 * 
 * Nhận hai chuỗi và gán cho các biến first và second.
 * So sánh hai chuỗi bằng equals() và in kết quả.
 * Input: Jackie - Jack
 * Output: false(vì 2 chuỗi này khác nhau)
 */
// equals(another String)
/*
 * ->You SHOULDN'T compare Strings using == as it checks if the two String
 * objects being compared refer to the same instance 2. equals performs
 * case-sensitive comparison
 */
// String chuoi1 = sc.nextLine();
// String chuoi2 = sc.nextLine();

// compare không so sánh được ký t ự hoa và thường
// equalsIgnoreCase(another String): so sánh không phân biệt hoa thường
// if (chuoi1.equalsIgnoreCase(chuoi2)) {
// System.out.println("true");
// } else {
// System.out.println("false");
// }
// Bài tập 1:
// Tìm vị trí phần tử đầu tiên có ký tự là 'c', nếu có in ra vị trí phần tử đó,
// nếu không in ra -1
// Input: abcdcd
// Output: 2 (vì c đầu tiên index = 2)
// int position = -1;
// String name = "abcdcd";
// for (int i = 0; i < name.length(); i++) {
// if (name.charAt(i) == 'x') {
// position = i;
// break;
// }
// }
// System.out.println(position);

// String name
// String name = "Tran Duc Duy";
// 01234567891011
// name = "Tran Duc Duy"
// vị trí đầu tiên của string là 0, và cuối cùng là name.length() - 1
// System.out.println(name.charAt(0));
// lấy ra ký tự cuối cùng là y cho anh
// System.out.println(name.charAt(name.length() - 1));
// char c = sc.nextLine().charAt(0);
// lấy ra chiều dài String ta dùng name.length() -> tính cả khoảng trắng
// --
// làm thế nào để in ra từng ký tự trong chuỗi (dùng vòng lặp for tương tự
// array)
// in từ ký tự 0 đến ký tự cuối, sao em lại truyền số 0 vào
// thôi em đổi ngành. Học đến đây em lag rồi. Cái array kia còn hiểu cái array
// string này em hơi k hiểu
// for (int i = 0; i < name.length() - 1; i++) {
// System.out.println(name.charAt(i));
// }
// Cho 1 chuỗi nhập từ bàn phím, đếm số lượng số khoảng trắng của chuối
// Ví dụ: "Trần Đức Duy" -> output: 2

// if (ký tự == khoảng trắng) tăng biến đếm lên 1
// bằng tiếng anh là gì
// equals(another String) [] charAt()

// name.charAt() là gì ạ? -> char at dịch ra tiếng việt là gì
// là ký tự ở vị trí thứ (...) - > gọi ra kí tự à anh?đúng r
// thế gọi ra vị trí cú pháp
// thì là viết i thôi
// i là vị trí, name.charAt là gọi ra ký tự, chỉ cần nhớ cho anh i là vị trí,
// bắt keyword bài bắt tìm index mới dùng i để xử lý, còn lại không được viết i
// giống hệt array mà, string và array giống nhau 90% rồi
// thế với array int là như nào ạ. Oke ạ tí em xem lại trang bên kia. Tắt cái
// này đi có mất không ạ?
// tại giờ lớp em tan em bị đuổi rồi