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
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javafx.scene.shape.Ellipse;
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
       
       setTitle("Modificando el texto en el JFrame");
       
       Lamina miCapa = new Lamina();
       
       miCapa.setBackground(Color.GREEN);//Color de fondo del panel
       
       add(miCapa);
       
       //Image miIcono = miVentana.getImage("src/icono.gif");
       
      // setIconImage(miIcono);//Debe ser del tamaño apropiado para que no sobrecargue memoria
    }

}

class Lamina extends JPanel{

    public void paintComponent(Graphics e){
    
        super.paintComponent(e);
       
        Graphics2D g2 =(Graphics2D) e;
        
        Font miFuente = new Font("Algerian",Font.BOLD,22);//Creo mi fuente favorita
        g2.setFont(miFuente);
        g2.setColor(Color.BLUE);
        g2.drawString("Escribiendo un string con fuente personalizada",25,150);
        g2.setFont(new Font("Arial",Font.ITALIC,30));
        g2.setColor(Color.RED);
        g2.drawString("JAVA ES 100% ORIENTADO A OBJETOS", 40, 200);
    }

}