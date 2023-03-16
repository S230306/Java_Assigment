
/*Write a program that takes in two arrays of integers
 *and returns a new array that contains only the common
 *elements between the two arrays. The new array should 
 *not contain any duplicates. */
import java.util.*;

public class Solution17 {
    public static int[] newArray(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        int[] res = new int[set.size()];
        int i = 0;
        for (int num : set) {
            res[i++] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int idx = 0; idx < arr1.length; idx++) {
            arr1[idx] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int idx = 0; idx < arr2.length; idx++) {
            arr2[idx] = scn.nextInt();
        }
        int[] res = newArray(arr1, arr2);
        for (int idx = 0; idx < res.length; idx++) {
            System.out.print(res[idx] + " ");
        }
    }
}
