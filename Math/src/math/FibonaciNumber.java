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
public class FibonaciNumber {
    public void Number() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int a = 0, b = 0, c = 1;
        for(int i=0; i<num; i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.print(a+" ");
        }
        System.out.println();
    } 
}
