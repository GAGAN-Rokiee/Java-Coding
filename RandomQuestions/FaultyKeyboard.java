package RandomQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FaultyKeyboard {

/*    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.



            Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
    public static void main(String[] args) {
       int[]  nums = {2,7,11,15};
       int target = 9;
      int[] result = sum(nums, target);

       // Arrays.stream(result).forEach(System.out::println);
       System.out.println(result);


    }
    public static int[] sum(int[] nums, int target)
    {
        Map<Integer,Integer> numtoIndex= new HashMap<>();
     for(int i=0 ;i<nums.length;i++) {
         int num = nums[i];
         int cmp=target-num;
         if(numtoIndex.containsKey(cmp))
         {
             return  new int[]{numtoIndex.get(cmp),i};
         }
         numtoIndex.put(num, i);
     }
     return  new int[0];
    }

}
