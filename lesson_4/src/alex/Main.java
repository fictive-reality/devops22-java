package alex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shoes shoes = new Shoes(100, 10, "Nice Shoes", 42, "Black");
        Hat hat = new Hat(50, 5, "Cowboy Hat", 56, "White");

        List<InterfaceProducts> list = new ArrayList<>();
        list.add(shoes);
        list.add(hat);

        System.out.println(shoes.toString());
        System.out.println(hat.toString());
    }

}