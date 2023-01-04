package lesson_2.examples;

public class ConditionalExample {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        if (x == 1 && y == 2) {
            System.out.println("AND success");
        }

        if (x == 2 || y == 2) {
            System.out.println("OR success");
        }

        if (x != 4) {
            System.out.println("Not equal success");
        }

        String a_string = "hello world";
        if (a_string instanceof String) {
            System.out.println("is a String");
        }

        int condition = 1;
        // int condition = 2;
        // int condition = 3;

        if (condition == 1) {
            System.out.println("if condition is: " + condition);
        } else if (condition == 2) {
            System.out.println("else if condition is: " + condition);
        } else {
            System.out.println("else condition is: " + condition);
        }
        String val = condition == 0 ? "not 1" : "is 1";

    }
}
