// Based on cgr_unit2_Interfaces_default&static.pptx, page 10.
interface Sayable {
    default void say() { System.out.println("Hello, this is default method"); }
    void sayMore(String msg);
    static void sayLouder(String msg) { System.out.println(msg); }
}
public class SayableDemo implements Sayable {
    public void sayMore(String msg) { System.out.println(msg); }
    public static void main(String[] args) {
        SayableDemo dm = new SayableDemo();
        dm.say();
        dm.sayMore("Work is worship");
        Sayable.sayLouder("Helloooo...");
    }
}
