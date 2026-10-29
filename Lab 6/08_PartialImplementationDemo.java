// Based on cgr_unit2_interfaces.pptx, page 6.
interface Callback { void callback(int param); }
abstract class Incomplete implements Callback {
    int a, b;
    void show() { System.out.println(a + " " + b); }
}
class Complete extends Incomplete {
    public void callback(int param) {
        System.out.println("callback called with " + param);
    }
}
public class PartialImplementationDemo {
    public static void main(String[] args) {
        Complete obj = new Complete();
        obj.a = 10;
        obj.b = 20;
        obj.show();
        obj.callback(42);
    }
}
