// What does this program print? Guess before you run it, then explain why in a comment below.

public class StrungOut {
    public static void main(String[] args) {
        String s = new String("Hello world!");
        System.out.println(s);
    }
}

class String {
    private final java.lang.String s;

    public String(java.lang.String s) {
        this.s = s;
    }

    public java.lang.String toString() {
        return s;
    }
}