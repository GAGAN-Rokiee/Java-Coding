package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElementArray {

    public static void main(String[] args) {
        Integer[] array = {10,15,8,12,23,9,5,10,9,5};
        List<Integer> list = Arrays.stream(array)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(p -> p.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Duplicate elements are:"+list);

        HashMap<Integer, List<Integer>> map1 = new HashMap();
        for( int i= 0 ; i<array.length ; i++)
            for( int j= i+1; j<array.length-1 ;j++)
            {
                if(array[i]+array[j]==20)
                {
                    map1.put(i,List.of(array[i],array[j]));
                }
            }








       /* List<Integer> duplicates = Arrays.stream(array)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        
        *//*List<Integer> duplicates = Arrays.stream(array)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());*//*

        System.out.println("Duplicate elements: " + duplicates);*/
    }
}



