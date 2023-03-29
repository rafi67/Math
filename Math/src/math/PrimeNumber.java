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
public class PrimeNumber {
    int num;
    boolean prime(int n) {
        if(n<2) return false;
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public void Prime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value: ");
        num = in.nextInt();
        boolean p = prime(num);
        if(p) System.out.println("Prime Number");
        else System.out.println("Not a Prime Number");
    }
}
