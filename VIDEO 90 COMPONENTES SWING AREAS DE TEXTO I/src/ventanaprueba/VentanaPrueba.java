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
        
       MarcoPrueba miVentana = new MarcoPrueba();
      
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       
    }
    
}

class MarcoPrueba extends JFrame{

   public MarcoPrueba(){
       
       setBounds(500,200,600,400);
       setTitle("Areas de texto");
       LaminaArea lamina = new LaminaArea();
       add(lamina);
   
   }
}

class LaminaArea extends JPanel{

    public LaminaArea(){
    
     miArea = new JTextArea(8,20);
     JScrollPane miPanel = new JScrollPane(miArea);
     miArea.setLineWrap(true);
     add(miPanel);
    
     JButton miBoton = new JButton("Imprimir en consola");
     add(miBoton);
     miBoton.addActionListener(new GestionArea());
  }

     private class GestionArea implements ActionListener{

        
        public void actionPerformed(ActionEvent ae) {
           System.out.println(miArea.getText()); 
        }
     
     }
     
     private JTextArea miArea;
}