package examples;

public class A_Encapsulation {
 
    // Others should not be able to modify this value.
    private int internalValue = 5;
    
    public int doSomething(int y){
        int x = internalValue * y;
        System.out.println("A_Encapsulation - doSomething " + x);
        return x; 
    }


}

class SomeoneElse extends A_Encapsulation {
    
    @Override
    public int doSomething(int y) {
        // this will not work since internalValue is not visible
        // return internalValue * y;  
        System.out.println("SomeoneElse - doSomething");

        // we can still use super to access the super class A_Encapsulation
        return super.doSomething(y);
    }

    public static void main(String[] args) {
        System.out.println("---- A_Encapsulation ----");
        A_Encapsulation aEncapsulation = new A_Encapsulation();

        // this is not possible
        // aEncapsulation.internalValue = 1;
        aEncapsulation.doSomething(10);

        System.out.println("---- SomeoneElse ----");
        
        SomeoneElse someoneElse = new SomeoneElse();
        someoneElse.doSomething(8);

        // This is not possible
        // someoneElse.internalValue = 4;

    }
}
