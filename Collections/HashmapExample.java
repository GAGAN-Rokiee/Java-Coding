package Collections;

import java.util.*;
import java.util.stream.Collectors;
public class HashmapExample {
    public static void main(String[] args) {

        /*
        * Merge two sorted lists, resultant list should be sorted.
        For example, given following lists :
        a  = {5, 8, 20}
        b = {4, 11, 15}
        The merged list should be :
        result = {4, 5, 8, 11, 15, 20}*/

       /*   Arrays.asList(a).stream().collect(Collectors.toList());

          Stream.concat(a.stream(),b.stream())
                  .sorted()
                  .collect(Collectors.toList());*/
        int a[]  = {5, 8, 20};
        int b[] = {4, 11, 15};
        List<Integer> list  = new ArrayList<>();

        for(int i=0,j=0; i< a.length;  ) {
              if(a[i]<b[i])
              {
                list.add(a[i]);
                i++;
              }
              else
              {
                  list.add(b[i]);
                j++;
              }

          }
        System.out.println(list);
    }
}

/*  // Grouping persons by age
        Map<Integer, List<Person>> groupedByAge = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        // Display the result
        groupedByAge.forEach((age, people) ->
                System.out.println("Age " + age + ": " + people));*/

