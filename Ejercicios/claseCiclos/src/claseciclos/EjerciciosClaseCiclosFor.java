/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseciclos;
import java.util.Scanner;

/**
 *
 * @author FS
 * 2021
 */

public class EjerciciosClaseCiclosFor {

    /**
     * @param args the command line arguments
     */
    //Ciclo FOR
    //Ejemplo 1
    public static int suma(int n){
        int s = 0;
        
        for(int i = 1; i<= n; i++){
            s+= i;
        }
    return s;
    }
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int n = sc.nextInt();
        System.out.println("La suma de los primeros " +n +" números naturales es: " +suma(n));
    
                //Ejemplo 2
        int num = 0;
        
        for(int i = 0, j = 10; i>2 && j<4; i++, j--){
            System.out.println(i+ "," + j);
        }
        
      //FOR para ARRAYS
      String [] frutas = new String[]{"Tomate de árbol", "Maracuya", "Guayaba"};
      for(String f:frutas){
          System.out.println(f);
      }
      
      //Ejemplo4
      String[] fru = new String[]{"Pera", "Maracuya", "Lulo", "Granadilla"};
      
      for(String fr:fru){
          System.out.println(fr);
          if(fr.equals("Lulo")) break;
      }  
    }
}


