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
public class Circle {
    double pi = 3.1416, r;
    public void Area() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = in.nextDouble();
        double area = pi*r*r;
        System.out.println("Area of circle is "+area);
    }
}
