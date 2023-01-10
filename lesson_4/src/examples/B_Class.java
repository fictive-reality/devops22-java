package examples;

// this is a class
public class B_Class {
    // Class field
    private static final int MAGIC_NUMBER = 7;

    // Class method
    static int getMagicNumber() {
        return MAGIC_NUMBER;
    }

    // Instance field
    private String color;

    // Instance method
    public String getColor() {
        return this.color;
    }

    // Initializer runs before constructor
    {
        System.out.println("Initializer ran");
        color = "red";
    }

    // Static Initializer runs when before instance initializer
    static {
        System.out.println("Static Initializer ran");
    }

    // Constructor
    B_Class() {
        System.out.println("Constructor ran");
    }

    // Another Constructor
    public B_Class(String name) {
        System.out.printf("Constructor ran for %s\n", name);
    }

    // Another Constructor
    public B_Class(String name, int number) {
        System.out.printf("Constructor ran for %s with number %d\n", name, number);
    }
}