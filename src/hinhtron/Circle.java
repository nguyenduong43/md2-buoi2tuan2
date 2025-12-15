package hinhtron;

public class Circle extends Share {
    private double radius;

    public Circle(int _x, int _y, double _r) {
        super(_x, _y);
        radius = _r;
    }

    public void draw() {
        System.out.println("Draw circle");
    }

    public void erase() {
        System.out.println(this.x+" "+this.y+" "+this.radius);
    }
}
