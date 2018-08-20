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
      
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       
    }
    
}

class MarcoCalculadora extends JFrame{

   public MarcoCalculadora(){
       
       setBounds(500,200,600,400);
       setTitle("Cuadros de texto");
       LaminaTexto lamina = new LaminaTexto();
       add(lamina);
   
   }
}

class LaminaTexto extends JPanel{

    public LaminaTexto(){
    
    JLabel texto1 = new JLabel("Email");
    add(texto1);
    campo1 = new JTextField(20);
    
    add(campo1);
    JButton miBoton = new JButton("Comprobar correo");
    DameTexto miEvento = new DameTexto();
    miBoton.addActionListener(miEvento);
    add(miBoton);
    
    }
    
    private class DameTexto implements ActionListener{

      
        public void actionPerformed(ActionEvent ae) {
            System.out.println(campo1.getText().trim());
        }
    
        
    
    }

    private JTextField campo1;
}

