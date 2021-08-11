
package elementosSwing;
import java.awt.event.*;
import javax.swing.*; //* Me permite importar todas las librerias

/**
 *
 * @author FS
 */
public class Tablas extends JFrame{
    
    //Constructor sin atributos
    public Tablas(){
        setTitle("Tabla de medallería juegos olímpicos Tokio 2020");
        //Encabezdo
        String [] encabezados = {"País", "Oro", "Plata", "Bronce"};
        String [][] datos = {
            {"China", "29", "17", "16"},
            {"EEUU", "22", "25", "17"},
            {"Japón", "17", "6", "10"},
            {"UK", "15", "8", "15"}    
        };
        
        JTable table = new JTable(datos, encabezados);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
        pack();
        table.setEnabled(false);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Tablas();
    
    }
}
