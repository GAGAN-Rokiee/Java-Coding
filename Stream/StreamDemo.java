package Stream;

import java.util.*;

public class StreamDemo {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 34, 45, 7, 2, 6, 7, 4, 52, 24, 56, 23, 7};

        System.out.println("Find Duplicate element in list");
        Set<Integer> set = new HashSet<>();
        Arrays.stream(arr)
                .filter(num -> !set.add(num))
                .distinct()
                .forEach(System.out::println);


        System.out.println("Find min and max value");
        OptionalInt min = Arrays.stream(arr).min();
        OptionalInt max = Arrays.stream(arr).max();
        System.out.println("Minimum value: " + min.getAsInt());
        System.out.println("Minimum value: " + max.getAsInt());

    }

}
