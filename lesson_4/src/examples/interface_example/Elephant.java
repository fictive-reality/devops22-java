package examples.interface_example;

public class Elephant implements Animal {

    @Override
    public void sleep() {
        System.out.println("Elephant sleep");

    }

    @Override
    public void backFlip() {
        System.out.println("Elephant died");
    }

}
