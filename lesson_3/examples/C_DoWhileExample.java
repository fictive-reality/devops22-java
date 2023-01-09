package lesson_3.examples;

import java.util.Scanner;

public class C_DoWhileExample {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input;
            do {
                System.out.print("Enter quit to exit: ");
                input = sc.nextLine();
                System.out.println(input);
            } while (!"quit".equalsIgnoreCase(input));
        }
    }
}
