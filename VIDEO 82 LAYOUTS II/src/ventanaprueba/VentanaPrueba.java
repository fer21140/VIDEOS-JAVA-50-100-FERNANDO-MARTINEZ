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
       miVentana.setTitle("POSICIONAMIENTO CON LAYOUTS");
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
        
        PanelLayout panel = new PanelLayout();
        PanelLayout2 panel2 = new PanelLayout2();
        
        add(panel,BorderLayout.NORTH);
        add(panel2,BorderLayout.SOUTH);
        
       
        
    }//Fin del constructor ventana
}//Fin de clase ventana



class PanelLayout extends JPanel{

    public PanelLayout(){
      
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JButton boton_amarillo = new JButton("Amarillo");
        JButton boton_rojo = new JButton("Rojo");
        
        
        
        add(boton_amarillo);
        add(boton_rojo);
        
    }
    
 
}

class PanelLayout2 extends JPanel{

    public PanelLayout2(){
    
        
        setLayout(new BorderLayout());
        
        JButton boton_azul = new JButton("Azul");
        JButton boton_verde = new JButton("Verde");
        JButton boton_gris = new JButton("Gris");
        
        add((boton_azul),BorderLayout.WEST);
        add((boton_verde),BorderLayout.EAST);
        add((boton_gris),BorderLayout.CENTER);
    
    }


}

