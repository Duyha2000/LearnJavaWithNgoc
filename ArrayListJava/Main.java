package ArrayListJava;

import java.util.*;

/*
Bài tập Array list:
 https://docs.google.com/document/d/1fObbHSO-LXaY0O6tWZjXHiron5s4ln7HS_0x7io0L3k/edit?tab=t.0#heading=h.3ejn5k2thnaf
 */
public class Main {
    public static void main(String[] args) {
        StudentManagement s = new StudentManagement();
        // Thêm mới:
        Student student = new Student(14655474, " Ngoc", 10);
        s.addStudent(student);
        // Hiển thị thông tin của tất cả student
        s.showAll();
        // Xóa thông tin học sinh dựa vào ID
        s.removeStudent(14655474);
        s.findStudentById(14655474);
        s.getAverageScore();
        s.sortByScore();
    }
}
// ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 4));
// Arrays.asList(5, 1, 2, 3, 4)
// sort: asc, desc
// Collections là 1 thư viện để xử lý sắp xếp, đảo ngược các phần tử trong
// Arraylist

// Collections.sort(numbers);

// // reverse: đảo các phần tử trong array
// Collections.reverse(numbers);
// for (Integer number : numbers) {
// System.out.print(number + " ");
// }

// isEmpty():
// if (numbers.isEmpty()) {
// System.out.println("Array không có phần tử");
// } else {
// for (Integer number : numbers) {
// System.out.print(number + " ");
// }
// }
// if(numbers.size()==0){

// Nhập 1 số và kiểm tra số đó có trong array numbers hay không, nếu có xóa phần
// tử đấy, nếu không thì in ra -1
// Input 1: numbers = [1,3,5,7,9], X = 3
// Output: [1,5,7,9]
// Scanner sc = new Scanner(System.in);
// int number = Integer.parseInt(sc.nextLine());
// ArrayList<Integer> numbers = new ArrayList<>();
// numbers.add(1);
// numbers.add(3);
// numbers.add(5);
// numbers.add(7);
// numbers.add(9);
// int position = -1;

// for (int i = 0; i < numbers.size(); i++) {
// if (number == numbers.get(i)) {
// position = i;
// break;
// }
// }
// numbers.remove(position);

// for (Integer num : numbers) {
// System.out.println(num);
// }

// Input 2: numbers = [1,3,5,7,9], X = 6
// Output: -1

// Scanner sc = new Scanner(System.in);
// // int [] so = new int[10];
// // 4 byte
// // int[] so1 = { 1, 2, 3 };
// ArrayList<Integer> numbers = new ArrayList<>();

// // add(number)
// numbers.add(3);
// numbers.add(5);
// numbers.add(7);
// numbers.add(1);
// // numbers = [3,5,7,1] -> thêm số 6 vào vị trí thứ 2
// // add(index,number)
// numbers.add(2, 6); // [3,5,6,7,1]

// // Chỉnh sửa phần tử: set(index,element)
// numbers.set(2, 9);

// // Xóa phần tử remove(index)
// numbers.remove(1);

// // Lấy ra các phần tử trong Arraylist
// // Cách 1: dùng vòng lặp for i
// // for (int i = 0; i < numbers.size(); i++) {
// // System.out.println(numbers.get(i));
// // }

// // // Update:
// // // Cách 2: dùng vòng lặp for each
// // for (Integer number : numbers) {
// // System.out.print(number + " ");
// // }

// // add, set, remove, contains, size