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
public class Platon extends Carga{
    public Platon(int pasajeros, double velocidad, int peso) {
	super(pasajeros, velocidad, peso);
    }

    /**
     * Carries the given number, if possible
     * @param p Number to carry
     * @return <i>true</i> If the number can be carried, <i>false</i> otherwise
     */
    @Override
    public boolean llevar( int p) {
	boolean lolleva = super.llevar(p);
	if( lolleva ) {
	    String laCarga = this.carga.toString();
	    String cargaInvertida = "";
	    for(int i=laCarga.length()-1; i>=0; i--) {
		cargaInvertida += laCarga.charAt(i);  
	    }
	    this.carga = cargaInvertida;
	}
	return lolleva;
    }

    /**
     * Paints the vehicle at the given position
     * @param posicion Position used to print the vehicle
     */
    @Override
    public void pintar( int posicion ) {
	espacios(posicion+4);
	System.out.println("   __");
	espacios(posicion+1);
	String laCarga = this.carga.toString();
	int n = 5-laCarga.length();
	for( int i=0; i<n; i++ ) {
	    laCarga += '_';
	}
	System.out.println(laCarga+"|__\\___");
	espacios(posicion);
	System.out.println("|_   ___   __|");
	espacios(posicion);
	System.out.println("   O     O");
    }
}
