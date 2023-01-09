package lesson_3.examples;

// Group Exercise: Analyse and describe this program
public class N_MultiplicationArrays {

    static int multiplication(int... factors) {
        if (factors.length < 2) {
            throw new ArithmeticException();
        }
        int product = factors[0];
        int[] rest = new int[factors.length - 1];

        // Group exercise: What does this line do?
        System.arraycopy(factors, 1, rest, 0, factors.length - 2);

        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(multiplication(1, 2));
        System.out.println(multiplication(1, 2, 3));
        System.out.println(multiplication(1, 2, 3, 0));

        System.out.println(multiplication(1));
        System.out.println(multiplication(2, 7));
    }
}
