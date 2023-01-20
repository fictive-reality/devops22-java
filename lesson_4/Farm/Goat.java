package Lesson_4.Farm;


// changing from implements "Animals" to extends Pig. both works. 
public class Goat extends Pig{
    String color = "Grey";
    int legs = 4;
    int happy = 109;

    @Override
    public void Sleep() {
        System.out.println("Sleep goat.");

    }

    @Override
    public void Eat() {
        System.out.println("Time to eat goat.");
    }

    @Override
    public void Noteating() {
        System.out.println("No time for food goat.");
    }

    @Override
    public void Awake() {
        System.out.println("Goat is awake.");
    }


    public void makenoice() {
        System.out.println("Baaaaa,baa");
    }

    public void happy(int benice) {
        int morehappy = (happy + benice);
        System.out.println(morehappy);
    }
    
}
