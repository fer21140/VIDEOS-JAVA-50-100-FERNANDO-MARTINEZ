//
package ventanaprueba;
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
        
        setSize(500,300);//Damos tamaño a la ventana
    
    }

}