// What does this program print? Guess before you run it, then explain why in a comment below.

public class AnimalFarm {
    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        System.out.println(pig == dog);
    }
}