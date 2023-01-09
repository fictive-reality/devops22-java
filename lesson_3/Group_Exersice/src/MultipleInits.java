import java.util.Arrays;

// Group exercise: rewrite so diagonalBoard also takes args String filledSlot, String unfilledSlot and 
// uses those two to decide what to print on the diagonal line, and on all other slots.
public class MultipleInits {

    static String[][] diagonalBoard(int size, String filledSlot, String unfilledSlot) {
        String[][] board = new String[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                board[i][j] = unfilledSlot;

        for (int x = 0, y = 0; x < size; x++, y++) {
            board[x][y] = filledSlot;
        }
        return board;
    }

    static void printBoard(String[][] board) {
        // foreach loop
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        String[][] board = diagonalBoard(10, "P", "0");
        printBoard(board);
    }
}
