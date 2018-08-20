//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
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
       miVentana.setTitle("CONTROLANDO EVENTOS DEL MOUSE, POSICIONAMIENTO");
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
       addMouseMotionListener(mouse);//detector de movimiento del mouse impreso en consola
       addMouseListener(mouse);//Oyente clic izquierdo, derecho y bolita del raton
        
    }//Fin del constructor ventana
}//Fin de clase ventana


 
class Lamina extends JPanel{

    public void paintComponent(Graphics e){
      
        e.setColor(Color.BLUE);
       
        e.drawString("HAZ CLICK IZQUIERDO, DERECHO O CON LA BOLITA DEL MOUSE", 50, 100);
        
    }


}

class EventoMouse extends MouseAdapter implements MouseMotionListener{

  
    public void mousePressed(MouseEvent e){
        if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
        
            JOptionPane.showMessageDialog(null,"Coordenada X: "+e.getX()+ " Coordenada Y: "+e.getY()+" Boton izquierdo");
        }
        
        if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
        JOptionPane.showMessageDialog(null,"Coordenada X: "+e.getX()+ " Coordenada Y: "+e.getY()+" Rueda del mouse");
        }
        
        if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
        
            JOptionPane.showMessageDialog(null,"Coordenada X: "+e.getX()+ " Coordenada Y: "+e.getY()+" Boton derecho");
           
        }
        
      }
    
    public void mouseMoved(MouseEvent arg0){
    
    System.out.println("Te estas moviendo");
    }
    
    /*
    public void mouseDragged(MouseEvent arg0){
    
     System.out.println("Estas arrastrando"); //Para verificar si esta arrastrando el indicador
    
    }
      */
    
    boolean validador_click_arrastre = false;
}


