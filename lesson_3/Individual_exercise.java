import java.util.Scanner;
public class Individual_exercise {

    // WHILE LOOP
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Guess my favourite animal ");
                String input = sc.nextLine();
                while (!"Cat".equalsIgnoreCase(input)) {
                    System.out.print("Guess my favourite animal ");
                    input = sc.nextLine();
                    System.out.println(input);
                }
            }
        }
    }

    // Circle calculation

class Circle {
    int radius = 0;

    public static void Calc_Area_Circ(int radius) {
        double circumference = 3.14 * 3.14 * radius;
        double area = 3.14 * radius * radius;
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}

    // Class with Switch

class Switch {
    void RightNumber(int values) {
        switch (values) {
            case 1:
            case 2: {
                System.out.print("correct");
                break;
            }

            default: {
                System.out.print("Not Correct.");
            }

        }
    }
}