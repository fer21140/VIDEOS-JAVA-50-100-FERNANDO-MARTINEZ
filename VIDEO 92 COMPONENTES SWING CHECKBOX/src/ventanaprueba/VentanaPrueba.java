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
        
       MarcoCheck miVentana = new MarcoCheck();
      
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       
    }
    
}

class MarcoCheck extends JFrame{
    
    public MarcoCheck(){
    
    setBounds(400,300,500,400);
    setTitle("CheckBox");
    
    setLayout(new BorderLayout());
    Font miLetra = new Font("Seríf",Font.PLAIN,24);
    texto=new JLabel("Tres tristes tigres comen trigo en un trigal");
    texto.setFont(miLetra);
    
    JPanel laminaTexto = new JPanel();
    laminaTexto.add(texto);
    add(laminaTexto,BorderLayout.CENTER);
    check1= new JCheckBox("Negrita");
    check2= new JCheckBox("Cursiva");
    
    check1.addActionListener(new manejaChecks());
    check2.addActionListener(new manejaChecks());
    
    JPanel laminaChecks = new JPanel();
    
    laminaChecks.add(check1);
    laminaChecks.add(check2);
    
    add(laminaChecks,BorderLayout.SOUTH);
    
    }
    
    private class manejaChecks implements ActionListener{
    
    public void actionPerformed(ActionEvent e){
    
        int tipo=0;
        if(check1.isSelected()) tipo+=Font.BOLD;
        if(check2.isSelected()) tipo+=Font.ITALIC;
        texto.setFont(new Font ("Seríf",tipo,24));
    
    }
    
    }
 
    private JLabel texto;
    private JCheckBox check1,check2;
    
}

class LaminaCheck extends JPanel{


    public LaminaCheck(){
    
        
    
    }


}
