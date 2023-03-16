
/*Write a Java program that creates an array of integers
 *and converts it into a hash map where the keys are the elements
 *of the array and the values are their corresponding indices. */
import java.util.*;

class Solution1 {
    public static void aToHashMap(int[] arr) {
        // creating a HashMap.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int idx = 0; idx < arr.length; idx++) {
            map.put(arr[idx], idx);
        }
        // print the map.
        System.out.print(map);
        System.out.println();
        for (Map.Entry<Integer, Integer> print : map.entrySet()) {
            System.out.println(print.getKey() + " " + print.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        aToHashMap(arr);
    }
}