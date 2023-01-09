package lesson_3;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            if (i == 10) {
                break;
            }
            System.out.printf("Counter: %d\n", i);
            i++;
        }
        System.out.println("Hit 9, break");
        i = 0;
        while (i < 20) {
            if (i == 10) {
                i++;
                System.out.println("10, continues");
                continue;
            }
            System.out.printf("Counter: %d\n", i);
            i++;
        }
    }
}
