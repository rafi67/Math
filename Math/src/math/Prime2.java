/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;
import java.util.*;
/**
 *
 * @author rafis
 */
public class Prime2 {
    int range = 1000000;
    int mx = range;
    int size = range+5;
    int id = 1;
    int prime[] = new int[size];
    boolean cross[] = new boolean[size];
    public void sieve() {
        for(int i=2; i<=mx; ++i) {
            if(cross[i]) continue;
            prime[id++] = i;
            for(long j= (long)i*i; j<=mx; j+=i) cross[i] = true;
        }
    }
    public void prime() {
        sieve();
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter number to check Prime: ");
        num = in.nextInt();
       for(int i=1; i<=mx; i++) {
           if(prime[i]==num) {
               System.out.println(num+" is a prime number");
               return;
           }
       }
       System.out.println(num+" is not a prime number");
    }
}
