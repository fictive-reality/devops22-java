package examples;

public class A_DefaultConstructor {

    // If a constructor is defined the empty constructor will not work
    /*
    A_DefaultConstructor(int x){

    }*/

    public static void main(String[] args) {
        // if no other constructor is defined this will work
        new A_DefaultConstructor();
    }
    
}
