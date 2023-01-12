package excersice.src;

public class Piglet implements Animal {

    public String name;
    private int happiness = 10;
    private int hunger = 10;
    private int health = 10;

    Piglet(String name) {
        this.name = name;
        // this.happiness = happiness;
        // this.hunger = hunger;
        // this.health = health;
    }

    public Piglet() {
        this.name = "Default";

    }

    @Override
    public void getAnimalInfo() {
        System.out.printf("\nName: %s\nHappiness: %d\nHunger: %d\nHealth: %d\n", this.name, this.happiness, this.hunger,
                this.health);
    }

    // Actions

    @Override
    public void eat() {
        System.out.println("Eating..");
        // Give auto-food to animal who has less than 3 hunger ?
        // if (happiness == 10){
        // System.out.println("Akready full cant eat more");
        // }
        // else if (happiness < 10){
        // System.out.println("Eating: 'Omnomnom'");
        // happiness++;
        // }
    }

    @Override
    public void sleep() {
        System.out.println("sleeping..");
        // put to auto-sleep if animal happiness is less than 3.
        // happiness++;
    }
}
