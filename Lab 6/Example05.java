abstract class Base {
    void fun() {
        System.out.println("Function of Base class is called");
    }
}

class Derived extends Base {
}

public class Example05 {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.fun();
    }
}
