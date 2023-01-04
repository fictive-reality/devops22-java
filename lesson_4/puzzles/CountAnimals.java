// What does this program print? Guess before you run it, then explain why in a comment below.

class Counter {
    private static int count;
    public static void increment() { count ++; }
    public static int getCount() { return count; }
}

class Dog extends Counter {
    public Dog() { }
    public void woof() { increment(); }
}

class Cat extends Counter {
    public Cat() { }
    public void meow() { increment(); }
}

public class CountAnimals {
    public static void main(String[] args) {
        Dog[] dogs = { new Dog(), new Dog() };
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].woof();
        }
        Cat[] cats = {new Cat(), new Cat(), new Cat()};
        for (int i = 0; i < cats.length; i++) {
            cats[i].meow();
        }
        System.out.print(Dog.getCount() + " woofs ");
        System.out.println(Cat.getCount() + " meows");
    }
}