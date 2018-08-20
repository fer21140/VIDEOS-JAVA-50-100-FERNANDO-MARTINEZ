//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;


import javax.swing.*;

public class VentanaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Ventana miVentana = new Ventana();
       miVentana.setTitle("CONTROLANDO EVENTOS DEL TECLADO");
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       
    }
    
}

class Ventana extends JFrame{

    public Ventana(){
        
        setBounds(50,100,600,400);
        /*
        MiVentana ventanaOyente = new MiVentana();
        addWindowListener(ventanaOyente);
        */
        
        
        Lamina texto = new Lamina();
        
        add(texto);
        
       EventoMouse mouse = new EventoMouse();
       addMouseListener(mouse);
        
    }//Fin del constructor ventana
}//Fin de clase ventana


 
class Lamina extends JPanel{

    public void paintComponent(Graphics e){
      
        e.setColor(Color.BLUE);
       
        e.drawString("HAZ CLICK O DOBLE CLICK", 50, 100);
        
    }


}

class EventoMouse implements MouseListener{

  
    public void mouseClicked(MouseEvent me) {
        JOptionPane.showMessageDialog(null, "Haz hecho clic");
        System.out.println("Has hecho click");  
    }

   
    public void mousePressed(MouseEvent me) {
        JOptionPane.showMessageDialog(null, "Haz presionado el boton izquierdo del mouse");
        System.out.println("Haz presionado el boton izquierdo del mouse");
    }

    
    public void mouseReleased(MouseEvent me) {
        JOptionPane.showMessageDialog(null, "Haz soltado el boton izquierdo del mouse");
        System.out.println("Haz soltado el boton izquierdo del mouse");
    }

    
    public void mouseEntered(MouseEvent me) {
        
    }

    
    public void mouseExited(MouseEvent me) {
        
    }
    
    
   
    
}


