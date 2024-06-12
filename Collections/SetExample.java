package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class SetExample {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("John","Jane","Micheel","Anna","James");
        Map<Boolean, List<String>> collect = stringList.stream().collect(Collectors.partitioningBy(s -> s.length() > 4));
        collect.values().forEach(System.out::println);

    }
}



/*Time left
01:04:42
Code editor

Longest Substring Without repeating characters
Example 1: abcabcbb
output : 3 , explanation abc is longest substring here

Example 2: bbbb
Output2 : 1 , explanation b is longest sub here

Example 3: abjijkbds
Output 3: 6, ijkbds
Code syntax: Java
Output

Shubham Bansal

Gagan Arya

You're sharing the screen

background*/