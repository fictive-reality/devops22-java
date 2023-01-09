package lesson_3.examples;

public class H_StringEqualExampleTwo {

    public static void main(String[] args) {

        // This will use the same reference object
        String hello = "hello";
        String hello2 = "hello";

        // This will also use the same reference
        String he_llo = "he" + "llo";

        // This evaluated if they are the the same object
        System.out.printf("hello == hello2 -> %s\n", hello == hello2);

        // identityHashCode prints the reference
        System.out.printf("identityHashCode(hello): %s\n", System.identityHashCode(hello));
        System.out.printf("identityHashCode(hello2): %s\n", System.identityHashCode(hello2));
        System.out.printf("identityHashCode(he_llo): %s\n\n", System.identityHashCode(he_llo));

        // New String will force the use of a new reference
        String hello3 = new String("hello");
        System.out.printf("identityHashCode(hello3): %s\n", System.identityHashCode(hello3));
        System.out.printf("hello == hello3 -> %s\n", hello == hello3);
        System.out.printf("hello.equals(hello3) -> %s\n", hello.equals(hello3));
        
        // Read about more string identity and string pools https://www.baeldung.com/java-string-pool
    }
}
