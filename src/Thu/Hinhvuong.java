package Thu;

public class Hinhvuong extends GeometricObject {
    int x;
    int y;
    public Hinhvuong(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Hinhvuong() {}
    public double getArea() {
        return x*y;
    }
    public double getPerimeter() {
        return 2*(x+y);
    }

}
