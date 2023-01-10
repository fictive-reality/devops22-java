import java.util.Scanner;

public class Circle {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    float area() {
        return (float) (Math.PI * Math.pow(this.radius, 2));

    }

    float circumference() {
        return (float) (2 * Math.PI * this.radius);

    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.area());
        System.out.println(circle.circumference());

    }

}
