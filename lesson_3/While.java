import java.util.Scanner;

class While {

    public static void main(String[] args) {
        int n = 1;

        while (n <= 7) {
            System.out.println("*");
            if (n == 5) {
                break;
            }
            n++;
        }
    }
}
class While {

    public static void main(String[] args) {
        int n = 1;

        while (n <= 8) {
            if (n == 4) {
                n++;
                continue;
            }
            System.out.println(n);
            n++;
        }
    }
}