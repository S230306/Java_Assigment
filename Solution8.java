
/*Write a Java program that creates an array of integers and removes all the even
 numbers from it using a hash map. */
import java.rmi.Remote;
import java.util.*;

public class Solution8 {
    public static void RemoveEven(int[] arr) {
        // Hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] % 2 != 0) {
                map.put(arr[idx], map.getOrDefault(arr[idx], 0) + 1);
            }
        }
        for (int x : map.keySet()) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        RemoveEven(arr);
    }
}
