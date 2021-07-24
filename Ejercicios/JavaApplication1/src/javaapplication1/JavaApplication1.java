/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author benjas
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static double elevarCuadrado(double x) {
        //return x * x;   
        return Math.pow(x, 2);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un n´umero:");
        int n = sc.nextInt();
        int m = n * 2;
        System.out.println("Resultado: "+m);*/
        Scanner sc = new Scanner (System.in);
        double d = Double.parseDouble(sc.nextLine());
        System.out.println(elevarCuadrado(d));
    
    }
    
}
