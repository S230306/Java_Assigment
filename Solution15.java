
/*Write a program to calculate the factorial of a given number. */
import java.util.*;

public class Solution15 {
    public static int findFactorial(int n) {
        int fact = 1;
        for (int idx = 1; idx <= n; idx++) {
            fact *= idx;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(findFactorial(n));
    }
}
