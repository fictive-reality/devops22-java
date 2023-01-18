package se.nackademin.collections;

import java.util.*;

public class HashSetExample {


    public static void main(String[] args) {

        Set<String> aHashSet = new HashSet<String>();

        aHashSet.add("Pelle");
        aHashSet.add("Lisa");
        aHashSet.add("Anna");
        aHashSet.add("Örjan");
        aHashSet.add("Pelle");

        System.out.println(aHashSet);

        /*
        Set<String> anotherHashSet = new HashSet<String>();

        anotherHashSet.add("Pelle");
        anotherHashSet.add("Olle");
        anotherHashSet.add("Mohammad");

        System.out.println(anotherHashSet);
        */
        // Group Exercise test the following methods

        // https://en.wikipedia.org/wiki/Union_(set_theory)
        // 1. addAll

        // https://en.wikipedia.org/wiki/Intersection_(set_theory)
        // 2. retainAll

        // 3. removeAll

        // 4. Given a list names, how can you use set to get a unique list of names without duplicates? 
        // List<String> names = Arrays.asList("Olle", "Pelle", "Lisa", "Örjan", "Mohammad", "Evert", "Pelle", "Lisa", "Mohammad");
        // 5. [Extra] If you want a sorted list of unique names?
        
    }
    
}
