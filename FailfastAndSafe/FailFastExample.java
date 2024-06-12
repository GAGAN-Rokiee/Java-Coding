package FailfastAndSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

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
            // Attempt to modify the list (fail-fast behavior)
            list.add("D"); // This will throw ConcurrentModificationException
        }
    }
}
