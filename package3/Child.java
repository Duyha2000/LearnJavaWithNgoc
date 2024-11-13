package package3;

import package2.Parent;

// private public
public class Child extends Parent {
    @Override
    protected void protectedMethod() {
        protectedVal = 2;
        protectedMethod();
    }
}
