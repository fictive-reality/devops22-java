public class ExerciseCircle {
    double radie;

    public ExerciseCircle(double radie) {
        this.radie = radie;
    }

    double area() {
        return this.radie * this.radie * Math.PI;
    }

    double circumference() {
        return this.radie + this.radie * Math.PI;
    }

    double radius() {
        return this.radie;
    }

    public static void main(String[] args) {
        ExerciseCircle circle = new ExerciseCircle(5.49d);
        int arean = (int) Math.round(circle.area());
        int omkretsen = (int) Math.round(circle.circumference());
        int radien = (int) Math.round(circle.radius());
        System.out.printf("Area of circle is %d\n", arean);
        System.out.printf("Cricumference of circle is %d\n", omkretsen);
        System.out.printf("Radius of circle is %d\n", radien);
    }
}