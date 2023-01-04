package examples;

class WideningExample {
    public static void main(String[] args) {
        int a_int = 10000;

        // Widening
        long a_long = a_int;
        a_long++;
        System.out.println(a_long);
        System.out.println(a_int);

        // Narrowing
        // int another_int = a_long;

        // cast
        int another_int = (int) a_long;
        System.out.println(another_int);
    }
}