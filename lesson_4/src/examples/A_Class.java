package examples;

// this is a class
public class A_Class {

    // Class field with field modifier private, static, final and type int
    private static final int MAGIC_NUMBER = 7; // constant

    // Class method with method modifier static and type int
    static int getMagicNumber() {
        return MAGIC_NUMBER;
    }

    // Instance field with field modifier private and type String
    private String color;

    // Instance method with modifier public and type String
    public String getColor() {
        return this.color;
    }

    // Initializer runs before constructor
    {
        System.out.println("Initializer ran");
        color = "red";
    }

    // Constructor
    A_Class() {
        System.out.println("Constructor ran");
    }

    public static void main(String[] args) {
        A_Class a_class = new A_Class();
        System.out.println(a_class.color);
    }
}