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
        
       MarcoMenu miVentana = new MarcoMenu();
      
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       
    }
    
}

class MarcoMenu extends JFrame{
    
    public MarcoMenu(){
    
        setBounds(400,200,600,400);
        setTitle("Menús");
        MenuLamina miLamina = new MenuLamina();
        add(miLamina);
    }
    
    
}

class MenuLamina extends JPanel{

    public MenuLamina(){
    
        JMenuBar miBarra = new JMenuBar();
        
        JMenu archivo = new JMenu("Archivo");
        JMenu Edicion = new JMenu("Edicion");
        JMenu Herramientas = new JMenu("Herramientas");
        JMenu Opciones = new JMenu("Opciones");
        
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarComo = new JMenuItem("Guardar como");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem generales = new JMenuItem("Generales");
        
        JMenuItem opcion1 = new JMenuItem("Opcion1");
        JMenuItem opcion2 = new JMenuItem("Opcion2");
        JMenuItem opcion3 = new JMenuItem("Opcion3");
        
        Opciones.add(opcion1);
        Opciones.add(opcion2);
        Opciones.add(opcion3);
        
        archivo.add(guardar);
        archivo.add(guardarComo);
        Edicion.add(cortar);
        Edicion.add(copiar);
        Edicion.add(pegar);
        
        Edicion.addSeparator();
        
        Edicion.add(Opciones);
        
        Herramientas.add(generales);
        
        
        miBarra.add(archivo);
        miBarra.add(Edicion);
        miBarra.add(Herramientas);
        
        add(miBarra);
    }

}

