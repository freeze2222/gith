package samsung;
import java.awt.*;
import java.awt.color.*;
public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(2, 2);
        Point p2 = new Point(6, 2);
        Point p3 = new Point(4, 4);
        Triangle triangle = new Triangle(p1, p2, p3);

        System.out.println(triangle.isRectangle());
        System.out.println(triangle.info());
    }
}
