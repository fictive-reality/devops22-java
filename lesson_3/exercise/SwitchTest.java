
import java.util.Scanner;

public class SwitchTest {

    void response(String words) {
        switch (words) {
            case "a": {
                System.out.println("Hello world");
                break;
            }
            case "b": {
                System.out.println("Hej");
                break;
            }
            default:
                System.out.println("Not an option. ");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a or b: ");
            String word = sc.nextLine();
            SwitchTest switchTest = new SwitchTest();
            switchTest.response(word);
        }
    }
}
