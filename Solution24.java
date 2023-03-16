
/*Write a program to implement binary search on an array of strings. */
import java.util.*;

public class Solution24 {
    public static char BinarySearch(char[] arr, char target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char[] arr = str.toCharArray();
        char target = scn.next().charAt(0);
        System.out.print(BinarySearch(arr, target));
    }
}
