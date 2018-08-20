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
       setTitle("Cuadros de texto");
       LaminaPassword lamina = new LaminaPassword();
       add(lamina);
   
   }
}

class LaminaPassword extends JPanel{

    public LaminaPassword(){
    
        setLayout(new BorderLayout());
        
        JPanel laminaSuperior = new JPanel();
        laminaSuperior.setLayout(new GridLayout(2,2));
        add(laminaSuperior,BorderLayout.NORTH);
        JLabel etiqueta1 = new JLabel("Usuario:");
        JLabel etiqueta2 = new JLabel("Contraseña:");
        JTextField usuario = new JTextField(15);
        contraseña = new JPasswordField(15);
        ComprobarContraseña miEvento = new ComprobarContraseña();
        contraseña.getDocument().addDocumentListener(miEvento);
        laminaSuperior.add(etiqueta1);
        laminaSuperior.add(usuario);
        laminaSuperior.add(etiqueta2);
        laminaSuperior.add(contraseña);
        JButton enviar = new JButton("Enviar datos");
        add(enviar,BorderLayout.SOUTH);
        JLabel texto = new JLabel("La contraseña debe tener mas de 11 caracteres",JLabel.CENTER);
        add(texto);
        
    
    }
    
    private class ComprobarContraseña implements DocumentListener{

       
        public void insertUpdate(DocumentEvent de) {
            char [] contrasena;
            contrasena = contraseña.getPassword();
            
            if(contrasena.length<8 || contrasena.length<12){
                
                contraseña.setBackground(Color.RED);
                
            }else{
                
                contraseña.setBackground(Color.WHITE);
            }
            
        }

       
        public void removeUpdate(DocumentEvent de) {
           
        }

        
        public void changedUpdate(DocumentEvent de) {
            
        }
    
    
    }
    private JPasswordField contraseña;
    
}

