/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author FS
 */

//Abstract: Se usa para indicar superclase o clase padre
public abstract class Vehiculo {
    //1. Definir atributos
    protected double velocidad;
    protected int pasajeros;
    
    //2. Definir constructor
    public Vehiculo(int pasajeros, double velocidad){
    
        this.velocidad = velocidad;
        this.pasajeros = pasajeros;
    }
    
    //3. Métodos de la clase
    public int posicion(int tiempo){
        return (int)(tiempo*velocidad);
    };
    
    
    public void espacios(int espacios){
        for(int i=0; i<espacios; i++){
            System.out.println(" ");
        }        
    };
    
    /*
    El siguiente metodo es solo una plantilla
    */
    public abstract void pintar(int posicion);   //El hijo define como va a funcionar el metodo 

    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
