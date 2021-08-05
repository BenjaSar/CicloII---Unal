/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;

/**
 *
 * @author FS
 */
public class Posicion{
    //Atributos
    public int fila;
    public int columna;
    
    //Constructor
    public Posicion(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
    }
    
    //Metodos
      public void cambiar( int cambio_fila, int cambio_columna ) { 
	this.fila += cambio_fila;
	this.columna += cambio_columna;
    }
    
    
}
