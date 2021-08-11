
package listascolecciones;
import java.util.Vector;

/**
 *
 * @author FS
 */
public class EVector {
    public static void main(String[] args){
    //Funcionamiento sincronico, --> Se emplea un vector. No permite multiples procesos de acceso al vector.
    //Vector
    //Declaracion
    Vector vector = new Vector(); //Instanciacion del vector
     //Agregar
    vector.add(1);
    vector.add("Misión");
    vector.add(true);
    vector.add("Tic");
    vector.add(2.0);
    System.out.println("Vector 1: "+vector);
    
    //Modificadores
    vector.set(0, 2021);
    System.out.println("Vector 2: "+vector);
    
    //Eliminar valores
    vector.remove(4);
    System.out.println("Vector 3: "+vector);
    
    //Ciclo por iteraciones. El objeto es el único que puede heredar los tipos de datos por jerarquías
    for (Object iterador: vector)
        System.out.print("Ciclo por iteraciones:"+iterador + " ; ");
    
    
    }
}
