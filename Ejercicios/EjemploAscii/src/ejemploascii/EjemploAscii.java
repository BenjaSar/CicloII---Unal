package ejemploascii;

import java.util.Scanner;


/**
 *
 * @author FS 
 */
public class EjemploAscii {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un caracter ");
        //con charA(0) tomamos la posicion 0 de la entrada por teclado
        //Convertir caracter a ascii
        char c = sc.next().charAt(0);
        
        int ascii = (int)c;
        
        double asc = (double) ascii;
        
        System.out.println("El caracter: " +c+ "tiene el siguiente codigo" +ascii);
        
        //Convertir ascii a caracter
        System.out.println("Por favor ingrese el código ASCII");
        
        int codigo = sc.nextInt();
        char caracter = (char)codigo;
        
        System.out.println("El código ASCII" +codigo+ "equivale" +caracter);
        
    }
    
}
