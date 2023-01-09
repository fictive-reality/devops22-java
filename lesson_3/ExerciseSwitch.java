import java.util.Scanner;

public class ExerciseSwitch {

    void weekday(String input) {
        switch (input) {
            case "måndag":
            case "lundi":
            case "lunes": {
                System.out.println("Monday");
                break;
            }
            case "tisdag":
            case "mardi":
            case "martes": {
                System.out.println("Tuesday");
                break;
            }
            case "onsdag":
            case "mercredi":
            case "miércoles": {
                System.out.println("Wednesday");
                break;
            }
            case "torsdag":
            case "jeudi":
            case "jueves": {
                System.out.println("Thursday");
                break;
            }
            case "fredag":
            case "vendredi":
            case "viernes": {
                System.out.println("Friday");
                break;
            }
            case "lördag":
            case "samedi":
            case "sábado": {
                System.out.println("Saturdary");
                break;
            }
            case "söndag":
            case "dimanche":
            case "domingo": {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Transale weekday to English (from SWE/ESP/FRA): ");
            String input = sc.nextLine();
            ExerciseSwitch switchExample = new ExerciseSwitch();
            switchExample.weekday(input);
        }
    }
}
