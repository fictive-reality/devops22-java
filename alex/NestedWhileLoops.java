package alex;

public class NestedWhileLoops {

    /**
     * Method for printing a 10 by 10 board using nested while loops
     * 
     * @author Alex
     * 
     */
    public static void board() {
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 10) {
                System.out.print(i + "" + j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Utils.clearScreen();
        Utils.title("Nested while loops\n");
        board();
    }

}
