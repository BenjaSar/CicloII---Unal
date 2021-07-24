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

public class ClaseCiclos {

    /**
     * @param args the command line arguments
     */
        //Ejemplo 3
    public static double minMaquina(){
     
        double Xo =  1.0;
        double Xi =  Xo/2.0;
        
        while(Xi > 0.0){
         
            Xo = Xi;
            Xi = Xo/2.0;
        }
        return Xo;
    }
    
    
    public static double minMaquinaDos(){
    
        double Xo = 1.0;
        double Xi = Xo/2.0;
        
        do{
            Xo = Xi;
            Xi = Xo/2.0;
        }while(Xi> 0.0);
        return Xo;
    }
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        //While
        /*int i = 0;
        while(i <= 6){
            System.out.println(i);
            i++;
        }*/
        
    //Ejemplo 2
    /* int i =  2;    
        int j = 25;
        while(i<j){
            System.out.println(i+ ", " +j);
            i = i*2;
            j = j+10;    
        }
        System.out.println("El final:");
        System.out.println(i+ ", " +j);*/
        //Ejemplo 3 while
        System.out.println(minMaquina());
        //Ejemplo 4 Do While
        System.out.println(minMaquinaDos());
        
        
        //Ejemplo 5
        //Forzar salida de ciclos.
        int  suma = 0;
        while (true){
            Scanner escaner = new Scanner(System.in);
            System.out.print("Ingrese un número entero");
            System.out.println(" a sumar o 0 para salir");
            int dato = Integer.parseInt(escaner.nextLine());
            
            if(dato == 0) break;
            suma+= dato;         
        }
        System.out.println("La suma es:"+suma);
        
        //Ejemplo 6 Do While
                int  sum = 0;
        do {
            Scanner escaner = new Scanner(System.in);
            System.out.print("Ingrese un número entero");
            System.out.println(" a sumar o 0 para salir");
            int dato = Integer.parseInt(escaner.nextLine());
            
            if(dato == 0) break;
            sum+= dato;         
        } while(true);
        System.out.println("La suma es:"+sum);   
    }
       
 }
