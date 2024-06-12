package Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByString {
    public static void main(String[] args) {
        String name = "HelloThisisDemoString";
       /* Set<Character> duplicateChars = name.chars() // Stream over character codes (int values)
                .mapToObj(c -> (char) c) // Convert int stream to Character stream
                .collect(Collectors.groupingBy( // Group by each character
                        c -> c, // Key by the character itself
                        Collectors.counting() // Count occurrences
                ))
                .entrySet().stream() // Stream over the entries in the map
                .filter(entry -> entry.getValue() > 1) // Filter for counts > 1
                .map(Map.Entry::getKey) // Extract the character
                .collect(Collectors.toSet());*/
        name.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        c->c,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1)
                .forEach(entry -> System.out.println("frequency of "+ entry.getKey() + " is:  "+ entry.getValue()));
    }
}
