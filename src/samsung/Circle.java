package samsung;

public class Circle implements PSE {
    public double radius;
    public Point v1;
    public Circle(Point v1, double radius) {
        this.radius = radius;
        this.v1 = v1;
    }

    public double getDiameter() {
        return (2 * radius);
    }

    @Override
    public double getSurface() {
        return (3.14 * radius * radius);
    }

    @Override
    public double getPerimetr() {
        return (2 * 3.14 * radius);
    }

    @Override
    public void move(double x, double y) {
        move(x, y);
    }

    @Override
    public String toString() {
        return ("x:" + v1.x + "y:" + v1.y);
    }
}
