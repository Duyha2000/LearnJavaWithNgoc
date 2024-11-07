package NgocKhongRotMon;

public class Main {
    public static void main(String[] args) {
        // Person p = new Person("Lionel Messi");
        // System.out.println(p.toString());
        Restaurant[] favourites = new Restaurant[50];
        // Restaurant tạo ra quán ăn đầu tiên từ class trên:

        // B1: Khởi tạo 1 object
        // B2: Giá trị của object sẽ là distance + 5 , reviews - 10
        for (int i = 0; i < 50; i++) {
            int d = 5, r = 1000;
            d += 5 + 5 * i;
            r -= 10;

            Restaurant restaurant = new Restaurant(d, r); // restaurant: 5 - 1000

            favourites[i] = restaurant; // i = 2 : cửa hàng thứ 3

        }
    }
}

class Restaurant {
    public int distance, reviews;

    public Restaurant(int d, int r) {
        distance = d;
        reviews = r;
    }
}
// class Person {
// private String firstName;
// private String lastName;

// public String toString() {
// return firstName + " , " + lastName;
// }

// Person(String fullName) {
// // Biến chuỗi thành array
// // "Lionel Messi" -> ["Lionel", "Messi"]
// String[] nameStrings = fullName.split(" ");
// this.firstName = nameStrings[1];
// this.lastName = nameStrings[0];
// }
// }