
package clavevalor;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author benjas
 */


public class treeMap {
    
    //Genericidad
    public void mezclaArboles(TreeMap<Double, String> a,
            TreeMap<Double, String>b){
        
        TreeMap<Double, String> arbol_gigante = new TreeMap<>();
        
        arbol_gigante.putAll(b);
        arbol_gigante.putAll(a);
        
        //Generacion del verdadero arbol
        
        TreeMap<Double, String> arbol = new TreeMap<>();
        for(Map.Entry<Double, String> i:arbol_gigante.entrySet()){
            double random = Math.floor(Math.random()*2);
                if(random == 0.0){
                    for(Map.Entry<Double, String> j:a.entrySet()){
                        arbol.put(j.getKey(), j.getValue());
                    }
                } 
                else{
                    for(Map.Entry<Double, String> j:b.entrySet()){
                        if(!arbol.equals(j.getKey())){
                            arbol.put(j.getKey(), j.getValue());
                        }else{
                            break;}
                    }
                
                }
        }
        
        System.out.println(arbol);
        
    }
    
    
    public static void main(String[] args) {
        
        //Instanciacion del objeto
        treeMap arbol = new treeMap();
        
        
        TreeMap<Double, String> a = new TreeMap<>();
        a.put(1.0, "Mision");
        a.put(2.0, "TIC");
        a.put(3.0, "2021");
        
        TreeMap<Double, String> b = new TreeMap<>();
        b.put(1.0, "Mision");
        b.put(2.0, "Mundo");
        b.put(3.0, "Adios");
        
        arbol.mezclaArboles(a, b);    
    }
}