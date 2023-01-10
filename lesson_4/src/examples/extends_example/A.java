package examples.extends_example;

class A {
    static final double PI = 3.14159;

    static double getPI() {
        return A.PI;
    }

    A() {
        System.out.println("A constructor");
    }

    String name = "A class";

    protected String getName() {
        return name;
    }

}
