public class ExerciceWhileContinue {
    public static void main(String[] args) {
        int start = 0;
        while (start < 10) {
            if (start % 2 == 0) {
                start++;
                continue;
            }
            System.out.println(start);
            start++;
        }
    }
}