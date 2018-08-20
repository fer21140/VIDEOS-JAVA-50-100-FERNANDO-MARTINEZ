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
        
       MarcoCalculadora miVentana = new MarcoCalculadora();
       miVentana.setTitle("Calculadora");
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       
    }
    
}

class MarcoCalculadora extends JFrame{

    public MarcoCalculadora(){
    
        setTitle("Calculadora");
        setBounds(500,300,450,300);
        
        LaminaCalculadora miLamina = new LaminaCalculadora();
        add(miLamina);
    }

}

class LaminaCalculadora extends JPanel{

    public LaminaCalculadora(){
    
        setLayout(new BorderLayout());
        
        JButton pantalla = new JButton("0");
        
        pantalla.setEnabled(false);
        
        add(pantalla,BorderLayout.NORTH);
        
        JPanel miLamina2 = new JPanel();
        
        miLamina2.setLayout(new GridLayout(4,4));
        
        JButton boton1 = new JButton("7");
        miLamina2.add(boton1);
        
        JButton boton2 = new JButton("8");
        miLamina2.add(boton2);
        
        JButton boton3 = new JButton("9");
        miLamina2.add(boton3);
        
        JButton boton4 = new JButton("/");
        miLamina2.add(boton4);
        
        JButton boton5 = new JButton("4");
        miLamina2.add(boton5);
        
        JButton boton6 = new JButton("5");
        miLamina2.add(boton6);
        
        JButton boton7 = new JButton("6");
        miLamina2.add(boton7);
        
        JButton boton8 = new JButton("*");
        miLamina2.add(boton8);
        
        JButton boton9 = new JButton("1");
        miLamina2.add(boton9);
        
        JButton boton10 = new JButton("2");
        miLamina2.add(boton10);
        
        JButton boton11 = new JButton("3");
        miLamina2.add(boton11);
        
        JButton boton12 = new JButton("-");
        miLamina2.add(boton12);
        
        JButton boton13 = new JButton("0");
        miLamina2.add(boton13);
        
        JButton boton14 = new JButton(".");
        miLamina2.add(boton14);
        
        JButton boton15 = new JButton("=");
        miLamina2.add(boton15);
        
        JButton boton16 = new JButton("+");
        miLamina2.add(boton16);
    
        
        add(miLamina2,BorderLayout.CENTER);
    }

}