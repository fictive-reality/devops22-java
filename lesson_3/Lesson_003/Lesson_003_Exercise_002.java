package lesson_3.examples.Lesson_003;

public class Lesson_003_Exercise_002 {
    int radius;

    public Lesson_003_Exercise_002(int radius) {
        this.radius = radius;
    }

    int area() {
        return (int) (Math.PI * Math.pow(this.radius, 2));
    }

    int circumference() {
        return (int) (2 * Math.PI * this.radius);
    }

    public static void main(String[] args) {
        Lesson_003_Exercise_002 circle = new Lesson_003_Exercise_002(10);
        System.out.printf("Area of circle is %d\n", circle.area());
        System.out.printf("Circumference of circle is %d\n", circle.circumference());
    }
}
