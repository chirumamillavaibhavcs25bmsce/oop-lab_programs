abstract class Base {
    final void fun() {
        System.out.println("Base fun() called");
    }
}

class Derived extends Base {
}

public class Example06 {
    public static void main(String args[]) {
        Base b = new Derived();
        b.fun();
    }
}
