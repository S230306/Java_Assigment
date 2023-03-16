
/*Write a program to check if a given number is prime or not.*/
import java.util.*;

public class Solution13 {
    public static boolean prime(int n) {
        int sqrt = (int) Math.sqrt(n);
        for (int idx = 2; idx <= sqrt; idx++) {
            if (n % idx == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int idx = 2; idx <= n; idx++) {
            if (prime(idx) == true) {
                System.out.print(idx + " ");
            }
        }
    }
}
