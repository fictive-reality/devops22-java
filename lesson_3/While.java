import java.util.Scanner;

public class While {

   public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Guess my favorite number 1-10: ");
            String input = sc.nextLine();
            while (!"7".equalsIgnoreCase(input)) {
                System.out.print("Guess my favorite number 1-10: ");
                input = sc.nextLine();
                System.out.println(input);
                System.out.print("You guessed right!");
            }
        }
    }
}

