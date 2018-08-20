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
        setTitle("ComboBox");
        LaminaCombo miLamina = new LaminaCombo();
        add(miLamina);
    }

}

class LaminaCombo extends JPanel{

    public LaminaCombo(){
    
        setLayout(new BorderLayout());
        texto=new JLabel("Si el río suena es porque piedras trae");
        texto.setFont(new Font("Arial",Font.PLAIN,18));
        
        add(texto,BorderLayout.CENTER);
        
        JPanel laminaNorte = new JPanel();
        
        miCombo = new JComboBox();
        miCombo.setEditable(true);
        miCombo.addItem("Serif");
        miCombo.addItem("Arial");
        miCombo.addItem("Impact");
        miCombo.addItem("Dialog");
        
        AccionCombo miEvento = new AccionCombo();
        miCombo.addActionListener(miEvento);
        
        laminaNorte.add(miCombo);
        add(laminaNorte,BorderLayout.NORTH);
        
    }
    
    private class AccionCombo implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
        
        texto.setFont(new Font(miCombo.getSelectedItem().toString(),Font.PLAIN,18));
            
        }
    
    }
    
    private JLabel texto;
    private JComboBox miCombo;
}