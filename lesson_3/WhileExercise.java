import java.util.Scanner;

public class WhileExercise {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Choose a letter: ");
            String input = sc.nextLine();
            while (!"b".equalsIgnoreCase(input)) {
                System.out.print("Try again! ");
                input = sc.nextLine();
                System.out.println(input);
            }
        }
    }
}