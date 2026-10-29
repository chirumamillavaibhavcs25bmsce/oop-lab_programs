class StaticKeyword {
    int rollNo;
    String name;

    // Static variable
    static String college = "ABC College";

    // Constructor
    StaticKeyword(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Static method
    static void changeCollege() {
        college = "XYZ College";
    }

    // Display details
    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("College : " + college);
        System.out.println();
    }

    public static void main(String[] args) {

        StaticKeyword s1 = new StaticKeyword(101, "Rahul");
        StaticKeyword s2 = new StaticKeyword(102, "Aman");

        System.out.println("Before changing college:");
        s1.display();
        s2.display();

        StaticKeyword.changeCollege();

        System.out.println("After changing college:");
        s1.display();
        s2.display();
    }
}