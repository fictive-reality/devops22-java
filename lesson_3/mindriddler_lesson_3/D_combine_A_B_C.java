package mindriddler_lesson_3;

import java.util.Scanner;

public class D_combine_A_B_C {
    int radius;

    public D_combine_A_B_C(int radius) {
        this.radius = radius;
    }

    int area() {
        return (int) (Math.PI * Math.pow(this.radius, 2));
    }

    int circumference() {
        return (int) (2 * Math.PI * this.radius);
    }

    public static void main(String[] args) {
        System.out.println("Enter a radius.");
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print(">> ");
                int radius = sc.nextInt();
                D_combine_A_B_C circle = new D_combine_A_B_C(radius);

                System.out.println("Enter 1 to get the area, 2 to get the circumference, or 3 to get both:");
                System.out.print(">> ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.printf("Area of circle is %d\n", circle.area());
                        break;
                    case 2:
                        System.out.printf("Circumference of circle is %d\n", circle.circumference());
                        break;
                    case 3:
                        System.out.printf("Area of circle is %d\n", circle.area());
                        System.out.printf("Circumference of circle is %d\n", circle.circumference());
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        continue;
                }

                System.out.println("Do you want to enter another radius? (y/n)");
                System.out.print(">> ");
                String answer = sc.next();
                if (!answer.equalsIgnoreCase("y")) {
                    break;
                }
            }
        }
    }
}
