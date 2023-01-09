package lesson_3;

import java.util.Scanner;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    int area() {
        return (int) (Math.PI * this.radius * this.radius);
    }

    int circumference() {
        return (int) (2 * Math.PI * this.radius);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius to get the area and circumference: ");
            int radius = sc.nextInt();
            Circle circle = new Circle(radius);
            System.out.printf("The area of the circle is: %d\n", circle.area());
            System.out.printf("The circumference of the circle is: %d", circle.circumference());
        }
    }
}
