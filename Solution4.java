
/*Write a Java program that creates an array of integers and finds the maximum
 and minimum values using a hashmap. */
import java.util.*;

public class Solution4 {
    public static void findMaxMin(int[] arr) {
        // Creating Hashamp
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int idx = 0; idx < arr.length; idx++) {
            map.put(arr[idx], idx);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int x : map.keySet()) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }
        System.out.print(max + " " + min);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        findMaxMin(arr);
    }
}
