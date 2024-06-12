package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBY {
    public static void main(String[] args) {
        String[] emp = {"Gagan", "Rahul", "Shivam", "Vikash", "Rahul", "Gagan"};
        int[] nums = {2, 5, 2, 4, 5, 6, 7, 3, 2, 56, 7, 7, 7, 5, 32, 2, 2, 2, 33, 2};
        List<Integer> numList = List.of(2, 5, 2, 4, 5, 6, 7, 3, 2, 56, 7, 7, 7, 5, 32, 2, 2, 2, 33, 2);
        Map<Integer, Long> collect = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        Map<Integer, Long> collect1 = numList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect1.forEach((key, value) -> System.out.println("Frequency of " + key + "  is :" + value));


        collect1.entrySet()
                .stream()
                .filter(p -> p.getValue() > 1)
                .forEach(p -> System.out.println("Duplicate elements are " + p.getKey()));

        Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(p -> p.getValue() > 1)
                .forEach(p -> System.out.println("duplicate elements are : " + p.getKey()));


       /* List<Integer> list1 = List.of(1, 3, 5, 7, 9);
        List<Integer> list2 = List.of(2, 4, 6, 8, 10);

        List<Integer> collect = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
        System.out.println(collect);*/
    }

}
