package comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle();
        comparableCircles[1] = new ComparableCircle(17.6);
        comparableCircles[2] = new ComparableCircle("Blue", false, 14.1);

        System.out.println("Pre - sorted: ");
        for (ComparableCircle comparableCircle : comparableCircles) {
            System.out.println(comparableCircle.getPerimeter());
        }

        Arrays.sort(comparableCircles);

        System.out.println("After - sorted: ");
        for (ComparableCircle comparableCircle : comparableCircles) {
            System.out.println(comparableCircle.getPerimeter());
        }
    }
}
