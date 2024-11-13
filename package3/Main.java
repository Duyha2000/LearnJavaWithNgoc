package package3;

public class Main {
    public static void main(String[] args) {
        // A a = new B();
        // System.out.println(a);
        Child child = new Child();
        child.protectedMethod();
    }
}

// class A {
// public A() {
// System.out.println("The default constructor of A is invoked");
// }
// }

// class B extends A {
// public B() {
// // super();
// System.out.println("The default constructor of B is invoked");
// }
// }