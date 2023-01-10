package examples.interface_example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Monkey monkey = new Monkey();

        List<Animal> list = new ArrayList<>();
        list.add(elephant);
        list.add(monkey);

        list.forEach((a) -> {
            a.sleep();
            a.backFlip();
        });
    }

}
