
package ciudad;

/**
 *
 * @author benjas
 */
public class Ciudad {

  //Atributos
    protected Vehiculo[] vehiculo;
    protected Sitio[] sitio;
    protected char [][] mapa;
  
    //Constructor
    public Ciudad( Vehiculo[]  vehiculo, Sitio [] sitio){
        this.vehiculo = vehiculo;
        this.sitio = sitio;
        
        mapa = new char[30][60];
        
        for(int i = 0; i<mapa.length; i++){
            for(int j = 0; j<mapa[i].length; j++){
                mapa[i][j] =  ' ';
            
            }
        
        }
    
    }
    
    
    //Metodos
    public void mover() {
	for( int i=0; i<vehiculo.length; i++ ) {
	    int f = (int)(Math.random()*3) - 1;
	    int c = 1;
	    vehiculo[i].mover(f, c);
	}
    }
    public void pintar() {
	for( int i=0; i<mapa.length; i++ ) {
	    for( int j=0; j<mapa[i].length; j++ ) {
		mapa[i][j] = ' ';
	    }
	}
        for( int i=0; i<sitio.length; i++ ) {
	    sitio[i].pintar(mapa);
	}
	for( int i=0; i<vehiculo.length; i++ ) {
	    vehiculo[i].pintar(mapa);
	}
	
	for( int i=0; i<mapa.length; i++ ) {
	    System.out.println();
	    for( int j=0; j<mapa[i].length; j++ ) {
		System.out.print(mapa[i][j]);
	    }
	}
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
