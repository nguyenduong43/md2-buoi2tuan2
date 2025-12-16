package Thu;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableHinhtron[] circles = new ComparableHinhtron[3];
        circles[0] = new ComparableHinhtron(3.6);
        circles[1] = new ComparableHinhtron(4);
        circles[2] = new ComparableHinhtron("white", true, 3.5);

        System.out.println("Pre-sorted:");
        for (ComparableHinhtron circle : circles) {
            System.out.println(circle.toString());
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableHinhtron circle : circles) {
            System.out.println(circle.toString());
        }
    }
}
