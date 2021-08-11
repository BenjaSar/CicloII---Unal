/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author benjas
 */
public class Caja {
    
    //polimorfismo o sbrecarga.: Varios métodos con el mismo nombre
    /*public String decorar( int n ) {
        //Casteo de numero a string
        String s = ""+n;
        String linea = "*";
        for( int i=0; i<s.length(); i++) {
             linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
    
    
    public String decorar( double x ) {
        String s = ""+x;
        String linea = "*";
        for( int i=0; i<s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
        }
    
    public String decorar( String s ) {
        String linea = "*";
        for( int i=0; i<s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
        }
    */
   //Con variables del tipo Object
    //Object al asignarle el tipo de dato, el objecto se convierte a ese tipo
public String decorar( Object obj ) {
        String s = obj.toString(); //Casteo a string
        String linea = "*";
        for( int i=0; i<s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja caja = new Caja();
        String s = caja.decorar(10);
        System.out.println(s);
        System.out.println(caja.decorar(10)+ "\n" + caja.decorar("hola"));
    }
    
}
