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
        
        AccionColor accionAmarillo = new AccionColor("Amarillo",new ImageIcon("t.png"),Color.YELLOW);
        AccionColor accionAzul = new AccionColor("Azul",new ImageIcon("t.png"),Color.BLUE);
        AccionColor accionRojo = new AccionColor("Rojo",new ImageIcon("t.png"),Color.RED);
        
       
        
       
        
        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
        
        /*
        
        JButton botonAzul = new JButton("Azul");
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonRojo = new JButton("Rojo");
        
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        */
        
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        //KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl + A");
        
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"),"fondo amarillo");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo azul");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"),"fondo rojo");
        
        ActionMap mapaAccion = getActionMap();
       
        mapaAccion.put("fondo amarillo",accionAmarillo);
        mapaAccion.put("fondo azul", accionAzul);
        mapaAccion.put("fondo rojo", accionRojo);
        
       
        
        
        
       
        
       
        
    }
    
    public void paintComponent(Graphics e){
    
        super.paintComponent(e);
        e.drawString("CONTROL + A   = COLOR DE FONDO AMARILLO", 130, 100);
         e.drawString("CONTROL + B   = COLOR DE FONDO AZUL",130,120);
        e.drawString("CONTROL + R   = COLOR DE FONDO ROJO",130,140);
    }
    
private class AccionColor extends AbstractAction{
    
    public AccionColor(String nombre, Icon icono, Color colorBoton){
    
            putValue(Action.NAME,nombre);
            putValue(Action.SMALL_ICON,icono);
            putValue(Action.SHORT_DESCRIPTION,"Poner la lámina de color "+nombre);
            putValue("color_de_fondo",colorBoton);
    
    }
    
    public void actionPerformed(ActionEvent e){
    
        Color c = (Color)getValue("color_de_fondo");
        setBackground(c);
        System.out.println("Nombre: "+getValue(Action.NAME)+" Descripción: "+getValue(Action.SHORT_DESCRIPTION));
    }

}
}




