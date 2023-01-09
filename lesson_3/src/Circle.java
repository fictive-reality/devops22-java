public class Circle {
    public float radius = 1.0f;

    Circle(float radius) {
        this.radius = radius;
    }

    public float area() {
        return (float) Math.PI * this.radius * this.radius;
    }

    public float circumference() {
        return (float) Math.PI * 2 * this.radius;
    }
}