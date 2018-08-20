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
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;


import javax.swing.*;

public class VentanaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Ventana miVentana = new Ventana();
       miVentana.setTitle("MULTIPLES OYENTES");
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
      
       
        
        JButton nuevaVentana = new JButton("Nueva Ventana");
         cerrarVentanas= new JButton("Cerrar todas");
       
        add(nuevaVentana);
        add(cerrarVentanas);
        
        Oyente botonOyente = new Oyente();
        nuevaVentana.addActionListener(botonOyente);
         
        
    }
    
    private class Oyente implements ActionListener{
        
        
        public void actionPerformed(ActionEvent ae) {
         
            NuevaVentana ventana = new NuevaVentana(cerrarVentanas);
            ventana.setVisible(true);
            
        }
    

    }
    
        
    JButton cerrarVentanas;
}

class NuevaVentana extends JFrame{

    public NuevaVentana(JButton boton_de_principal){
    
       contador++;
       
       setTitle("Ventana No."+contador);
       setBounds(40*contador,40*contador,300,150);
       
       CierraTodo cerrar = new CierraTodo();
       boton_de_principal.addActionListener(cerrar);
    }

    private static int contador=0;

   

    
    private class CierraTodo implements ActionListener{
    
    
    public void actionPerformed(ActionEvent e){
    
    
        dispose();
    
    }
    
    }
}


