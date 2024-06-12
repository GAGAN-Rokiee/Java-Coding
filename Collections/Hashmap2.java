package Collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {
    public static void main(String[] args) {
        Map<String,String> stringMap = new HashMap<>();

        stringMap.put("Gagan", "Agra");
        stringMap.put("Rohit", "Agra");

        stringMap.forEach((key, value) -> System.out.println(" key: " + key + " || value: " + value));
    }

}

