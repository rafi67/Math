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
public class Factorial {
    public int fact(int num) {
        if(num==1) return 1;
        return num*fact(num-1); 
    }
    public void Show() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.println("Factorial is "+fact(num));
    }
}
 