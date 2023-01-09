package exercises;

//mport java.math.*;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void circumference() {
        double circumference = (this.radius * 2) * Math.PI;
        System.out.println("Circumference of the circle is: " + circumference);

    }

    public void area() {
        double area = Math.pow(this.radius, 2) * Math.PI;
        System.out.println("Area of the circle is: " + area);

    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.circumference();
        circle.area();

    }
}