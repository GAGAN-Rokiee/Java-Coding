package RandomQuestions;

import java.util.*;

public class FriendsTripProblem {

    public static void main(String[] args) {
        FriendsTripProblem fndstrip = new FriendsTripProblem();

        // Test cases
        int[] P1 = {1, 4, 1};
        int[] S1 = {1, 5, 1};
        System.out.println(fndstrip.solution(P1, S1));  // Output :2

        int[] P2 = {4, 4, 2, 4};
        int[] S2 = {5, 5, 2, 5};
        System.out.println(fndstrip.solution(P2, S2)); // Output: 3

        int[] P3 = {2, 3, 4, 2};
        int[] S3 = {2, 5, 7, 2};
        System.out.println(fndstrip.solution(P3, S3)); // Output: 2
    }

    public int solution(int[] P, int[] S) {

        int car_needed=0;
        int total_passenger= Arrays.stream(P).sum();
        Arrays.sort(S);
        for (int num : S) {
            System.out.print(num + " ");
        }
        for(int i: S)
        {
            System.out.println("total passenger :"+ total_passenger);
            if(total_passenger >0)
            {
                total_passenger = total_passenger-i;
                car_needed++;
            }
        }
        return  car_needed;
    }
}
