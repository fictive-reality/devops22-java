
public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    float circumference() {
        return 2 * Math.PI * radius;
    }
    float area() {
        return Math.PI * Math.pow(radius, 2);
    }
    public static void main(String[] args) {
        Circel circle = new Circle(10);
        System.out.printf("Circumference of circle is %d\n", circle.circumference());
        System.out.printf("Area of circle is %d\n", circle.area());
    }
}