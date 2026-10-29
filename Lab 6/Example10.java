abstract class Demo {
    abstract void m1();
}

class Child extends Demo {
    public void m1() {
        System.out.print("Hello");
    }
}

public class Example10 {
    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
    }
}
