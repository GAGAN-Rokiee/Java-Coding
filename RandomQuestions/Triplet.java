package RandomQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplet {
    public static void main(String[] args) {
        int target = 8;
        int[] list = {3, 2, 5, 1, 9, 8,0,1};
        List<List<Integer>> triplets = findtriplets(list, target);
        System.out.println(triplets);
    }

    private static List<List<Integer>> findtriplets(int[] list, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(list);
        for (int i = 0; i < list.length - 2; i++) {
            int left = i + 1;
            int right = list.length - 1;
            while (left < right) {
                int currntValue = list[i] + list[left] + list[right];
                if (currntValue == target) {
                    result.add(List.of(list[i] , list[left] , list[right]));
                    left++;
                    right--;
                } else if (currntValue < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return  result;
    }
}
