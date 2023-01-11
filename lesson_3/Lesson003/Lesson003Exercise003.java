package lesson_3.Lesson003;

public class Lesson003Exercise003 {
    public static void main(String args[]) throws InterruptedException{
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i > 999) {
                break;
            }
        }
        i = 0;
        while (i  < 95) {
            i++;
            if (i % 5 == 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
