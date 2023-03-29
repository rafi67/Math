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
public class OddEven {
    int number;
    public void Display() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = in.nextInt();
        if(number%2==0) System.out.println("Number is Even");
        else System.out.println("Number is Odd");
    }
}
