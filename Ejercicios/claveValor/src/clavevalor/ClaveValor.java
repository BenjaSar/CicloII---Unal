package clavevalor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author FS
 * 2021
 */
public class ClaveValor {
    //Desarrollar un algoritmo que verifique si todas las parejas clave:valor de un HashMap se encuentran en otro HashMap
    
    
    public static void main(String[] args) {
        //Declaracion del objeto tipo HashMap
        //Mapa 1
        HashMap<String, Integer> a = new HashMap<>();
        //Ingreso de valores
        a.put("precioArroz", 850);
        a.put("precioPanela", 950);
        a.put("precioFrijo", 1150);
        a.put("precioAzucar", 1050);
        a.put("precioSal", 750);
        a.put("precioPastas", 1000);
        
        //Mapa 2
        HashMap<String, Integer> b = new HashMap<>();
        b.put("precioArroz", 750);
        b.put("precioPanela", 950);
        b.put("precioFrijo", 1150);
        b.put("precioAzucar", 1050);
        b.put("precioSal", 750);
        b.put("precioPastas", 1000);
        
        //Algoritmo
       int contador=0;
       //Primera solucion
        if(a.size()<=b.size()){
            for(Map.Entry<String,Integer> i: a.entrySet()){
                for(Map.Entry<String,Integer> j: b.entrySet()){
                    if(i.getKey()==null?j.getKey()==null:i.getKey().equals(j.getKey())&& 
                            Objects.equals(i.getValue(), j.getValue())){
                        contador+=1;
                    }
                }
            }
            //Solución sin garantizar que las parejas son correctas
            /*for(Map.Entry<String, Integer> i: a.entrySet()){
                if(b.containsKey(i.getKey())&&b.containsValue(i.getValue())){
                    contador+=1;
                }
            }*/
            if(contador==a.size()){
                System.out.println("Todas las parejas ("+contador+") del"
                        + " HashMap A" +" " +"estan en el HashMap B");
            }
            else{
                System.out.println("No todas las parejas del HashMap A"
                    + " " +"estan en el HashMap B");
            }
        }    
        else{
            System.out.println("No todas las parejas del HashMap A"
                    + " estan en el HashMap B, porque el tamaño del "
                    + "HashMap A es más grande que el B");
        }
        
    }
    
}
