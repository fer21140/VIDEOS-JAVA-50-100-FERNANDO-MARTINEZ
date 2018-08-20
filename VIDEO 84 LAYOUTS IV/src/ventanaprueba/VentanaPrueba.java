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
    
        principio = true;
        
        setLayout(new BorderLayout());
        
       pantalla = new JButton("0");
        
        pantalla.setEnabled(false);
        
        add(pantalla,BorderLayout.NORTH);
        
       
        
        miLamina2.setLayout(new GridLayout(4,4));
        
        ActionListener insertar = new InsertaNumero();
        ponerBoton("7",insertar);
        ponerBoton("8",insertar);
        ponerBoton("9",insertar);
        ponerBoton("/",insertar);
        ponerBoton("4",insertar);
        ponerBoton("5",insertar);
        ponerBoton("6",insertar);
        ponerBoton("*",insertar);
        ponerBoton("1",insertar);
        ponerBoton("2",insertar);
        ponerBoton("3",insertar);
        ponerBoton("-",insertar);
        ponerBoton("0",insertar);
        ponerBoton(".",insertar);
        ponerBoton("=",insertar);
        ponerBoton("+",insertar);
       
       
        add(miLamina2,BorderLayout.CENTER);
    }

    
    private void ponerBoton(String nombre, ActionListener e){
    
        JButton boton = new JButton(nombre);
        boton.addActionListener(e);
        miLamina2.add(boton);
    
    
    }
    
    private class InsertaNumero implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
          String entrada = ae.getActionCommand();
          
          if(principio){
          
              pantalla.setText("");
              principio = false;
          }
          
          pantalla.setText(pantalla.getText()+entrada);
        }
       
    }
    
    private JPanel miLamina2 = new JPanel();
     JButton pantalla;
     private boolean principio;
}