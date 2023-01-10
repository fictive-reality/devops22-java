package examples;

import java.util.Random;

// This class can't be extended
final public class A_Final{
    final Random rn = new Random();

    // Class field and constant (static) can't be changed
    public static final String CURRENCY_SEK = "SEK";

    // class method (static) can't be hidden by subclass
    final static double exchangeToSek(double rate, double amount){
        return rate * amount;
    }

    // Final instance field can't be changed
    final int magicNumber = rn.nextInt(10); 

    public static void main(String[] args) {
        A_Final aFinal = new A_Final();
        System.out.println(aFinal.magicNumber);

        A_Final anotherFinal = new A_Final();
        System.out.println(anotherFinal.magicNumber);

        // You can't assign final instance fields
        // anotherFinal.magicNumber = 8;
    }
}

// You can define multiple classes in a file, BUT you should probably not do it
// You can't extend a final class
/*
class AnotherClass extends A_Final{
    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        System.out.println(anotherClass.magicNumber);
    }
}
*/
