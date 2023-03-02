package Webshop;

import java.util.List;
import java.util.ArrayList;

public class Cart implements Preorder {

        int order_price;
    
        List<String> products = new ArrayList<String>();
        List<String> pay_methods = new ArrayList<String>();
        List<String> shipping_methods = new ArrayList<String>();
    
        Cart test1 = new Cart();
    
        public static void pay() {
            System.out.println("Test payment");
        }
    
        public static void YourOrders() {
            System.out.println("Test make order");
        }
    
    

@Override
    public void Preorder1() {
        System.out.println("Hej");
    }
}



    