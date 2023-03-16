
/*Write a program to find the Fibonacci sequence up to a given number.*/
import java.util.*;

class Solution14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0, b = 1, c = a + b;
        for (int idx = 0; idx < n; idx++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }

    }
}