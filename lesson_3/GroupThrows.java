import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class GroupThrows {

    public static void main(String[] args) {
        try {
            itThrows();
        } catch (FileNotFoundException e) {
            System.out.println("Something");
        }
    }

    public static void itThrows() throws FileNotFoundException {
        File file = new File("data.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        }
    }
}