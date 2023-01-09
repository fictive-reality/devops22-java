package danielbruno_lesson_3;

public class C_while_loop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            if (i == 10) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("10, break");
        i = 0;
        while (i < 20) {
            if (i == 10) {
                i++;
                System.out.println("10, continue");
                continue;

            }
            System.out.println(i);
            i++;
        }
    }
}
