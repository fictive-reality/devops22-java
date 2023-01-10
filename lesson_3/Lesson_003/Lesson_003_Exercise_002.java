package lesson_3.examples.Lesson_003;

public class Lesson_003_Exercise_002 {
    float radius;

    public Lesson_003_Exercise_002(float radius) {
        this.radius = radius;
    }

    public float area() {
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    public float circumference() {
        return (float) (2 * Math.PI * this.radius);
    }

    public static void main(String[] args) {
        Lesson_003_Exercise_002 circle = new Lesson_003_Exercise_002(10);
        System.out.println("Area is: " + circle.area());
        System.out.println("Circumference is: " + circle.circumference());
    }
}
