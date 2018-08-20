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
    
        setBounds(400,200,600,400);
        setTitle("RadioButtons II");
        Lamina miLamina = new Lamina();
        add(miLamina);
    }

}

class Lamina extends JPanel{

    public Lamina(){
    
        setLayout(new BorderLayout());
        texto=new JLabel("Tres tristes tigres comen trigo en un trigal");
        
        laminaBotones = new JPanel();
        migrupo = new ButtonGroup();
        
        add(texto,BorderLayout.CENTER);
    
        CrearBotones("Pequeño",false,12);
        CrearBotones("Mediano",true,15);
        CrearBotones("Grande",false,19);
        CrearBotones("Muy Grande",false,24);
        
        add(laminaBotones,BorderLayout.SOUTH);
        
        /*
        ButtonGroup grupo = new ButtonGroup();
        
        boton1= new JRadioButton("Pequeño",false);
        boton2= new JRadioButton("Mediano",true);
        boton3= new JRadioButton("Grande",false);
        boton4= new JRadioButton("Muy grande",false);
    
        JPanel laminaRadio = new JPanel();
        
        eventosRadio miEvento = new eventosRadio();
        
        boton1.addActionListener(miEvento);
        boton2.addActionListener(miEvento);
        boton3.addActionListener(miEvento);
        boton4.addActionListener(miEvento);
        
        grupo.add(boton1);
        grupo.add(boton2);
        grupo.add(boton3);
        grupo.add(boton4);
        
        laminaRadio.add(boton1);
        laminaRadio.add(boton2);
        laminaRadio.add(boton3);
        laminaRadio.add(boton4);
        
        add(laminaRadio,BorderLayout.SOUTH);
        
    }
    
    private class eventosRadio implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
        
           if(e.getSource()==boton1){
               texto.setFont(new Font("Arial",Font.PLAIN,10));
           }
           
           if(e.getSource()==boton2){
           
               texto.setFont(new Font("Arial",Font.PLAIN,12));
           
           }
           
           if(e.getSource()==boton3){
               
               texto.setFont(new Font("Arial",Font.PLAIN,18));
           
           }
           
           if(e.getSource()==boton4){
               texto.setFont(new Font("Arial",Font.PLAIN,24));
           }
        }
    */
    
    }
    
        
    public void CrearBotones(String nombre, boolean seleccionado,final int tamano){
      
       JRadioButton boton = new JRadioButton(nombre,seleccionado);
       migrupo.add(boton);
       laminaBotones.add(boton);
       ActionListener miEvento;
        miEvento = new ActionListener(){
            
            public void actionPerformed(ActionEvent ae) {
              texto.setFont(new Font("Arial",Font.PLAIN,tamano));
            }
            
        };
        
        boton.addActionListener(miEvento);
    
     }   
        
    private JLabel texto;
    private JRadioButton boton1,boton2,boton3,boton4;
    private ButtonGroup migrupo;
    private JPanel laminaBotones;

}