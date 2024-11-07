package Function;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bag b = new Bag(40, 1.2);
        System.out.println(b.capacity + " " + b.weight);
        // int[] a = new int[] { 2, 3, 4, 5, 6 };
        // System.out.println(arraySum(a));
        // double a = Double.parseDouble(sc.nextLine());
        // double b = Double.parseDouble(sc.nextLine());
        // System.out.println(division(a, b));
        // int[] comp1010 = new int[] { 100, 70, 100, 90, 100 };
        // System.out.println(nHundred(comp1010));
        // int[] taxi = new int[] { 10, 70, 20, 90 };
        // int[] cab = new int[] { 60, 10, 70, 40 };
        // System.out.println(sameLength(taxi, cab));
        // System.out.println(sameLength(taxi, cab));
        // int[] taxi = null;
        // // System.out.println(isOfLength(taxi, 4)); // true
        // System.out.println(isOfLength(taxi, 0)); // false
        // System.out.println(isOfLength(taxi, 0)); // false
        // FootballMatch m = new FootballMatch();
        // m.homeTeam = "Japan";
        // m.awayTeam = "Norway";
        // m.homeGoals = 3;
        // m.awayGoals = 1;
        // System.out.println(m.homeTeam + " " + m.awayTeam + " - " + m.homeGoals + " "
        // + m.awayGoals);
    }
}

class Bag {
    public int capacity;
    public double weight;

    Bag(int capacity, double weight) {
        this.capacity = capacity;
        this.weight = weight;
    }
}

// nhìn test case nè, m.homeTeam, nếu homeTeam em để private thì không truy cập
// được, nên ở đây phải ----------------->đổi thành public
// do chưa học bài tính đóng gói nên nó để public thôi, chạy đi em!
// class FootballMatch {
// public String homeTeam;
// public String awayTeam;
// public int homeGoals;
// public int awayGoals;

// }

/*
 * public static int arraySum(int[] a) {
 * int sum = 0;
 * for (int i = 0; i < a.length; i++)
 * sum += a[i];
 * return sum;
 * }
 */

// public static int nHundred(int[] comp1010) {
// int count = 0;
// // 100,70,100,90,100 đem từng số đi so sánh với số 100 comp1010[0]
// for (int i = 0; i < comp1010.length; i++) {
// if (comp1010[i] == 100) {
// count += 1;
// }
// }
// return count;
// }
// method
// public static boolean isOfLength(int[] taxi, int number) {
// if (taxi.length == number)
// return true;
// else
// return false;
// }

// public static boolean sameLength(int[] taxi, int[] cab) {
// // cho 2 mảng này chiều dài bằng nhau đi, em nhìn tên array xem sameLength?
// if (cab.length == taxi.length) {
// return true;
// } else {
// return false;
// }
// }