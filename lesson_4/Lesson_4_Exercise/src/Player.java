class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void visitZoo(Zoo zoo) {
        System.out.println(this.name + " is visiting the zoo.");
        zoo.showAnimals();
    }

    public void petAnimal(Animal animal) {
        if (animal.canPet()) {
            System.out.println(this.name + " is petting the " + animal.getName() + ".");
        } else {
            System.out.println(this.name + " cant pet the " + animal.getName() + ".");
        }
    }

    public void watchAnimal(Animal animal) {
        if (animal.isWatchable()) {
            System.out.println(this.name + " is watching the " + animal.getName() + ".");
        } else {
            System.out.println(animal.getName() + "cant be seen.");
        }
    }
}
