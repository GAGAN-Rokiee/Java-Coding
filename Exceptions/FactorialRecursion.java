package Exceptions;

public class FactorialRecursion {

    int num=5;
    public static void main(String[] args) {


       // int arr[] = {"347"}
                //  int no to
        System.out.println("Factorial of number is : "+ factorial(5));
    }

    /*public static int fibonacci(int n) {
        if (n <= 0) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }*/


    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return binarySearch(arr, low, mid - 1, target);
            }
            return binarySearch(arr, mid + 1, high, target);
        }
        return -1;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}


