
package listascolecciones;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author FS
 */
public class Arbol {
    public static void main(String[] args){
    // Creacion del TreeMap
        TreeMap<Integer, String> mapa= new TreeMap<Integer, String>();
        // Agregar elementos
        mapa.put(3, "MisionTIC");
        mapa.put(2, "estudiantes");
        mapa.put(1, "hola");
        for (Map.Entry pareja : mapa.entrySet()) {
            int clave = (int)pareja.getKey();
            String valor = (String)pareja.getValue();
            System.out.println(clave + " : " + valor);
            }
        }
}
