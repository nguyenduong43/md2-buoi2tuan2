package Thu;

public class ComparableHinhtron extends Hinhtron implements Comparable<ComparableHinhtron>{
    public ComparableHinhtron(double r) {
        super(r);
    }
    public ComparableHinhtron(String color,boolean filled, double r) {
        super(color,filled,r);
    }
    public int compareTo(ComparableHinhtron o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }

}
