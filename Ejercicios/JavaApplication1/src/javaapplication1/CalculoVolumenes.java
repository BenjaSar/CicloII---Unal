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
public class CalculoVolumenes {

    /**
     * @param args the command line arguments
     */
    
    public static double  volumenEsfera(double r){
        double volumen = (4 * Math.PI * Math.pow(r, 3))/3;
                return volumen;
                }
    
    
    public static double volumenCono(double r, double h){
        double volumen = (Math.PI * h * Math.pow(r, 2))/3;
        return volumen;    
    }
       
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el radio de la esfera");
        double rEsfera = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el radio del cono");
        double rCono = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la hipotenusa del cono");
        double hCono = Double.parseDouble(sc.nextLine());
        double volumen = volumenEsfera(rEsfera) + volumenCono(rCono, hCono);
        System.out.println(volumen);
    }
    
}
