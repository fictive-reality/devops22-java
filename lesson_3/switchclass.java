package Lesson3;

import java.util.Scanner;

public class switchclass {



    void animalSound(String animal) {
        switch (animal) {
            case "lion":
            case "bigcat": {
                System.out.println("ROARR");
                break;
            }
            case "snake":
            case "Snake": {
                System.out.println("sssss");
                break;
            }
            default: {
                System.out.println("Undefined sound");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Snake or Lion? : ");
            String animal = sc.nextLine();
            switchclass x = new switchclass();
            x.animalSound(animal);
        }
    }

}
