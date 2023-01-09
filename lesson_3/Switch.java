import java.util.Scanner;

public class Switch {
    void animalSound(String number) {
        switch (number) {
            case "10":
            case "17": {
                System.out.println("Congrats, you won first prize!");
                break;
            }
            case "2":
            case "12":
            case "19":
            case "7": {
                System.out.println("Congrats, you won second prize!");
                break;
            }
            default: {
                System.out.println("You did now win anything");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your number: ");
            String number = sc.nextLine();
            Switch switchExample = new Switch();
            switchExample.animalSound(number);
        }
    }

}


