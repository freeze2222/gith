package samsung;

public class Triangle extends Figure implements PSE {
    double correction=0.01;
    public Point v1;
    public Point v2;
    public Point v3;
    //getting info
    public double p1 = Math.round(Math.sqrt((v3.y - v1.y) * (v3.y - v1.y) + (v3.x - v1.x) * (v3.x - v1.x)) * 10000) / 10000d;
    public double p2 = Math.round(Math.sqrt((v3.y - v2.y) * (v3.y - v2.y) + (v3.x - v2.x) * (v3.x - v2.x)) * 10000) / 10000d;
    public double p3 = Math.round(Math.sqrt((v2.y - v1.y) * (v2.y - v1.y) + (v2.x - v1.x) * (v2.x - v1.x)) * 10000) / 10000d;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    //p1=Math.round((p1*10000))/10000.0d;
    //p2=Math.round((p2*10000))/10000.0d;
    //p3=Math.round((p3*10000))/10000.0d;

    public String info() {
        return ("p1:" + p1 + " p2:" + p2 + " p3:" + p3);
    }
    //done

    public boolean estEquilateral() {
        return (p1 == p2 && p1 == p3 ? true : false);
    }

    public boolean isIsoceles() {
        return ((p1 == p2 || p1 == p3) ? true : false);
    }

    public boolean isRectangle() {
        double m = p1 > p2 && p1 > p3 ? p1 : p2 > p1 && p2 > p3 ? p2 : p3;
        if (p1 > p2 && p1 > p3) {
            return (p2 * p2 + p3 * p3 - p1 * p1 < correction);
        } else if (p2 > p1 && p2 > p3) {
            return (p1 * p1 + p3 * p3 - p2 * p2 < correction);
        } else return (p2 * p2 + p1 * p1 - p3 * p3 < correction);
    }
    @Override
    public double getSurface() {
        double p=getPerimetr()/2;
        return (Math.sqrt(p*(p-p1)*(p-p2)*(p-p3)));
    }

    @Override
    public double getPerimetr() {
        return (p1+p2+p3);
    }

    @Override
    public void move(double x, double y) {
        v1.move(x, y);
        v2.move(x, y);
        v3.move(x, y);
    }
}

