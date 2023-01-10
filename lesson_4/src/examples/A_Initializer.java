package examples;

public class A_Initializer {

    final static int aValue;

    // a static initializer can be used to initialize complex variables
    // It will run before main() in order to setup static values in the class
    static {
        // This is not complex and should be defined directly in row 5 instead
        aValue = 3;
    }

    A_Initializer(){
        // this is not allowed
        // aValue = 5;
    }

    public static void main(String[] args) {
    }
}
