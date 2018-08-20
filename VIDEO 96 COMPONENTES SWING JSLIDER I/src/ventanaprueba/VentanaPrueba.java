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
        
       MarcoJslider miVentana = new MarcoJslider();
      
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       
    }
    
}

class MarcoJslider extends JFrame{
    
    public MarcoJslider(){
    
        setBounds(400,200,600,400);
        setTitle("JSlider");
        Lamina miLamina = new Lamina();
        add(miLamina);
    }

}

class Lamina extends JPanel{

    public Lamina(){
    
        JSlider miJslider = new JSlider(0,100,25);//inicio,fin,intervalo
        miJslider.setMajorTickSpacing(50);//lineas mayores
        miJslider.setMinorTickSpacing(25);//rango menor
        miJslider.setPaintTicks(true);//Habilitar la pintura de los intervalos
        miJslider.setPaintLabels(true);//pintar los numeros
        miJslider.setSnapToTicks(true);
        miJslider.setFont(new Font("Arial",Font.ITALIC,10));
        add(miJslider);
    
    }

}

