package lesson_4.Gruppuppgift;

import java.util.List;
import java.util.ArrayList;

public class CustomerBasket {
    int order_price;
    List<String> products = new ArrayList();
    List<String> pay_methods = new ArrayList();
    List<String> shipping_methods = new ArrayList();

    CustomerBasket test123 = new CustomerBasket();

    public static void pay() {
        System.out.println("Test pay");
    }

    public static void makeOrder() {
        System.out.println("Test makeOrder");
    }
}