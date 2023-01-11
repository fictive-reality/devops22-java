package Lesson_4.Farm;

public class Cow implements Animals {
    String color = "Black and White";
    int legs = 4;
    int hunger = 3; 


    @Override
    public void Sleep() {
        System.out.println("Sleep cow.");

    }

    @Override
    public void Eat() {
        
        System.out.println("Time to eat cow.");
        
    }

    @Override
    public void Noteating() {
        System.out.println("No time for food cow.");
    }

    @Override
    public void Awake() {
        System.out.println("Cow is awake.");
    }


    public void makenoice() {
        System.out.println("Mooo");

    }

    public void hunger(int food) {
        int feed = (hunger + food);
        System.out.println(feed);
    }
    
}
