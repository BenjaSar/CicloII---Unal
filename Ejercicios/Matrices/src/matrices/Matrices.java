/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author benjas
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    
    public static int [][] cuadrados_matriz(int [][] x){
   
        int [][] y = new int[x.length][x[0].length];
        
        for(int  i=0; i<x.length; i++){
            for(int j = 0; j<x[0].length; j++){
                y[i][j] = x[i][j]*x[i][j];
            }
        }
        
       return y; 
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] z =  new int [3][3];    
            z[0][0] = 1;
            z[0][1] = 2;       
            z[0][2] = 3;
            z[1][0] = 4;
            z[1][1] = 5;       
            z[1][2] = 6;
            z[2][0] = 7;
            z[2][1] = 8;       
            z[2][2] = 9;       
        
            System.out.print(cuadrados_matriz(z));
    }
}
