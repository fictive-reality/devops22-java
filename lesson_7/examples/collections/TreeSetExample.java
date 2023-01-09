package lesson_5.examples.collections;

import java.util.*;

public class TreeSetExample {
    

    public static void main(String[] args) {
        Set<Double> ts = new TreeSet<Double>();
        ts.add(1.0);
        ts.add(2.0);
        ts.add(0.5);
        System.out.println(ts);
    }

    // Group exercise
    // 1. Create TreeSet with other types than Double
    // 2. Try to add the same value twice and then call size what happens?
    // 3. Try to remove a value
}
