package lesson_4.examples;

public class C_Tractor implements C_Vehicle {

    // Override not compulsory, but helps the compiler check for errors
    @Override
    public void honk() {
        System.out.println("*loud* HONK HONK");
    }

    @Override
    public void honk(int level) {
        System.out.printf("*level: %d* Honk Honk\n", level);
    }

}