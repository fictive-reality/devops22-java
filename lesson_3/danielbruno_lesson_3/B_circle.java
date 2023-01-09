package danielbruno_lesson_3;

import java.util.Scanner;

public class B_circle {
    int radius;

    public B_circle(int radius) {
        this.radius = radius;
    }

    int area() {
        return (int) (Math.PI * this.radius * this.radius);
    }

    int circumference() {
        return (int) (2 * Math.PI * this.radius);
    }

    public static void main(String[] args) {
        System.out.println("Enter a radius and get the area and circumference:");
        try (Scanner sc = new Scanner(System.in)) {
            int radius = sc.nextInt();
            B_circle circle = new B_circle(radius);
            System.out.printf("The area of the circle is %d\n", circle.area());
            System.out.printf("The circumference of the circle is %d\n", circle.circumference());
        }
    }
}