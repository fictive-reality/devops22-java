// What does this program print? Guess before you run it, then explain why in a comment below.

import static java.util.Arrays.toString;

public class ImportDuty {
    public static void main(String[] args) {
        printArgs(1,2,3,4,5);
    }

    static void printArgs(Object... args) {
        System.out.println(toString(args));
    }
}