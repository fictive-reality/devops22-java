package alex;

/**
 * Class for utility methods
 * 
 * @author Alex
 */
public class Utils {

    /**
     * Method for clearing the terminal
     * 
     * @author Alex
     * @see https://stackoverflow.com/questions/2979383/java-clear-the-console
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }

    /**
     * Method for printing a title in the terminal,
     * a bit unnecesary but fun to play with
     * 
     * @author Alex
     * @param title
     */
    public static void title(String title) {
        System.out.println(title);
    }

    public static void main(String[] args) {
        clearScreen();
        title("Utils\n");
    }

}
