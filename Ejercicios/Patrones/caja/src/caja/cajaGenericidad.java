/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author benjas
 */
public class cajaGenericidad<B> {
    //Attributes
    //Asignacion del tipo de dato indicado en <>
    protected B obj; 
    
    //Constructor
    public cajaGenericidad(B obj){
        this.obj = obj;
    };
    
    //Methods
    public B obtener(){return obj;}
    public String decorar() {
        String s = obj.toString();
        String linea = "*";
        for( int i=0; i<s.length(); i++){
            linea += "*";
        }
        linea += "*";
    return linea + "\n*" + s + "*\n" + linea;
    }
    
    public static void main(String[] args){
        cajaGenericidad <String> box = new cajaGenericidad<String>("Caja Pandora");
        //Object <tipodeDato> nameObject =  new Object<DataType>(Variable)
        System.out.println(box.decorar());
        
        char c = box.obtener().charAt(5);
        System.out.println(c);
        
        cajaGenericidad <Double> box1 = new cajaGenericidad<Double>(60.25);
        double y = box1.obtener() + 20.0;
        System.out.println(y);
        
    
    }
    
    
}
/*
Genericidad <>: Interfaz o clase genérica.
Las interfaces solo dejan definidos los métodos para ser desarrollados por las clases que les utilizan
Cuando una clase usa una interfaz, emplea la palabra clave implement
Desde una clase se pueden heredar más de una interfaz.
Las interfaces se pueden heredar una a otra. Uso de la palabra reservada extend

*/