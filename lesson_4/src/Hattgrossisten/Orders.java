package Hattgrossisten;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    List<String> customerInfo = new ArrayList<String>();
    public int orderID;

    public void sendOrder() {
        System.out.println("Sends order to customer");
    }

    public void decreseInventory() {
        // Method that decreses the inventory
    }
}
