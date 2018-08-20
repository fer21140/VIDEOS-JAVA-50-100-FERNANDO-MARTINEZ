//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


import javax.swing.*;

public class VentanaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Ventana miVentana = new Ventana();
       miVentana.setTitle("Ventana No.1");
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       Ventana miVentana2 = new Ventana();
       
       miVentana2.setBounds(700,100,600,400);
       miVentana2.setTitle("Ventana No.2");
       miVentana2.setVisible(true);
       miVentana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}

class Ventana extends JFrame{

    public Ventana(){
        
        setBounds(50,100,600,400);
        
        MiVentana ventanaOyente = new MiVentana();
        addWindowListener(ventanaOyente);
        
    }//Fin del constructor ventana
}//Fin de clase ventana

class MiVentana implements WindowListener{

  
    public void windowOpened(WindowEvent we) {
    System.out.println("Ventana abierta");
    }

    public void windowClosing(WindowEvent we) {
    System.out.println("Cerrando ventana");
    }

    public void windowClosed(WindowEvent we) {
    System.out.println("La ventana fue cerrada");
    }

    public void windowIconified(WindowEvent we) {
    System.out.println("Ventana minimizada");
    }

    public void windowDeiconified(WindowEvent we) {
    System.out.println("Ventana restaurada");
    }

    public void windowActivated(WindowEvent we) {
    System.out.println("Ventana activada");
    }

    public void windowDeactivated(WindowEvent we) {
    System.out.println("Ventana desactivada");
    }

}


