import java.util.*;

class Zoo {
    private List<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public static void main(String[] args) {
        Player player = new Player("Jarl");
        Lion lion = new Lion("Lion", true, true);
        
        player.watchAnimal(lion);
    }
}
