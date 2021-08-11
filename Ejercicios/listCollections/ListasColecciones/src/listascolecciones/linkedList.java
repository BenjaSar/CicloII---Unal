
package listascolecciones;

import java.util.LinkedList;

/**
 *
 * @author benjas
 */
public class linkedList {
    public static void main(String[] args){
    //LinkedList
    //Definicion
    LinkedList<String> listLinked = new LinkedList<String>();
    
    //Agregar
    listLinked.add("A");
    listLinked.add("B");
    listLinked.add("A");
    listLinked.add("C");
    listLinked.add("A");
    listLinked.addLast("D");
    listLinked.add(2, "E");
    
    System.out.println("Lista1: " +listLinked);
    
    //Modificadores
    listLinked.set(1, "a");
    System.out.println(listLinked);
    for(int i=0; i<listLinked.size(); i++)
      System.out.print(listLinked.get(i) + " ");
        System.out.println();
    
     //Eliminar
    listLinked.remove("B");
    listLinked.remove(3);
    listLinked.removeFirst();
    listLinked.removeLast();
    System.out.println("Lista final: " + listLinked);
    
    //Un vector es para trabajo sincronico 
        
        
    }
}
