/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro;

/**
 *
 * @author benjas
 */
public class Perro {
    
    //Atributos de la clase
    public int edad;
    public String nombre;
    public String colorOjos;
    
    //Constructor
    Perro(int edad, String nombre, String colorOjos){
    //En programación se recomienda tener varios constructores
    
    //Acceso al objeto
    
    this.edad = edad;
    this.nombre = nombre;
    this.colorOjos = colorOjos;
     
    }
    
    //En caso tal de no recibir parámetros
    Perro(){
        edad = 1;
        nombre = "anonimo";
        colorOjos = "defecto";
        
    }
    
    public void ladrar(){
        System.out.println("gua gua");
    }
    
    public void saludar(){
        System.out.println("Hi, my names is: " +nombre);
    }
    
    public void quienEsMayor(Perro otroPerro){
        
        if(this.edad > otroPerro.edad){
        
            System.out.println("Soy mayor que:" +otroPerro.nombre);
        }else if(this.edad == otroPerro.edad){
        
            System.out.println("Tenemos la misma edad");
        }else {
            System.out.println(otroPerro.nombre+""+"es mayor");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perroUno = new Perro(2, "Toby", "negro");
        //Perro perroDos = new Perro();   
        Perro perroDos = new Perro(5, "Hanna", "cafes");
        Perro perroTres = new Perro(8, "Bethoven", "verdes");
        
        System.out.println(perroUno.edad);
        perroUno.saludar();
        perroUno.quienEsMayor(perroTres);
        perroDos.quienEsMayor(perroUno);
        perroUno.quienEsMayor(perroDos);
        
    }
    
}
