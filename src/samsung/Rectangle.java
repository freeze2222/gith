package samsung;

public class Rectangle extends Figure implements PSE {
    double edgeX;
    double edgeY;
    public Point v1;
    public Rectangle(Point v1, double edgeX, double edgeY) {
        this.v1 = v1;
        this.edgeX = edgeX;
        this.edgeY = edgeY;
    }

    @Override
    public double getSurface() {
        return (edgeX * edgeY);
    }

    @Override
    public double getPerimetr() {
        return ((edgeX + edgeY) * 2);
    }

    @Override
    public void move(double x, double y) {
        v1.move(x, y);
    }
    @Override
    public String toString(){
        return ("p1 x:"+v1.x+" p1 y:"+v1.y+" p2 x:"+v1.x+edgeX+" p2 y:"+v1.y+edgeY);
    }
}
