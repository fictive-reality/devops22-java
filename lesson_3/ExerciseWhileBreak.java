import java.util.Scanner;

public class ExerciseWhileBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("quit or continue: ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                sc.close();
                break;
            }
        }
    }
}
