/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenasrepaso;

/**
 *
 * @author benjas
 */
public class CadenasRepaso {

    public static void main(String[] args) {
        // TODO code application logic here
        //Separacion de cadenas
        String cadena = "Luis&28&medellin&hombre";
        
        String [] ejemplo = cadena.split("&");
        
        String nombre = ejemplo[0];
        String number = ejemplo[1];
        String ciudad = ejemplo[2];
        String genero = ejemplo[3];
        
        for(String valor:ejemplo){
            System.out.println(valor);
        
        }
        
        System.out.println(nombre);

    }
    
}
