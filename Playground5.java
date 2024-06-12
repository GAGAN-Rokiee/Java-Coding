import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Playground5 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    /*    //Given an array containing n-1 integers, find the missing number in the range from 1 to n.
       //int arr[] = {1, 2, 3, 5, 6, 7};
     //   int sum =Arrays.stream(arr).sum();

        String s="GaganDeep Arya";
        char[] charArray = s.toCharArray();

       // cha
        *//*Map<Character, Long> collect =*//*
      *//*  s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ') // Remove empty characters
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((character, frequency) -> {
                    System.out.println("Frequency of : "+character + " is : " + frequency);
                });*//*
        // Arrays.stream(s.chars())*/

     /* Map<String, Long > map  ;

      map.values().stream().max(Long::compare);

        Optional<Map.Entry<String, Long>> max = map.entrySet().stream().max(Map.Entry.comparingByValue());
         max.ifPresent(entry-> System.out.println("Emp with highest Salary"+ entry.getKey() +
                 "with salary"+ entry.getValue()));
*/
    }

}

