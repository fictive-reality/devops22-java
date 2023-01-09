package alex;

public class NestedLoop {

    /**
     * Method for printing a 10 by 10 board using nested for loops
     * 
     * @author Alex
     * 
     */
    public static void board() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Utils.clearScreen(); // Clear the terminal, see Utils.java
        Utils.title("Nested for loops\n"); // Print a title, see Utils.java
        board();
    }
}