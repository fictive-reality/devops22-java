package alex;

import java.util.Scanner;

public class WhileLoops {

    /**
     * Method for getting the sum of all numbers up to the number entered
     * 
     * @param scanner
     */
    public static void sum(Scanner scanner) {
        System.out.println("Enter a number or 0(zero) to exit");
        int number = scanner.nextInt();
        if (number <= 0) {
            return;
        }
        int sum = 0;
        int i = 1;
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Sum of all the numbers from 1 to " + number + " = " + sum);
        sum(scanner);
    }

    public static void main(String[] args) {
        Utils.clearScreen();
        Utils.title("While loops & Scanner\n");
        try (Scanner scanner = new Scanner(System.in)) {
            sum(scanner);
        }
    }
}