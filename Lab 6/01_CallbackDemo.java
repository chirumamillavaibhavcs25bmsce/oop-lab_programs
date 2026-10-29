// Based on cgr_unit2_interfaces.pptx, pages 4-5.
interface Callback {
    void callback(int param);
}
class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces may also define other members, too.");
    }
}
public class CallbackDemo {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
        Client client = new Client();
        client.nonIfaceMeth();
    }
}
