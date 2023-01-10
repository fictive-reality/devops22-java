package exercises;

import java.util.Scanner;

public class SwitchClass {

    void car(String model) {
        switch (model) {
            case "kia":
            case "Kia": {
                System.out.println("You are poor!");
                break;
            }
            case "BMW":
            case "bmw": {
                System.out.println("You are doing alright!");
                break;
            }
            case "volvo":
            case "Volvo": {
                System.out.println("You are a Svennebanan!");
                break;
            }
            case "bugatti":
            case "Bugatti": {
                System.out.println("WOW! You are superwealthy!");
                break;
            }
            default: {
                System.out.println("I don't recognize that brand of car!");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("What brand of car are you driving?: ");
            String model = sc.nextLine();
            SwitchClass switchExample = new SwitchClass();
            switchExample.car(model);
        }
    }

}
