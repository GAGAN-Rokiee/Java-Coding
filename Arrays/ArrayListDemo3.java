package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 4, 5, 2, 3, 4, 5, 5);
         String xyz = "Hello World";// input
         //Output  "olleH dlroW"
       String reversed= Arrays.stream(xyz.split("\s+"))
                .map( word ->
                {
                    char[] charArray = word.toCharArray();
                    int left = 0;
                    int right = charArray.length - 1;
                    while (left < right) {
                        char temp = charArray[left];
                        charArray[left] = charArray[right];
                        charArray[right] = temp;
                        left++;
                        right--;
                    }
                    return new String(charArray);
                }
        ).collect(Collectors.joining(" "));

        System.out.println("reversed String is: "+ reversed );
    }

}

