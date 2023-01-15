public class CircleExercise {
    int radius;

    public CircleExercise(int radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    double circumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        CircelExercise circle = new CircleExercise(5);
        System.out.println("Area of this circle is: " + circle.area());
        System.out.println("Circumference of this circle is: " + circle.circumference());
    }
}