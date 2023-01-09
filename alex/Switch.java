package alex;

import java.util.Scanner;

public class Switch {

    /**
     * Returns the length of a month using a switch statement.
     * Uses .toLowerCase() to make the input case insensitive.
     * 
     * @param month
     * @return String
     * @author Alex
     */
    public static String monthLength(String month) {
        switch (month.toLowerCase()) {
            case "february":
                return "February has 28 days";
            case "april":
            case "june":
            case "september":
            case "november":
                return "Month of " + month.toUpperCase() + " has 30 days";
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return "Month of " + month.toUpperCase() + " has 31 days";
            default:
                return "Invalid month";
        }
    }

    /**
     * Method for printing a message and returning the user input
     * 
     * @param message
     * @return String
     * @author Alex
     */
    public static String input(String message) {
        System.out.print(message);
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Utils.clearScreen();
        Utils.title("Month length calculator\n");

        String month = input("Enter a month: ");
        System.out.println(monthLength(month));

    }
}
