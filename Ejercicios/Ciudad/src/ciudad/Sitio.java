/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;
import ciudad.Posicion;

/**
 *
 * @author benjas
 */
public class Sitio extends Cosa {
    //Metodos
    public Sitio (Posicion posicion){
        super(posicion);
        imagen = new String[] {
	    "     __________",	
	    "    /          \\",	
	    "   /            \\",	
	    "   |            |",	
	    "   |            |",	
	    "   |____________|"	
	};
    }
}
