public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;

    }

    public int area() {
        return (int) (Math.PI * this.radius * this.radius);
    }

    public int circum() {
        return (int) (2 * Math.PI * this.radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.printf("Area of Circle is %d\n", circle.area());
        System.out.printf("Circumference is %d", circle.circum());

    }

}
