/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author FS
 */
public class Genericidad<B, X>  {
    //<B, X> --> Multiples parametros
    
    //Attributes
    protected B clave;
    protected X valor;
    
    //Constructor
    public Genericidad (B clave, X valor){
        this.clave = clave;
        this.valor = valor;
    }
    
    //Methods
    public B clave (){return clave;}
    public X valor (){return valor;}
    public String toString(){
         return "("+clave+","+valor+")";
    }
    
    public static void main(String[] args){
        Genericidad<Integer,String> a = new Genericidad<Integer,String>(20,"Pedro Páramo");
        System.out.println( a );
        Integer c = a.clave() + 10;
        System.out.println( c );
        System.out.println(a.valor().charAt(2));   
    }
}
