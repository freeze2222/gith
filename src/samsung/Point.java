//класс завершён

package samsung;

public class Point {
    public double x;
    public double y;
    public String hex;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void setColor(int r, int g, int b) {
        hex = String.format("#%02x%02x%02x", r, g, b);
    }

    public String distanceTo(Point point) {
        double x = point.x - this.x;
        double y = point.y - this.y;
        return ("x:" + x + "y:" + y);
    }

    public double distanceXTo(Point point) {
        double x = point.x - this.x;
        return (x);
    }

    public double distanceYTo(Point point) {
        double y = point.y - this.y;
        return (y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", hex='" + hex + '\'' +
                '}';
    }
}
