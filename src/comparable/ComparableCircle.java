package comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, Boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getPerimeter() > o.getPerimeter())
            return 1;
        else if (getPerimeter() < o.getPerimeter())
            return -1;
        else
            return 1;
    }
}
