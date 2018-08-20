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
       setTitle("Areas de texto II");
       
       setLayout(new BorderLayout());
       
       laminaBotones = new JPanel();
       botonInsertar = new JButton("Insertar");
       
       botonInsertar.addActionListener(new ActionListener (){
       
       
       public void actionPerformed(ActionEvent e){
       
           areaTexto.append("Tres tristes tigres comen trigo en un trigal");
       
       }
       
       
       });
      
       laminaBotones.add(botonInsertar);
       
       botonSaltos = new JButton("Salto de linea");
       
       botonSaltos.addActionListener(new ActionListener(){
         
           public void actionPerformed(ActionEvent ae) {
              boolean saltar =!areaTexto.getLineWrap();
              areaTexto.setLineWrap(saltar);
              
              if(saltar){
                  botonSaltos.setText("Quitar salto");
              
              }else{
                  botonSaltos.setText("Salto de linea");
              }
           }
      
           
       
       
       });
       
       laminaBotones.add(botonSaltos);
       add(laminaBotones,BorderLayout.SOUTH);
       areaTexto=new JTextArea(8,20);
       laminaConBarras = new JScrollPane(areaTexto);
       add(laminaConBarras,BorderLayout.CENTER);
   }
   
   private JPanel laminaBotones;
   private JButton botonInsertar,botonSaltos;
   private JTextArea areaTexto;
   private JScrollPane laminaConBarras;
}
