import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = { 2, 3, 6, 6, 7, 8 }; // khởi tạo array khi biết trước các phần tử
        // -> 0 1. 2. 3. 4. 5
        // Nhập 1 số X, in ra vị trí của phần tử đầu tiên bằng với số trong array, nếu
        // không tìm thấy phần tử, in ra -1
        // Ví dụ: Input: 6 -> output: 2
        // Ví dụ: Input: 5 -> output: -1
        int number = sc.nextInt(); // 5
        // ***** Những bài toán bắt in ra chỉ số (nếu không tìm thấy phần tử in ra -1)
        // -> ta sẽ khởi tạo biến position = -1
        int position = -1;
        for (int i = 0; i < array1.length; i++) {
            // in ra vị trí, không phải in ra số 1
            if (number == array1[i]) {
                position = i;
                break;
            }
        }
        System.out.println(position);
        //
        // Buổi sau học function
        // Buổi sau nữa do while, while
        // Ôn 1,2 buổi oop
    }

}

// Bài tập 8: Nhập và một số nguyên dương n, arr. Đếm trong mảng có tất cả bao
// nhiêu số nguyên tố?
// Input: n = 5 -> [3, 4, 5, 6, 7] Output: 3 (3 , 5 ,7 ) là số nguyên tố

// // Bài tập 2: Sắp xếp mảng theo thứ tự tăng dần.
// Input: [2,9,6,6,7,8] Output: [2,6,6,7,8,9]
// Arrays.sort(numbers); // sort array
// for(int number : numbers){
// System.out.print(number + " ");
// }

// lấy ra phần tử max và min trong array numbers (max = 9 , min = 2)
// Arrays.sort(numbers);
// System.out.println(numbers[0]);
// System.out.println(numbers[numbers.length - 1]);
// [2, 6, 6, 7 , 8, 9 , 9 ,9]
// lấy phần tử lớn thứ 2 trong array
// vòng lặp for -> if

// for (int i = numbers.length - 1; i >= 0; i--) {
// if (numbers[i] < numbers[numbers.length - 1]) {
// System.out.println(numbers[i]);
// break;
// }

// Bài tập 4: Đếm các số lớn hơn 5 trong mảng
// Bài tập 5: in ra tích các số trong array
// Bài tập 6: Tìm số lần xuất hiện của một giá trị trong mảng:
// Yêu cầu người dùng nhập một mảng số nguyên và một giá trị cần tìm. Sau đó,
// tìm và in ra số lần mà giá trị đó xuất hiện trong mảng.
// Input: arr = 3 4 5 3 -> X = 3 Output: 2
// Bài tập 3: In mảng theo thứ tự nghịch đảo:
// Yêu cầu người dùng nhập một mảng số nguyên, sau đó in ra mảng theo thứ tự
// ngược đảo (từ cuối lên đầu). Input: 2 9 8 7 9 Output: 9 7 8 9 2

// for (int i = numbers.length - 1; i >= 0; i--) {
// System.out.println(numbers[i]);
// }

// Bài tập 5: Tính tích các số trong mảng
/*
 * Bài tập 1: Tính tổng các phần tử trong mảng:
 * Yêu cầu người dùng nhập một mảng số nguyên, sau đó tính tổng tất cả các phần
 * tử trong mảng. Input: 1 2 3 4 5 Output: sum = 15
 * int sum = 0;
 * for (int ele : numbers) {
 * sum += ele;
 * }
 * System.out.println(sum);
 * 
 */
// }
// for each:
// for (int ele : numbers) {
// System.out.println(ele);
// }
// Array: lưu trữ các biến, giá trị có cùng kiểu dữ liệu
// Nhập 10 số nguyên và *; in ra màn hình:

// Cú pháp array: kiểu dữ liệu [] tên array = {....}
// int[] numbers = { 1, 2, 3, 5, 4 };
// 0. 1. 2. 3. 4
// Chỉ số của array: bắt đầu từ 0,
// Chiều dài của array: numbers.length()
// Chỉ số kết thúc (cuối cùng) của array: là numbers.length - 1
// truy cập 1 phần tử trong mảng ta dùng numbers[index]
// truy cập phần tử đầu tiên trong array
// System.out.println(numbers[0]); // 1
// System.out.println(numbers[2]);
// System.out.println(numbers[numbers.length - 1]);

// in các phần tử trong mảng: dùng vòng lặp in ra mảng
// lặp đi lặp lại 1 công việc: lấy phần tử trong mảng ra -> và in

// }
// for each:
// for (int ele : numbers) {
// System.out.println(ele);
// }

// --
// Drink coke = new Drink(600, true);
// if (coke.containsSugar) {
// System.out.println("This is a sugary drink");
// }
// // private không truy cập được ở class khác
// // coke.quantityLeft -= 100;
// }
// class Drink {
// // containsSugar có phạm vi truy cập ( nếu không viết public hoặc private thì
// // phạm vi truy cập là mặc định, > private)
// boolean containsSugar;
// private double quantityLeft; // tính chất đóng gói(che dấu các thông tin quan
// trọng)
// // muốn truy cập vào attribute phải dùng getter setter

// Drink(double quantityLeft, boolean containsSugar) {
// this.quantityLeft = quantityLeft;
// this.containsSugar = containsSugar;
// }
// }
