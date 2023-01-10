package lesson_3.Lesson003;

public class Lesson003Exercise002 {
    float radius;

    public Lesson003Exercise002(float radius) {
        this.radius = radius;
    }

    public float area() {
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    public float circumference() {
        return (float) (2 * Math.PI * this.radius);
    }

    public static void main(String[] args) {
        Lesson003Exercise002 circle = new Lesson003Exercise002(10);
        System.out.println("Area is: " + circle.area());
        System.out.println("Circumference is: " + circle.circumference());
    }
}
