package mindriddler_lesson_3;

public class C_while_loop {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("When i == 5, first break then continue.");
        while (i < 10) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("5, Break triggered");
        i = 0;
        while (i < 10) {
            if (i == 5) {
                i++;
                System.out.println("5, Continue triggered");
                continue;

            }
            System.out.println(i);
            i++;
        }
    }
}
