//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
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
       miVentana.setTitle("FOCO");
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
        
        PanelAccion panel = new PanelAccion();
        add(panel);
 
        
       
        
    }//Fin del constructor ventana
}//Fin de clase ventana



class PanelAccion extends JPanel{

    public PanelAccion(){
    
        JButton botonAzul = new JButton("Azul");
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonRojo = new JButton("Rojo");
        
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        
        
    }

}

class AccionColor extends AbstractAction{

    public void actionPerformed(ActionEvent e){
    
    
    }

}


