/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;

import java.util.Scanner;

/**
 *
 * @author rafis
 */
public class Triangle {
     double height, base, area;
    public void Area() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height:");
        height = in.nextDouble();
        System.out.println("Enter base:");
        base = in.nextDouble();
        area = 0.5 * base * height;
        System.out.println("Area of triangle is "+area);
    }
}
