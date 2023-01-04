// What does this program print? Guess before you run it, then explain why in a comment below.

class Dog {
    public static void bark() {
        System.out.println("Woof ");
    }
}

class Basenji extends Dog {
    public static void bark() { }
}

public class TooMuchBark {
    public static void main(String[] args) {
        Dog woofer = new Dog();
        Dog nipper = new Basenji();
        woofer.bark();
        nipper.bark();
    }
}