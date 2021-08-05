/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author benjas
 */
public class Persona {
    
    //Atributos
    public String nombre;
    public int edad;
    public String genero;
    public float peso;
    public float altura;
    
    //Inicializamos a través del constructor
    Persona(String nombre, int edad, String genero, float peso, float altura){
        this.nombre = nombre;
        this.edad = edad;
        //Validacion de entradas
        if(genero.equalsIgnoreCase("hombre")){
            this.genero = "H";
        }else if(genero.equalsIgnoreCase("mujer")){
            this.genero = "M";
        }else{
            this.genero = genero;
        } 
        this.peso = peso;
        this.altura = altura;
    }
    
    
    //Metodos
    
    public float calcularIMC(){
        float imc = this.peso/ (this.altura * this.altura);
        return imc;
    }
    
    public boolean esMayorDeEdad(){
        boolean esMayor = true;
        
        if(this.edad <18){
            esMayor = false;
        }
    return esMayor;
    }
    
    
    public String toCadena(){
        String cadena = this.toString();
    return cadena;
    }

    public static void main(String[] args) {
        //Definicion del objeto
        Persona personaUno = new Persona("Benjamin", 9, "hombre", 54.4f, 1.25f);
        Persona personaDos = new Persona("Milena", 48, "mujer", 70.5f, 1.65f);
         //Accediendo al método IMC
        System.out.println(personaUno.calcularIMC());
        System.out.println(personaDos.calcularIMC());
        
        //Accediendo al método si edadEsMayor
        System.out.println(personaUno.esMayorDeEdad());
        System.out.println(personaDos.esMayorDeEdad());
        
        //Accediendo al método toString
        System.out.println(personaUno.toCadena());
    }
    
}
