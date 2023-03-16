
/* Write a Java program that reads a list of numbers
*from the user and calculates the mean
* median, and mode using an array and a hash map.*/
import java.util.*;

public class Solution7 {
    // creating a HashMap.
    public static void Statics(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int idx = 0; idx < arr.length; idx++) {
            map.put(arr[idx], map.getOrDefault(arr[idx], 0) + 1);
        }
        // calculating the mode.
        int mode = Integer.MIN_VALUE;
        for (int x : map.values()) {
            if (x > mode) {
                mode = x;
            }
        }
        System.out.println(mode);
        // Calculating the mean.
        int sum = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            sum += arr[idx];
        }
        int mean = sum / n;
        System.out.println(mean);
        // calculating the median.
        // even number.
        if (n % 2 == 0) {
            int meadian = ((n / 2) + (n / 2 + 1)) / 2;
            System.out.println(meadian);
        } else {
            // for odd number.
            int meadian = (n + 1) / 2;
            System.out.println(meadian);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        Statics(arr, n);
    }
}
