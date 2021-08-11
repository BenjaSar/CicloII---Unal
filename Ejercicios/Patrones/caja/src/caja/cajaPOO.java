package caja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benjas
 */
public class cajaPOO {
    
    //Attributes 
    //Variable del tipo object
    protected Object obj;
    
    //Constructor 
    public cajaPOO(Object obj){
        this.obj = obj;
    };
    
    //Methods
    public Object obtener(){ return obj; }
    
    public String decorar() {
        String s = obj.toString();
        String linea = "*";
        for( int i=0; i<s.length(); i++) linea += "*";
            linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
        }
        
    public static void main(String[] args){
        cajaPOO box = new cajaPOO("Caja Pandora");
        System.out.println(box.decorar());
        System.out.println(box.obtener());
    }
    
}

