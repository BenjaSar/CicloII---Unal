/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;
import ciudad.Ciudad;
import ciudad.Posicion;
import ciudad.Sitio;
import ciudad.Automovil;
import ciudad.Carga;
import ciudad.Furgon;
import ciudad.Platon;
import ciudad.Vehiculo;

/**
 *
 * @author FS
 */
public class Principal {
    
    public static void pausar() {
	    try {
		Thread.sleep(100);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }	
    }
    
    public static void main(String[] args) {
	Automovil automovil = new Automovil( new Posicion(5, 10), 5);
	//Deportivo deportivo = new Deportivo( new Posicion(15, 40), 5);
	Platon camioneta = new Platon( new Posicion(20, 2), 3, 4);
	camioneta.llevar(1234);
	Furgon furgon = new Furgon( new Posicion(2, 50), 3, 4);
	furgon.llevar("AA");
	
	Vehiculo[] vehiculo = new Vehiculo[4];
	vehiculo[0] = automovil;
	vehiculo[1] = camioneta;
	//vehiculo[2] = deportivo;
	vehiculo[2] = furgon;
Sitio[] sitio = new Sitio[2];
	for( int i=0; i<2; i++ ) {
	    int f = (int)(Math.random()*20) + 2;
	    int c = (int)(Math.random()*45) + 1;
	    sitio[i] = new Sitio( new Posicion(f,c) );
	}

	Ciudad ciudad = new Ciudad(vehiculo, sitio);
	for( int i=0; i<10; i++) {
	    ciudad.mover();
	    ciudad.pintar();
	    System.out.println();
	    System.out.print("**************************************************");
	    pausar();
	}
    }    
}
