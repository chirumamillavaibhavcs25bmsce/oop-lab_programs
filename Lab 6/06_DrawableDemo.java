// Based on cgr_unit2_interfaces.pptx, page 9.
// The source slide has an incomplete getDrawable() statement; direct object
// creation below makes the example independently runnable.
interface Drawable { void draw(); }
class Rectangle implements Drawable {
    public void draw() { System.out.println("drawing rectangle"); }
}
class Circle implements Drawable {
    public void draw() { System.out.println("drawing circle"); }
}
public class DrawableDemo {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
        Drawable r = new Rectangle();
        r.draw();
    }
}
