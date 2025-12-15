package Thu;

public class Hinhtron extends GeometricObject {
    int x;
    int y;
    double radius;
    public Hinhtron(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Hinhtron(){}

    @Override
    public double getArea() {
        return 3.14*this.radius * this.radius;
    }
    @Override
    public double getPerimeter() {
        return 2*3.14*this.radius;
    }
}
