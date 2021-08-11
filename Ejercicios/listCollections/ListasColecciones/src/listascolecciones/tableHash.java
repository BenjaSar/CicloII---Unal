/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listascolecciones;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author benjas
 */
public class tableHash  {
    public static void main(String[] args){
        //Instanciacion del objeto de tipo HashMap(el cual hereda de Map)
        HashMap<String, Double> mapa  = new HashMap<>();
        mapa.put("nota1", 3.2);
        mapa.put("nota2", 4.5);
        mapa.put("nota3", 1.1);
        
        System.out.println("Tamaño:" +mapa.size());
        System.out.println("HashMap:" +mapa);
        
        //entrySet genera una colección iterable
        // verificacion de llave y extraccion de valor
        if (mapa.containsKey("nota2")) {
            Double valor = mapa.get("nota2");
            System.out.println("nota 2 == " + valor);
        }
        mapa.remove("nota1");
        System.out.println("HashMapFinal:");
        // recorrer HashMap por llave y clave
        for (Map.Entry<String, Double> elem : mapa.entrySet())
            System.out.println(elem.getKey() + " : " + elem.getValue());
        }
    
}
