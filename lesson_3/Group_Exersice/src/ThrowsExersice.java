import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExersice {
    static void func() throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
            scanner.close();
        }
    }

    // Group Exercise: Re-write to method(s) that uses throws keyword
    public static void main(String[] args) {
        try {
            func();

        } catch (FileNotFoundException e) {
            System.out.println("asd");
        }
    }
}
