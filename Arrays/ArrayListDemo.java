package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListDemo {
    public static void main(String[] args) {/*
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("BMW");
        System.out.println(cars.get(1));*/

       /* HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Germany", "Berlin");
        capitalCities.remove("England");
        System.out.println(capitalCities);

        System.out.println("capital of Germany : " + capitalCities.get("Germany") );*/


        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");

        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");
        System.out.println(cars);

    }



}
