package excersice.src;

public class Main {

    public static void main(String[] args) {
        Piglet piglet = new Piglet("herr gris");
        Piglet hello = new Piglet();
        Building staffBuilding = new Building("staff building", true);

        hello.getAnimalInfo();
        piglet.getAnimalInfo();
        piglet.eat();
        staffBuilding.getBuildingInfo();
    }
}