// What does this program print? Guess before you run it, then explain why in a comment below.

class Phone {
    public static void ring() {
        System.out.println("Riing ");
    }
}

class SilentPhone extends Phone {
    public static void ring() { }
}

public class TooMuchRing {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone silent = new SilentPhone();
        phone.ring();
        silent.ring();
    }
}