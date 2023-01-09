import java.util.*;

public class Circle {
    float radius;
    final float PI = 3.14F;

    public Circle(float radius) {
        this.radius = radius;
    }

    float area() {
        return PI * (this.radius * this.radius);
    }

    float circumference() {
        return 2 * PI * this.radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.printf("Area of circle is %f\n", circle.area());
        System.out.printf("Circumference of circle is %f\n", circle.circumference());
    }
}
