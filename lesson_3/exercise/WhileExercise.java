import java.util.Scanner;

public class WhileExercise {

    public static void main(String[] args) {

        while (true) {
            System.out.print("Enter something, q to exit: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if ("h".equalsIgnoreCase(input)) {
                System.out.println("Hello");
                continue;
            } else if ("q".equalsIgnoreCase(input)) {
                System.out.println("Exiting program. ");
                break;
            } // else {
              // System.out.println("try again:");
              // }
            System.out.println("hello world ");
        }

    }
}
