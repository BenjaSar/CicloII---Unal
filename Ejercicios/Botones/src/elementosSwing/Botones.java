
package elementosSwing;
import java.awt.event.*;
import javax.swing.*; //* Me permite importar todas las librerias

/**
 *
 * @author FS
 */
public class Botones extends JFrame implements ActionListener {
    //Implements indica que se está usando la interface
    //1. Se define una ventana (Botones extends jframe)
    //Atributos
    JButton boton1;
    
    //Constructor
    public Botones (){
        setLayout(null);
        boton1 = new JButton("Cerrar");
        boton1.setBounds(300, 250, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    //Metodos
    //Al implementar una interfaz se deben emplear si o si los métodos de la interfaz
    @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource() == boton1){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Botones boton = new Botones();
        boton.setBounds(100, 100, 500, 500);
        boton.setVisible(true);
        boton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
