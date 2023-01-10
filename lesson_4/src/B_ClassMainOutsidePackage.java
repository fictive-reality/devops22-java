

import examples.B_Class;

public class B_ClassMainOutsidePackage {
    public static void main(String[] args) {
        B_Class b_class = new B_Class("hello", 2);
        System.out.println(b_class.getColor());
    }

}
