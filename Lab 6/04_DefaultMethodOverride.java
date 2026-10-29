// Based on cgr_unit2_Interfaces_default&static.pptx, page 8.
interface MyIF {
    int getNumber();
    default String getString() { return "Default String"; }
}
class MyIFImp2 implements MyIF {
    public int getNumber() { return 100; }
    public String getString() { return "This is a different string."; }
}
public class DefaultMethodOverride {
    public static void main(String[] args) {
        MyIFImp2 obj = new MyIFImp2();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}
