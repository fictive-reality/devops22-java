// What does this program print? Guess before you run it, then explain why in a comment below.

public class WhatsMyClass {
    public static void main(String[] args) {
        System.out.println(
            WhatsMyClass.class.getName().replaceAll(".", "/") + ".class");
    }
}