/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author benjas
 */
public class Carga extends Vehiculo {
    protected int capacidad;
    
    protected Object carga;
    
    
    
    public Carga(int pasajeros, double velocidad, int peso){
        super(pasajeros, velocidad);
        this.capacidad = peso >5?5:peso;
        this.carga = "___ ";
    }
    
    /**
    * Paints the vehicle at the given position
    * @param posicion Position used to print the vehicle
    */
    @Override
    //Se invoca el método pintar porque los hijos van a usar el método
    public void pintar(int posicion) {}
    
    //TODO: Ver modificadores, entre ellos final/sellar.

    /**
     * Carries the given number, if possible
     * @param p Number to carry
     * @return <i>true</i> If the number can be carried, <i>false</i> otherwise
     */
    public boolean llevar( int p) {
	int k = 1;
	for( int i=0; i<this.capacidad; i++) {
	    k *=10;
	}
	if( p < k ) {
	    this.carga = p;
	    return true;
	}else {
	    return false;
	}
    }

    /**
     * Carries the given string, if possible
     * @param p Number to carry
     * @return <i>true</i> If the string can be carried, <i>false</i> otherwise
     */    
    public boolean llevar( String p) {
	if( p.length() <= this.capacidad ) {
	    this.carga = p;
	    return true;
	}else {
	    return false;
	}
    }
    
};
