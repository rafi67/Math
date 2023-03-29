/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author rafis
 */

public class SummationOfOddAndFactorial {
    public static void Summation() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        n = input.nextInt();
        int x;
        System.out.print("Enter value of x: ");
        x = input.nextInt();
        Factorial fact = new Factorial();
        int result = 0;
        for(int i=1; i<=n; ++i) {
            if(i%2==0) {
                result += Math.pow(x, i)/fact.fact(i-1);
            }
        }
        System.out.println("Summation of Series: "+result);
    }
}
