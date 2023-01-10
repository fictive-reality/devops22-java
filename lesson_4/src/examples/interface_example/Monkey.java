package examples.interface_example;

public class Monkey implements Animal {

    @Override
    public void sleep() {
        System.out.println("monkey sleeping zzZZZzz");

    }

    @Override
    public void backFlip() {
        System.out.println("monkey did a double back flip!!");

    }

}
