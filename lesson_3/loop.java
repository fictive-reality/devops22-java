package Lesson3;

public class loop {
        public static void main(String[] args) {
            int i = 5;
            while (i < 10) {
                if (i == 0) {
                    break;
                }
                System.out.printf("Number: %d\n", i);
                i--;
            }
            System.out.println("Yay 0!");

            int number = 5;
            while (number > 0) {
                int add = -1;
                number += add;
                if (add < number) {
                    System.out.println("You need more to to get to 0.");
                    continue;
                }
            }
            System.out.println("Yay got to 0!!");
        }
    }