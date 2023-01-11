package exercises;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circumference(double radius) {
        double result = (this.radius * 2) * Math.PI;
        return result;
    }

    public double area(double radius) {
        double result = Math.pow(this.radius, 2) * Math.PI;
        return result;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.circumference(5));
        System.out.println(circle.area(5));

    }
}