// Based on cgr_unit2_Interfaces_default&static.pptx, pages 6-7.
interface MyIF {
    int getNumber();
    default String getString() { return "Default String"; }
}
class MyIFImp implements MyIF {
    public int getNumber() { return 100; }
}
public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}
