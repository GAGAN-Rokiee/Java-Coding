package Collections;

import java.util.Arrays;
import java.util.List;

public class Pairs {
    public static void main(String[] args) {
        Integer[] array = {10, 15, 8, 12, 23, 9, 5};
        int targetSum = 20;
        List<Integer> intList = Arrays.asList(array);
    /*    intList.stream()
                .flatMap(i -> intList.stream()
                        .filter(j -> i + j == targetSum && i <= j)
                        .map(j -> new int[]{i, j}))
                .distinct()
                .forEach(pair -> System.out.println("Pair: " + pair[0] + ", " + pair[1]));*/

        List<Integer> list = Arrays.asList(array);
        list.stream()
                .flatMap(i -> list.stream()
                        .filter(j-> i+j == targetSum && i<=j)
                        .map( j-> new int[]{i,j}))
                        .distinct()
                        .forEach(pair -> System.out.println("Pair: "+ pair[0] + ","+pair[1]));


    }

}
