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
public class Deportivo extends Vehiculo {
    public Deportivo(int pasajeros, double velocidad){
        super(pasajeros, velocidad);
    };
        
    
    //Metodos de nuestra clase Automovil
    
    @Override
    public void pintar(int posicion){
        espacios(posicion+4);
	System.out.println("_____");
	espacios(posicion+1);
	System.out.println("__/__|__\\___");
	espacios(posicion);
	System.out.println("|_  _____  __|");
	espacios(posicion);
	System.out.println("   O      O");
    };
}
