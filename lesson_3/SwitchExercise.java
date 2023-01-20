import java.util.Scanner;

public class SwitchExercise {

    void colors(String color) {
        switch(color) {
            case "yellow":
            case "Yellow": {
                System.out.println("YELLOW!");
                break;
            }
            case "blue":
            case"Blue": {
                System.out.println("BLUE!");
                break;
            }
            default: {
                System.out.println("Undefined color.");
            }
        }
    }


        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Choose a color:");
                String color = sc.nextLine();
                SwitchExercise SwitchExercise = new SwitchExercise();
                SwitchExercise.colors(color);

            }
        }
    
}
