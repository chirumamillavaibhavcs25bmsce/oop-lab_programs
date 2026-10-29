abstract class Base {
    abstract void fun();
}

class Derived extends Base {
    void fun() {
        System.out.println("Derived fun() called");
    }
}

public class Example03 {
    public static void main(String args[]) {
        // Base b = new Base(); // Compilation error: abstract class
        Base b = new Derived();
        b.fun();
    }
}