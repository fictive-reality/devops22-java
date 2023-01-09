public class BreakAndContinue {
    public static void main(String[] args) {
        // Use break to exit a loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i is: " + i);
        }

        // Use continue to skip the rest of the current iteration
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i is: " + i);
        }
    }
}

// The break statement is used to exit a loop early, while the continue 
// statement is used to skip the rest of the current iteration of the loop 
// and move on to the next one.