package FailfastAndSafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements to the list
        list.add("A");
        list.add("B");
        list.add("C");

        // Creating an iterator
        Iterator<String> iterator = list.iterator();

        // Modifying the list while iterating
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            // Modifying the list (fail-safe behavior)
            list.add("D");
        }

        // After iteration, print the updated list
        System.out.println("Updated list: " + list);
    }
}
