// What does this program print? Guess before you run it, then explain why in a comment below.

public class JoyOfHex {
    public static void main(String[] args) {
        System.out.println(Long.toHexString(0x100000000l + 0xcafebabe));
    }
}