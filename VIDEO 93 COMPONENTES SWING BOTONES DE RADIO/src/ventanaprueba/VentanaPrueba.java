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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class VentanaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       MarcoBotonRadio miVentana = new MarcoBotonRadio();
      
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       
    }
    
}

class MarcoBotonRadio extends JFrame{
    
    public MarcoBotonRadio(){
    
    setBounds(400,300,500,400);
    setTitle("RadioButtons");
    
    LaminaBotonRadio miLamina = new LaminaBotonRadio();
    
    add(miLamina);
       
}

}

class LaminaBotonRadio extends JPanel{
    
    public LaminaBotonRadio(){
    
        ButtonGroup miGrupo = new ButtonGroup();
        ButtonGroup miGrupo2 = new ButtonGroup();
        
        JRadioButton boton1 = new JRadioButton("Azul",false);
        JRadioButton boton2 = new JRadioButton("Rojo",true);
        JRadioButton boton3 = new JRadioButton("Verde",false);
        
        miGrupo.add(boton1);
        miGrupo.add(boton2);
        miGrupo.add(boton3);
        
        add(boton1);
        add(boton2);
        add(boton3);
    
        JRadioButton boton4 = new JRadioButton("Gris",false);
        JRadioButton boton5 = new JRadioButton("Violeta",false);
        JRadioButton boton6 = new JRadioButton("Rosado",false);
        
        miGrupo2.add(boton4);
        miGrupo2.add(boton5);
        miGrupo2.add(boton6);
        
        add(boton4);
        add(boton5);
        add(boton6);
        
    }


}