
/*Write a Java program that creates an array of integers and checks if 
 *there are any duplicates using a hash map. */
import java.util.*;

public class Solution5 {
    public static void checkDublicates(int[] arr) {
        int[] freq = new int[10];
        for (int idx = 0; idx < arr.length; idx++) {
            freq[arr[idx]]++;
        }
        for (int idx = 0; idx < arr.length; idx++) {
            if (freq[arr[idx]] != 1) {
                System.out.print(true);
                return;
            }
        }
        System.out.print(false);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        checkDublicates(arr);
    }
}
