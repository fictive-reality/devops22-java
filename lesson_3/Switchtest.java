
import java.util.Scanner;

public class Switchtest {

    void Primarycolors(String color) {
        switch(color) {
            case "yellow":
            case "Yellow": {
                System.out.println("Yellow is a primary color,correct!");
                break;
            }
            case "blue":
            case "Blue": {
                System.out.println("Blue is a primary color,correct!");
                break;
            }
            case "red":
            case "Red": {
                System.out.println("Red is a primary color,correct!");
                break; 
            }
            default: {
                System.out.println("This is not a primary color.");
            }
        }
    }

        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Write a primary color(*HINT* They are three): ");
                String color = sc.nextLine();
                Switchtest Switchtest = new Switchtest();
                Switchtest.Primarycolors(color);

            }
        }
}