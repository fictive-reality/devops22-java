package lesson_5.examples.collections;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Pelle");
        myList.add("Pelle");
        myList.add("Lisa");
        
        System.out.println(myList);
        myList.add(1, "Olle");
        myList.set(1, "Anna");
        System.out.println(myList);

        // Group Exercise:
        // 1. Test the following
        // remove, removeAll, clear, isEmpty, size  
        
        // 2. use get & set read the docs how to use them

        // 3. try indexOf, and lastIndexOf
        // how does it work? try to add another Pelle, remove etc.
        // System.out.println(myList.indexOf("Pelle"));
    }
    
}
