package mindriddler_lesson_3;

import java.util.Scanner;

public class B_circle {
    int radius;

    public B_circle(int radius) {
        this.radius = radius;
    }

    int area() {
        return (int) (Math.PI * Math.pow(this.radius, 2));
    }

    int circumference() {
        return (int) (2 * Math.PI * this.radius);
    }

    public static void main(String[] args) {
        System.out.println("Enter a radius and get the area and circumference.");
        System.out.print(">> ");
        try (Scanner sc = new Scanner(System.in)) {
            int radius = sc.nextInt();
            B_circle circle = new B_circle(radius);
            System.out.printf("Area of circle is %d\n", circle.area());
            System.out.printf("Circumference of circle is %d\n", circle.circumference());
        }
    }
}