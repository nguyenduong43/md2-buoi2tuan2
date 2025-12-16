package Thu;

import Dongvat.Animal;

public class Hinhvuong extends GeometricObject implements Resizeable,color {
    @Override
    public String howToColor() {
        return "Color all four sides.";
    }

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

    @Override
    public Double tang() {
        return x*y*Math.floor(Math.random()*100+1)/100;
    }
}
