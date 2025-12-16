package Thu;

public class Hinhtron extends GeometricObject implements Resizeable {

    double radius;
    public Hinhtron( double radius) {

        this.radius = radius;
    }
    public Hinhtron(String color,boolean filled, double radius) {
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {}
    @Override
    public double getArea() {
        return 3.14*this.radius * this.radius;
    }
    @Override
    public double getPerimeter() {
        return 2*3.14*this.radius;
    }
    public String toString() {
        return "radius=" + getRadius()
                + ", area=" + getArea()
                + ", color=" + getColor()
                + ", filled=" + isFilled();
    }

    @Override
    public Double tang() {
        return radius*radius*3.14*Math.floor(Math.random()*100+1)/100;
    }
}
