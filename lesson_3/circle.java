package Lesson3;

import java.util.Scanner;

public class circle {
    int radius;

    public circle(int radius) {
        this.radius = radius;
    }

    double area() {
        return this.radius * this.radius * Math.PI;
    }

    double circumference() {
        return Math.PI * 2 * this.radius;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the circles radius: ");
            int input = sc.nextInt();
            circle radius = new circle(input);
            System.out.printf("Area of circle is %f\n", radius.area());
            System.out.printf("Circumference of circle is %f\n", radius.circumference());
        }
    }
}


