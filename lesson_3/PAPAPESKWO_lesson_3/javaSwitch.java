import java.util.Scanner;
public class javaSwitch {
    void bestOs (String OS) {
        switch (OS) {
            case "linux": {
                System.out.println("Linux is the superior OS");
                break;
            }
            case "windows": {
                System.out.println("Windows is a shite OS");
                break;
            }
            case "macos": {
                System.out.println("MacOS is for loners");
                break;
            }
            default: {
                System.out.println("That is not a valid OS, you nerd");
            }
        }
    }

    public static void main(String[] args) {
        // If your class implements the AutoCloseable interface you can use
        // Try with resource (TWR) will close the scanner at the end of the statement
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your OS: ");
            String os = sc.nextLine().toLowerCase();
            javaSwitch switchExample = new javaSwitch();
            switchExample.bestOs(os);
        }
    }

}