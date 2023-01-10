package examples;

import java.util.ArrayList;
import java.util.List;

public class C_Main {
    public static void main(String[] args) {
        C_Car car = new C_Car();
        C_Car anotherCar = new C_Car();
        C_Tractor tractor = new C_Tractor();

        List<C_Vehicle> list = new ArrayList<>();
        list.add(car);
        list.add(anotherCar);
        list.add(tractor);

        for (C_Vehicle c : list) {
            if (c instanceof C_Car) {
                C_Car casted_car = (C_Car) c;
                casted_car.blink();
            }
            c.honk();
        }
    }
}
