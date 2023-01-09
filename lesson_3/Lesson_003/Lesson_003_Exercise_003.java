package lesson_3.examples;

import java.util.Random;

public class D_BreakExample {
    static final int LIMIT = 25;

    // Individual Exercise: Write a `while` that uses `break`.
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int luckyNumber = random.nextInt(LIMIT);
        System.out.printf("My lucky number is: %d\n", luckyNumber);

        // This while loop will run until the lucky number is found.
        while (true) {
            int randomNumber = random.nextInt(LIMIT);

            // We can use == since it's a primitive variable int
            if (randomNumber == luckyNumber) {
                System.out.printf("You found my lucky number!!! (%d)\n", luckyNumber);
                break; // break will end the while loop
            }
            System.out.printf("%d is not my lucky number \n", randomNumber);
            Thread.sleep(1000);
        }
    }
}
