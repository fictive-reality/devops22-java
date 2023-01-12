package Hattgrossisten;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    public String name;
    public String email;
    public int telephone;
    public String address;
    private List<Integer> orderHistory = new ArrayList<Integer>();

    Customer(String name, String email, int telephone, String address) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
    }

    public void receiveOrder() {
        System.out.println("Received order");
    }
}
