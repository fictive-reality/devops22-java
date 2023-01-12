package Hattgrossisten;

import java.util.ArrayList;
import java.util.List;

public class CustomerBasket {

    public int price;
    List<String> products = new ArrayList<String>();
    List<String> payMethods = new ArrayList<String>();
    List<String> shippingMethods = new ArrayList<String>();

    public void pay() {
        System.out.println("Makes the customer pay");
    }

    public void makeOrder() {
        System.out.println("Makes the order");
    }
}
