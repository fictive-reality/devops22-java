package examples;

class PrimitiveVsReference {

    public static void main(String arg[]) {
        Integer y = 10;

        String i = y.toString();
        System.out.println(i);

        // This will not work since it's a primitive type
        // int x = 20;
        // String j = x.toString();
        // System.out.println(j);

    }
}