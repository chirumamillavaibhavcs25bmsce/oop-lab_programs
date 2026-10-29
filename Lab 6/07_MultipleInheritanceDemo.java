// Based on cgr_unit2_interfaces.pptx, pages 11-12.
interface Printable { void print(); }
interface Showable { void show(); }
public class MultipleInheritanceDemo implements Printable, Showable {
    public void print() { System.out.println("Hello"); }
    public void show() { System.out.println("Welcome"); }
    public static void main(String[] args) {
        MultipleInheritanceDemo obj = new MultipleInheritanceDemo();
        obj.print();
        obj.show();
    }
}
