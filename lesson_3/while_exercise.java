import java.util.Random;
import java.util.Scanner;

public class while_exercise {
    public static void main(String[] args) {
        Random rand = new Random();
        int random_number = rand.nextInt(10);
        random_number += 1;
        System.out.println(random_number);
            
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            if (guess != random_number) {
                System.out.println("Wrong guess!");
                continue;
            }
            System.out.println("You guessed the right number!");
            break;
        }
    }
}
