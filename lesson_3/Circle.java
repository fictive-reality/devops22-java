import java.util.Scanner;

public class Circle {

    double area(double radius) {
        return (double) (Math.PI * radius * radius);
    }

    double circumference(double radius) {
        return (double) (2 * Math.PI * radius);
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();
            Circle circle = new Circle();

            System.out.println("The area is " + Math.round(circle.area(radius)));
            System.out.println("The circumference is " + Math.round(circle.circumference(radius)));

        }
    }
}