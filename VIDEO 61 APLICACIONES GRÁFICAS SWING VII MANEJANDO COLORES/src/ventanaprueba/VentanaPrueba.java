//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.Color;
import java.awt.Dimension;
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
       
       setTitle("Dibujando en el Jframe");
       
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
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.setPaint(Color.RED);//Elegimos color
        g2.fill(rectangulo);//Rellenamos con "fill" del color elegido
        
        
        
        Ellipse2D.Double elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        
        g2.setPaint(Color.BLUE);
        g2.fill(elipse);
        
        g2.draw(new Line2D.Double(100,100,300,250));//Dibujamos linea
        
        double CentroenX = rectangulo.getCenterX();
        double CentroenY = rectangulo.getCenterY();
        
        double radio =150;//La altura del rectangulo
        
        Ellipse2D circulo = new Ellipse2D.Double();
        
        circulo.setFrameFromCenter(CentroenX,CentroenY,CentroenX+radio,CentroenY+radio);
        g2.setPaint(Color.GREEN);
        g2.draw(circulo);
        
    }

}