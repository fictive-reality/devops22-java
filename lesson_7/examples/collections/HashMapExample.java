package lesson_5.examples.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

    // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("hello", "world");
        System.out.println("HaspMap get hello: " + map.get("hello"));

        System.out.println("HashMap containsKey hello: " + map.containsKey("hello"));
        System.out.println("HashMap containsValue world: " + map.containsValue("world"));

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println("Value: " + value);
        }
    }
}
