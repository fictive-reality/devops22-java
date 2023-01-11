package Lesson_4.Farm;

public class Pig implements Animals{
    private String color = "Pink";
    int legs = 4;
    int run = 1;

    @Override
    public void Sleep() {
        System.out.println("Sleep Pig.");

    }

    @Override
    public void Eat() {
        System.out.println("Time to eat Pig.");
    }

    @Override
    public void Noteating() {
        System.out.println("No time for food Pig.");
    }

    @Override
    public void Awake() {
        System.out.println("Pig is awake.");
    }


    public void makenoice() {
        System.out.println("Oiiinkoink");
    }

    public void testcolor() {
        System.out.println(color);
    }

    public void run(int faster) {
        int runfaster = (run + faster);
        System.out.println(runfaster);

    }


}
