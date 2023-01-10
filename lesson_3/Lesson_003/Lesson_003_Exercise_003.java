package lesson_3.examples.Lesson_003;

public class Lesson_003_Exercise_003 {
        public static void main(String args[]) {
            int i = 0;
            while (i < 99) {
                System.out.println(i);
                i++;
                if (i >= 98) {
                    break;
                }
                else if (i >= 89) {
                    continue;
                }
            }
        }
    }