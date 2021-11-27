package samsung;

//класс завершён?
public class Square extends Figure implements PSE {
    double edge;
    public Point v1;
    public Square(Point v1, double edge) {
        this.v1 = v1;
        this.edge = edge;
    }

    @Override
    public double getSurface() {
        return (edge * edge);
    }

    @Override
    public double getPerimetr() {
        return ((edge + edge) * 2);
    }

    @Override
    public void move(double x, double y) {
        v1.move(x, y);
    }

    @Override
    public String toString() {
        return ("p1 x:" + v1.x + " p1 y:" + v1.y + " p2 x:" + (v1.x + edge) + " p2 y:" + (v1.y + edge));
    }
}
