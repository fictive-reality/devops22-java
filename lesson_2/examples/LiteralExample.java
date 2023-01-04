package lesson_2.examples;

public class LiteralExample {
    public static void main(String[] args) {
        int decimal_int = 1;
        System.out.println(decimal_int);
        int octal_int = 05;
        System.out.println(octal_int);
        int hex_int = 0xff;
        System.out.println(hex_int);

        float a_float = 1.0f;
        System.out.println(a_float);

        double a_double = 2.1;
        System.out.println(a_double);
        double exp_float = 1e-3; // 0.001
        System.out.println(exp_float);

        String a_string = "hello world";
        System.out.println(a_string);

        long a_long = 1;
        System.out.println(a_long);
        long another_long = 1L;
        System.out.println(another_long);

        boolean a_bool = true;
        System.out.println(a_bool);

        Object a_object = null;
        System.out.println(a_object);

        char a_char = 'A';
        System.out.println(a_char);
    }
}
