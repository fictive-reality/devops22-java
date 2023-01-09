package alex;

import java.util.Scanner;

public class Circle {

    double radius;

    /**
     * Constructor for Circle
     * 
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Method for getting the area of the circle
     * 
     * @return double
     */
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Method for getting the circumference of the circle
     * 
     * @return double
     */
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {
        Utils.clearScreen(); // Clear the terminal, see Utils.java
        Utils.title("Circle Math\n"); // Print a title, see Utils.java

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("The area of the circle is " + circle.getArea());
            System.out.println("The circumference of the circle is " + circle.getCircumference());
        }
    }
}
