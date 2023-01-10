package lesson_3.examples;

// Group Exercise: Write a method that uses a variable length argument

public class L_VariableLengthArgumentExample {

    static void sum(int... terms) {
        int sum = 0;
        for (int term : terms) {
            sum += term;
        }
        System.out.println(sum);
        // return sum;
    }

    public static void main(String[] args) {
        sum(1, 2, 3, 4, 5);
        sum(1, 2, 3, 4);
    }
}
