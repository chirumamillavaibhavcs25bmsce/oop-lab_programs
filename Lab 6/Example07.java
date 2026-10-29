public abstract class Example07 {
    public static void main(String args[]) {
        // This line from the PDF causes a compilation error:
        // Example07 gfg = new Example07();
        System.out.println("main() can run, but an abstract object cannot be created.");
    }
}
