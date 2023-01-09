import java.util.Scanner;

public class Switch {

    void rockSuggestion(String music) {
        switch (music) {
            case "1": {
                System.out.println("You probably like Heavy Metal.");
                break;
            }
            case "2": {
                System.out.println("You probably don't like rock that much.");
                break;
            }
            case "3": {
                System.out.println("You probably like rock and roll.");
                break;
            }
            case "4": {
                System.out.println("You probably like hard rock.");
                break;
            }
            default: {
                System.out.println("Choose from one of the options");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(
                    "Rock music suggestions, enter a number from one of the options:\n1: If you like rock when is heavy.\n2: If you like it just chill.\n3: If you like older rock.\n4: If you like rock when is heavy but not that much.\n");
            String music = sc.nextLine();
            Switch switchExample = new Switch();
            switchExample.rockSuggestion(music);
        }
    }

}
