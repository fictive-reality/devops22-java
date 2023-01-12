abstract class Animal implements AnimalInterface {
    private String name;
    private boolean canPet;
    private boolean isWatchable;

    public Animal(String name, boolean canPet, boolean isWatchable) {
        this.name = name;
        this.canPet = canPet;
        this.isWatchable = isWatchable;
    }

    public String getName() {
        return name;
    }

    public boolean canPet() {
        return canPet;
    }

    public boolean isWatchable() {
        return isWatchable;
    }
}

class Lion extends Animal {
    public Lion(String name, boolean canPet, boolean isWatchable) {
        super(name, canPet, isWatchable);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + ": Roar!");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + ": Om nom nom.");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + ": ZzZz ZzZz.");
    }
}
