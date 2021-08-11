/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementosSwing;
import java.awt.event.*;
import javax.swing.*; //* Me permite importar todas las librerias


/**
 *
 * @author benjas
 */
public class botones2 extends JFrame implements ActionListener {
    
    //Atributos
    private JButton boton1, boton2, boton3;
    
    //Constructo
    public botones2(){
        setLayout(null);
        boton1 = new JButton("Uno");
        boton1.setBounds(10, 100, 90, 40);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2 = new JButton("Dos");
        boton2.setBounds(110, 100, 90, 40);
        add(boton2);
        boton2.addActionListener(this);
        
        boton3 = new JButton("Tres");
        boton3.setBounds(210, 100, 90, 40);
        add(boton3);
        boton3.addActionListener(this);
    }
    
    //Metodos
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            setTitle("Es el uno");
        }
        else if(e.getSource() == boton2){
            setTitle("Es el dos");
        }
        else if(e.getSource() == boton3){
            setTitle("Es el tres");
        }
    }
    
    public static void main(String[] args) {
    
        botones2 botones = new botones2();
        botones.setBounds(0, 0, 350, 200);
        botones.setVisible(true);
        botones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
