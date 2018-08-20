//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import javafx.scene.shape.Ellipse;
import javax.imageio.ImageIO;
import javax.swing.*;

public class VentanaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ventanaCentrada miVentana = new ventanaCentrada();
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
        
    }
    
}

class ventanaCentrada extends JFrame{

    public ventanaCentrada(){
        
        
       Toolkit miVentana = Toolkit.getDefaultToolkit();
       Dimension tamañoPantalla = miVentana.getScreenSize();
       int alturaPantalla = tamañoPantalla.height;
       int anchoPantalla = tamañoPantalla.width;
       
       setSize(anchoPantalla/2,alturaPantalla/2);
      
       
       setLocation(anchoPantalla/4,alturaPantalla/4);//Centra perfectamente el frame
       
       setTitle("Eventos");
       
       LaminaConImagen miCapa = new LaminaConImagen();
       
       miCapa.setBackground(Color.GREEN);//Color de fondo del panel
       
       add(miCapa);
       
       //Image miIcono = miVentana.getImage("src/icono.gif");
       
      // setIconImage(miIcono);//Debe ser del tamaño apropiado para que no sobrecargue memoria
    }

}

class LaminaConImagen extends JPanel implements ActionListener{

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");
    
        public LaminaConImagen(){
        
        
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        
        botonAzul.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);
        }
        
        public void actionPerformed(ActionEvent e){
            
            Object botonPulsado = new Object();
            botonPulsado = e.getSource();
            
            if(botonPulsado == botonAzul){
            setBackground(Color.BLUE);
            }
            
            if(botonPulsado == botonAmarillo){
            setBackground(Color.YELLOW);
            }
            
            if(botonPulsado == botonRojo){
            setBackground(Color.RED);
            }
        }
        
    }

