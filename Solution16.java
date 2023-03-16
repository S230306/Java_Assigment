
/*Write a program to find the GCD (Greatest Common Divisor) 
 *of two numbers. */
import java.util.*;

public class Solution16 {
    public static int findtheGCD(int a, int b) {
        // Eclidean Algorithm
        // gcd(a,b) = gcd(b,a%b);//
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.print(findtheGCD(a, b));
    }
}
