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
        
       MarcoJslider miVentana = new MarcoJslider();
      
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       
    }
    
}

class MarcoJslider extends JFrame{
    
    public MarcoJslider(){
    
        setBounds(400,200,600,400);
        setTitle("JSlider II");
        Lamina miLamina = new Lamina();
        add(miLamina);
    }

}

class Lamina extends JPanel{

    public Lamina(){
        setLayout(new BorderLayout());
        texto = new JLabel("Dios es la única solución a nuestros problemas");
        barra = new JSlider(0,100,10);
        
        add(texto,BorderLayout.CENTER);
        
       barra = new JSlider(0,100,8);
       barra.setMajorTickSpacing(10);
       barra.setMinorTickSpacing(5);
       barra.setPaintTicks(true);
       barra.setPaintLabels(true);
       
       barra.setFont(new Font("Arial",Font.ITALIC,10));
       
       barra.addChangeListener(new AccionBarra());//Ponemos a la escucha
       
       JPanel laminaSlider = new JPanel();
       laminaSlider.add(barra);
       
       add(laminaSlider,BorderLayout.NORTH);
       
    
    }
    
    private class AccionBarra implements ChangeListener{

      
        public void stateChanged(ChangeEvent ce) {
           //contador++;
           int tamano = barra.getValue();
           texto.setText("Tamaño de letra: "+barra.getValue());
           texto.setFont(new Font("Arial",Font.BOLD,tamano));
            
            
        }
    
    
    
    }
    
    private JLabel texto;
    private JSlider barra;
    private static int contador;
}

