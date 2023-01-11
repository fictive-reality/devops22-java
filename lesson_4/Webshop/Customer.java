package Webshop;
import java.util.List;
import java.util.ArrayList;



public class Customer{
    private String name;
    private String email_address;
    private int phone_number;
    private String shipping_address;
    

    public Customer(String name, String email_address,
     int phone_number, String shipping_address) {
        this.name = name;
        this.email_address = email_address;
        this.phone_number = phone_number;
        this.shipping_address = shipping_address;
     }

        public String getName() {
            return name;
        }public String getEmail_address() {
            return email_address;
        }public int getPhone_number() {
            return phone_number;
        }public String getShipping_address() {
            return shipping_address;
        }

        public List<String> orderhistory = new ArrayList<String>();

        public static void recieveOrder() {
            System.out.println("Testing recieve Orders");


        }

}
