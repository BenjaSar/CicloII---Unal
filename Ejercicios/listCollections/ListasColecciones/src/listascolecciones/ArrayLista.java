
package listascolecciones;
import java.util.ArrayList;

/**
 *
 * @author benjas
 */
public class ArrayLista {
    
    public static void main(String[] args){
    //Lista de enteros
    ArrayList<Integer> lista = new ArrayList<Integer>();
    //Metodo agregar
    for(int i = 1; i<=10; i++)lista.add(i);
    System.out.println(lista);
    
    //Remove
    lista.remove(5);
    System.out.println(lista);
    for(int i = 0; i<lista.size( );i++)
        System.out.print(lista.get(i) + " ");
    System.out.println();
    
    for(Integer iterador:lista)
        System.out.println(iterador + " ");
    }

}
