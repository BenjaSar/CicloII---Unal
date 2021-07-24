/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.Scanner;
/**
 *
 * @author FS
 */

public class Arreglos {

    /**
     * @param args the command line arguments
     */
    
    public static void escribe_arreglos_reales(double [] x){
            int n = x.length;
        
            for(int i = 0; i< n; i++){
                System.out.println("x [" +i+"]=" + x[i] );
            }
        
        }
    
    
    public static int posMaxValue(int [] y){
        int pos = 0;
        
        for(int i = 0; i< y.length; i++){
            if(y[i]>y[pos]){
                pos = i;
            }
        }
      
        int value = y[pos];
        
        return value;

    }  
    
    public static void main(String[] args) {
        // TODO code application logic here

        //Operaciones con arreglos
    
    double [] x = {8.5, 9.4, 3.2};
    
    int [] y = {1, 2, 3, 9, 1, 10, 12, 52, 7};
    System.out.println(posMaxValue(y));
    
    }
    
}