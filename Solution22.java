
/*Write a Java program to find the LCM (Least Common Multiple) of two numbers. */
import java.util.*;

public class Solution22 {
    public static void Lcm(int a, int b) {
        // lcm(a,b)=a*b/gcd(a,b);
        int c = a;
        int d = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int lcm = (d * c) / a;
        System.out.print(lcm);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        Lcm(a, b);
    }
}