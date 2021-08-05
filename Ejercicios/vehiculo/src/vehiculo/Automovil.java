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

//Con la palabra reservada extends indicamos que es una clase heredada
public class Automovil extends Vehiculo {
    
    //Constructor: Se asume el contructor del padre
    public Automovil(int pasajeros, double velocidad){
        //Con la palabra reservada super, ya inicializamos los valores heredados
        super(pasajeros, velocidad);
    }
    
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
