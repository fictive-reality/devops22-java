import java.util.Arrays;

public class GroupArray {

    static String[][] diagonalBoard(int size) {
        String[][] board = new String[size][size];
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                board[x][y] = "X";
            }
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
        String[][] board = diagonalBoard(10);
        printBoard(board);
    }
}