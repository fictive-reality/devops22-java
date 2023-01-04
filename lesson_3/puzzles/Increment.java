// What does this program print? Guess before you run it, then explain why in a comment below.

public class Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j = j++;
        }
        System.out.println(j);
    }
}