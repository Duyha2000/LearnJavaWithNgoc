package Child;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString mục đích để in ra thông tin của đối tượng
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
