
package ciudad;
import ciudad.Posicion;

/**
 *
 * @author FS
 */
//Clase padre (abstract)
public abstract class Cosa {
    //Atributos
    protected Posicion posicion;
    protected String[] imagen;
    
    //Constructor
    public Cosa(Posicion posicion){
    //Inicializar variables
    this.posicion = posicion;
    };
    
    //Metodos
    public Posicion posicion(){ return posicion;}
    
    public void pintar( char[][] mapa ) {
	for( int i=0; i<imagen.length; i++) {
	    for( int j=0; j<imagen[i].length(); j++) {
		int f = (this.posicion.fila+i+mapa.length)%mapa.length;
		int c = (this.posicion.columna+j+mapa[i].length)%mapa[i].length; 
		mapa[f][c] = imagen[i].charAt(j);
	    }
	}
    }    
}
