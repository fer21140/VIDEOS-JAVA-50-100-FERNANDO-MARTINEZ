//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.Frame;
import javax.swing.*;

public class VentanaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ventana miVentana = new ventana();
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
        
    }
    
}

class ventana extends JFrame{

    public ventana(){
        
        
        setBounds(450,200,550,350);//Tamaño en eje x,y    y tamaño de ventana x,y
        //setResizable(false); //hace la ventana no editable en tamaño
        //setExtendedState(Frame.MAXIMIZED_BOTH);//Abarca el total del tamaño máximo
        setTitle("Título de mi ventana");
        
    
    }

}