public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.pow(this.radius, 2)) * Math.PI;
    }

    public double getCircumference() {
        return (this.radius * 2) * Math.PI;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
