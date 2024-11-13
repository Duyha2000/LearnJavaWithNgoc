package Child;

public class Child2 extends Person {
    private String hobby;

    public Child2(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    protected void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String toString() {
        return super.toString() + ", Hobby: " + hobby;
    }
}
