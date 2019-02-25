package Quiz1;

public class Circle {

    private final double PI = 3.14159;
    private static double radius;

    public Circle() {
        radius = 1.0;
    }
    public Circle(double r) {
        radius = r;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public static double getArea() {
        return Math.PI*radius*radius;
    }
    public static double getCircumference() {
        return 2*Math.PI*radius;
    }
}