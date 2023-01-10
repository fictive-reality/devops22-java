package lesson_3.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J_CheckedExceptionExample {

    // Group Exercise: Re-write to method(s) that uses throws keyword
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        }
    }
}
