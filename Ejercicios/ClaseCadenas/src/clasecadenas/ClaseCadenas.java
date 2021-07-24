/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecadenas;
import java.util.Scanner;
/**
 *
 * @author benjas
 */
public class ClaseCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Operaciones con cadenas
        
        //Lectura

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena de caracteres");
        
        //String cadena = "Hola mundo";
        String cadena = sc.nextLine();
        System.out.println(cadena);
        //Otra forma de hacerlo es con un constructor de clase
        //String miCadena = new String("Hola mundo");
        
        //Ejemplo 1Cadenas -- Comparacion
        /*String a = new String("Hola");
        String b = "hola";
        String c = new String("Hola");*/
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        
        System.out.println (a.equals(b) +" " + "'a' es igual a 'b'? " +"\n");
        System.out.println (a.equals(c) + " " + "'a' es igual a 'c'" + "\n");
        System.out.println (a.equalsIgnoreCase(b)); //Ignora la sensibilidad de mayuscula        
        
        //Ejemplo 2 -- Operaciones de contenencia
        String d = "Hola Benjamin";
        String e = "Benjamin";
        System.out.println(d.contains(e));
        System.out.println(e.contains(d));
        System.out.println("¡"+b+ " "+a +"!");//Concantenación de cadenas
        
        //Longitud de cadenas
        String f;
        f = "Primer ejemplo";
        System.out.println(f.length());
        
        //Ejemplo 4 Cadenas - Extracción
        String g = "Hola Mile, I love";
        System.out.println(g.charAt(6));
        System.out.println(f.charAt(12));
        
        //Extraccion de rango de cadenas
        System.out.println(g.substring(5, f.length()));//Comienza en 5(incluido)
        
        //Split function
        String h;
        h = "Luis 28 1.68 Manizales hombre";
        
        String [] j = h.split(" "); //regex => caracter de separacion
        String name = j[0];
        int age = Integer.parseInt(j[1]); //Casteo de un string a entero
        double estatura = Double.parseDouble(j[2]);
        String city = j[3];
        String genre =  j[4];
        
        //Impresion
        System.out.println("Nombre: " +name);
        System.out.println("Edad: " +age);
    }
    
}
