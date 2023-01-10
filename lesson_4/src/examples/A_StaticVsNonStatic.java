package examples;

public class A_StaticVsNonStatic {

    // Class field and constant (static)
    public static final String CURRENCY_SEK = "SEK";

    // class method (static)
    static double exchangeToSek(double rate, double amount){
        return rate * amount;
    }

    // Instance field (non static) with default value
    int counter;

    // Instance method
    void count(){
        counter++;
    }

    public static void main(String[] args) {
        
        // Local scope
        double rate = 9.7;
        double dollars = 100;

        // We don't have to write A_StaticVsNonStatic.exchangeToSek within the same class
        double howMuchInSek = exchangeToSek(rate, dollars);

        // https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Formatter.html
        System.out.printf("Exchanged to: %.2f %s%n", howMuchInSek, CURRENCY_SEK);


        // Instance variables can't be called from a static method
        // count();

        // We first need to create a object
        A_StaticVsNonStatic staticVsNonStatic = new A_StaticVsNonStatic();
        staticVsNonStatic.count();
        System.out.println(staticVsNonStatic.counter);
        staticVsNonStatic.count();
        System.out.println(staticVsNonStatic.counter);
    }
}
