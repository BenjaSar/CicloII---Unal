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

public class EjerciciosClaseCiclos1 {

    /**
     * @param args the command line arguments
     */
        //Ejemplo 3
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        //Imprimir numeros del 1 al 100 
        int num = 100, i = 0;
        boolean flag = true;
        
        while(i <=num){
            System.out.println(i+ ", " + Math.pow(i, 2));
            i++;
        }
        
        //Ejercicio 2
        int j = 0;
        System.out.println("Lista de números impares");
        
        while(j <= 999){
            if(j%2 == 1){
                System.out.println(j);
            }
            j++;
        }
        
        System.out.println("Lista de números pares");
        int x = 0;
        
        while(x <= 1000){
            if(x%2 == 0){
                System.out.println(x);
            }
            x++;
        }
        
        //Ejercicio 3. Imprimir los números pares en forma descendente
        
        //Capturamos con el objeto scanner
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número mayor a 2");
        
        int number = sc.nextInt();
        
        while (number >= 2){
            //Verificamos que el número sea par
            if(number%2 == 0){
                System.out.println(number);
            }
        //Actualizacion del dato    
        number--;
        
        }
    }       
 }


