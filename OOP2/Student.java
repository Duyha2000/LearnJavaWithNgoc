package OOP2;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Student(String name) {
        this.name = name;
    }

    // overloading method
    Student() {
        this.name = "";
    }

    public String toString() {
        return this.name;
    }
}
