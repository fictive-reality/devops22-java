package lesson_4.Gruppuppgift;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String name;
    public String mail;
    public int tel;
    public String address;
    public List<String> orderhistory = new ArrayList<String>();


    public static void recieveOrder() {
        System.out.println("Test recieveOrder");
    }

    private static void printName() {
        System.out.println("fabian Lörstad");
    }


}

