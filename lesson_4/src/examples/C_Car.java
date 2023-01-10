package examples;

public class C_Car implements C_Vehicle {
    public static void main(String[] args) {
        C_Car car = new C_Car();
        car.honk();
        car.honk(1);
        car.blink();
    }

    public void blink() {
        System.out.println("Light on light off");
    };

    @Override
    public void honk() {
        System.out.println("Honk Honk");
    }

    @Override
    public void honk(int level) {
        System.out.printf("*level: %d* Honk Honk\n", level);
    }

}