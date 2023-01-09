import java.util.Scanner;
import java.lang.Math;

public class Calculator {

    public void switcher(String userInput, double radius) {
        switch (userInput) {
            case "area":
            case "AREA": {
                area(radius);
                break;
            }
            case "circumference":
            case "CIRCUMFERENCE": {
                circumference(radius);
                break;
            }
            default: {
                System.out.println("Invalid input.");
            }
        }
    }

    static void area(double radius) {
        System.out.println(Math.pow(radius, 2) * Math.PI);
    }

    static void circumference(double radius) {
        System.out.println((radius * 2) * Math.PI);
    }

    static boolean intCheck(String str, int n) {
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) < '0'
                    || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = "";
            while (true) {
                System.out.print("Do you want to calculate area or circumference?: ");
                String choice = sc.nextLine();
                if (!choice.equalsIgnoreCase("area") || choice.equalsIgnoreCase(null)) {
                    System.out.println("Invalid input.");
                    continue;
                }
                while (true) {
                    System.out.print("Enter the radius: ");
                    String sRadius = sc.nextLine();
                    if (sRadius.equalsIgnoreCase("")){
                        System.out.println("You have to enter a digit.");
                        continue;
                    }
                    int len = sRadius.length();
                    if (!intCheck(sRadius, len)) {
                        System.out.println("You can only enter digits.");
                        continue;
                    }
                    double radius = Integer.parseInt(sRadius);
                    Calculator calculator = new Calculator();
                    calculator.switcher(choice, radius);
                    break;
                }
                System.out.print("Press Enter to continue or type quit to exit: ");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("quit")) {
                    break;

                }
            }
        }
    }
}
