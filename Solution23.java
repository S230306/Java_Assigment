
/*Write a program to implement linear search on an array of integers. */
import java.util.*;

public class Solution23 {
    public static int LinearSearch(int[] arr, int target) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == target) {
                return arr[idx];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.print(LinearSearch(arr, target));
    }
}
