package lesson_3.Lesson_003;

import java.util.Scanner;

public class Lesson003Exercise001 {

    void carSound(String car) {
        switch (car) {
            case "internal_combustion_engine":
            case "Internal_combustion_engine": {
                System.out.println("Vroom, Vroom");
                break;
            }
            case "electric_engine":
            case "Electric_engine": {
                System.out.println("'Quiet'");
                break;
            }
            default: {
                System.out.println("Undefined sound");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your car: ");
            String car = sc.nextLine();
            Lesson003Exercise001 switchExample = new Lesson003Exercise001();
            switchExample.carSound(car);
        }
    }

}
