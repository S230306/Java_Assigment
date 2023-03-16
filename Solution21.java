
/*Write a Java program to find the maximum and minimum value in a set of numbers entered by the user. */
import java.util.*;

public class Solution21 {
    public static int[] ReturnMaxMin(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int idx = 0; idx < arr.length; idx++) {
            set.add(arr[idx]);
        }
        int[] res = new int[2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : set) {
            if (num > max) {
                max = num;
                res[0] = max;
            }
            if (num < min) {
                min = num;
                res[1] = min;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        int[] res = ReturnMaxMin(arr);
        for (int idx = 0; idx < res.length; idx++) {
            System.out.print(res[0] + " " + res[1]);
            return;
        }

    }
}
