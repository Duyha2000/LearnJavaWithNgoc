package Parent;

import Child.Child2;
import Child.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println(person);
        // khởi tạo ra 1 đối tượng Child
        Child2 child = new Child2("Alice", 3, "Play football");
        child.setHobby("Play game");

    }
}
