package excersice.src;

public class Building {
    public String name;
    private int health = 50;
    public boolean open;

    Building(String name, boolean open) {
        this.name = name;
        // this.health = health;
        this.open = open;

    }

    public void getBuildingInfo() {
        System.out.printf("\nName: %s\nHealth: %d\nOpen: %b\n", this.name, this.health, this.open);
    }

    public void repairBuilding() {
        System.out.println("Building under construction..");
        // if (this.health > 50){
        // System.out.println("Building under construction..");
        // this.health++;
        // }
        // else if (this.health == 50){
        // System.out.println("This building does not need reparing.");
        // }

    }
}
