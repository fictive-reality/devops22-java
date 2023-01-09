package lesson_3.examples;

import java.util.Random;

public class E_ContinueExample {

    // Individual Exercise: Write a `while` that uses `continue`.
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int start = 50;

        while (start > 0) {
            Thread.sleep(1000);
            int dice = rand.nextInt(6) + 1;
            System.out.printf("You rolled the dice and got a %d\n", dice);
            if (dice > start) {
                System.out.printf("You needed a %d to win, continues..\n", start);
                continue; // this will skip the subtraction in this loop iteration
            }
            start -= dice;
            System.out.printf("Total remaining %d\n", start);
        }
        System.out.println("You Won!");
    }
}
