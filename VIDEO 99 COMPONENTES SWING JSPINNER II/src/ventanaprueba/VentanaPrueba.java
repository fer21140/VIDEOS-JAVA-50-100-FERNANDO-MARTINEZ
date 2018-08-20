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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class VentanaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       MarcoJspiner miVentana = new MarcoJspiner();
      
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       
    }
    
}

class MarcoJspiner extends JFrame{
    
    public MarcoJspiner(){
    
        setBounds(400,200,600,400);
        setTitle("JSpinner");
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
    
    
}

class Lamina extends JPanel{

    public Lamina(){
    
    //String lista[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();    
    
    
    
    JSpinner control = new JSpinner(new MiSpinner());//ValorTexto,limiteMenor,LimiteMayor,intervalo
    Dimension d = new Dimension (200,20);
    control.setPreferredSize(d);
    add(control);
       
    }
    
    private class MiSpinner extends SpinnerNumberModel{
    
        public MiSpinner(){
        
            super(5,0,10,1);
            
        }
    public Object getNextValue(){
    
    return super.getPreviousValue();
    }
    
    public Object getPreviousValue(){
    
        return super.getNextValue();
    
       }
    }

}

