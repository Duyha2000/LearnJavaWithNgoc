// package Loops;
// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// // từ sau 12h trưa đến đêm mai

// // 1. while, do-while
// // 2. array (*)
// // 1-> 43 (--)
// for (int i = 1; i <= a; i++) {
// if (i % 3 == 0 && i % 5 == 0) {
// System.out.println(i);
// break; // ngay sau khi thỏa mãn sẽ dừng chương trình
// }
// }
// // Bài tập: nhập 1 số từ 1 đến n, in ra số đầu tiên chia hết cả 3 và 5. Ví
// dụ: n
// // = 43 -> Output: 15
// }

// }

// // Bài tập 9: Tìm ước số chung lớn nhất (Ước chung lớn nhất) của hai số
// // Nhập vào hai số nguyên dương a và b. Sử dụng vòng lặp for để tìm ước số
// chung
// // lớn nhất của hai số và in ra kết quả.
// // Input: a = 48 b = 60
// // Output: 12 (vì 48 và 60 đều chia hết cho 1 số lớn nhất là 12)
// // int a = sc.nextInt(); // 48 -> ước số lớn nhất 48?
// // int b = sc.nextInt(); // 60
// // // từ 1 đến số nhỏ hơn -> 2 thằng này đều chia hết 1 số lớn nhất thì đó là
// // ucln
// // // in các ước 48?

// // // a,b đều chia hết cho 1 số lớn nhất thì đấy là ucln
// // // i sẽ chạy từ 48 về 1
// // for (int i = a; i >= 1; i--) {
// // if (a % i == 0 && b % i == 0) {
// // System.out.println(i);
// // break;
// // // làm thế nào để chỉ xuất hiện 1 số thôi (hiện tại đang ra 6 số)
// // }
// // }
// // // Bài tập 4: nhập vào 1 số và in ra các số từ 1 đến n (trừ số 3). Ví dụ
// nhập
// // n
// // // = 7 -> in ra 1 2 4 5 6 7
// // // k cần dùng continue (dùng != cũng giải quyết được)
// // int a = sc.nextInt();
// // // in ra các số chẵn từ 1 đến n
// // for (int i = 1; i <= a; i++) {
// // // in ra những giá trị khác 3
// // // continue: bỏ qua giá trị
// // // if (i == 3) continue;
// // // System.out.println(i);

// // // mình sẽ bỏ những số lẻ
// // if( i % 2 != 0) continue;
// // System.out.println(i + " ");
// // }

// // Bài tập 5: Hãy đếm số lượng các số lẻ không chia hết cho 5 và không chia
// hết
// // cho 7 nằm trong
// // một đoạn [a,b] (tính cả a và b), với a,b nhập từ bàn phím. =)))))
// // Input: 3 9
// // Output: 2
// // int a = sc.nextInt();
// // int b = sc.nextInt();
// // int count = 0;
// // // 3 9
// // for (int i = a; i <= b; i++) {
// // if (i % 5 != 0 && i % 7 != 0 && i % 2 != 0) {
// // count++;
// // System.out.println(i + " ");
// // }
// // }
// // System.out.println(count);
// // Bài tập 2: Nhập vào 1 khoảng số và tính t ổng các số chẵn trong khoảng đó
// // int a = sc.nextInt();
// // int b = sc.nextInt();
// // int sum = 0;
// // for (int i = a; i < b; i++) {
// // if (i % 2 == 0) {
// // sum = sum + i;
// // }
// // }
// // System.out.println(sum);

// // Bài tập 3: Nhập 1 số và check xem có phải nguyên tố hay không
// // int a = sc.nextInt(); // 13
// // i chạy từ 2 đến căn bậc 2 của a
// // i chạy từ 2 đến 3.333 (2.3)
// // không in ra trong vòng lặp for trong đa số trường hợp (vì sẽ bị in nhiều
// lần)
// // while for đều là vòng lặp, dùng thay thế cho nhau được
// // kiểm tra đúng hoặc sai sẽ tạo 1 biến boolean
// // boolean isPrime = true;
// // for (int i = 2; i <= Math.sqrt(a); i++) {
// // if (a % i == 0) {
// // isPrime = false;
// // }
// // }
// // // In ra ngoài vòng lặp for sẽ không bị in ra nhiều lần
// // if (isPrime == true) {
// // System.out.println(a + " la so nguyen to");
// // } else {
// // System.out.println(a + " la so nguyen to");
// // }
// // Bài tập 1:
// // int n = sc.nextInt();
// // for (int i = n; i <= 100; i++) {
// // if (i % 2 == 0) {
// // System.out.println(i);
// // }
// // }
// // Bài tập 3:
// // int a = sc.nextInt();
// // int b = sc.nextInt();
// // for (int i = a; i <= b; i++) {
// // if (i % 3 == 0 && i % 5 == 0) System.out.println(i);
// // }
// /*
// * Bài tập 2: Nhập 1 số tính lũy thừa của một số:
// *
// * Ví dụ: 5! = 5 * 4 * 3 * 2 * 1
// * 4! = 4 * 3 * 2 * 1
// */
// //
// // int number = sc.nextInt();
// // int multiply = 1; // tích = 1
// // // i sẽ lùi từ 5 về ?
// // for (int i = number; i >= 1; i--) {
// // // 5 * 4 * 3 * 2 * 1 -> gán vào 1 biến để in ra màn hình
// // multiply = multiply * i; // 20 * 3 = 60 // nhân dồn các giá trị với nhau
// // }
// // System.out.println(multiply);

// // // tính tổng các số từ 1 đến n

// // int sum = 0;
// // for ( int i = number; i >=1; i++){
// // sum=sum+i;
// // }
// // System.out.println(sum);

// // Bài tập 4: Hiển thị các ước số của 1 số
// // Số 12 (number) -> ước là: 1 2 3 4 6 12
// // for từ 1 đến số đấy, number chia hết cho số nào từ 1 đến số đấy thì nó
// chính
// // là ước số
// // int number = sc.nextInt(); // 12
// // // i chạy từ 1 - > 12
// // for (int i = number; i >= 1; i--) {
// // if (number % i == 0) {
// // System.out.print(i + " ");
// // }}

// // Bài tập 5:
// // Input ?
// // int a = sc.nextInt(); // 2
// // int b = sc.nextInt(); // 3
// // // tính tích phải có biến mutiply = 1, tính tổng có sum = 0
// // int multiply = 1;

// // for (int i = 1; i <= b; i++) {
// // multiply = multiply * a;
// // }
// // System.out.println(multiply);
// // Output: 2 ^ 3 = 8 (2 * 2 * 2)
// // lặp đi lặp lại 1 hành động nhân các số 2 vào với nhau, số lần lặp phụ
// thuộc
// // vào b
