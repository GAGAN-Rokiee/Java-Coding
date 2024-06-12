package SearchingSorting;

import java.util.*;
import java.util.stream.Collectors;

public class CustomSort {
    public static void main(String[] args) {
        int[] input = {1, 3, 3, 2};
        int[] output = customSort(input);

        System.out.println(Arrays.toString(output));
    }

    public static int[] customSort(int[] arr) {
        // Create a map to store the original indices of elements
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Populate the map with elements and their indices
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            map.computeIfAbsent(num, k -> new ArrayList<>()).add(i);
        }

        // Sort the unique elements in ascending order
        Set<Integer> uniqueElements = new TreeSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        // Create the output array
        int[] output = new int[arr.length];
        int index = 0;

        // Iterate through unique elements and their original indices
        for (int num : uniqueElements) {
            List<Integer> indices = map.get(num);
            for (int i : indices) {
                output[index++] = num;
            }
        }

        return output;
    }
}
