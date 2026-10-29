// Demonstrates the compiler-added modifiers described on page 7
// of cgr_unit2_interfaces.pptx.
interface Printable { int MIN = 5; void print(); }
class Printer implements Printable {
    public void print() {
        System.out.println("MIN = " + MIN);
        System.out.println("Printing...");
    }
}
public class InterfaceConstantDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}
