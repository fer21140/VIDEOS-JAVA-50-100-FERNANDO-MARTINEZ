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
       
       setTitle("Añadiendo una imagen en un JFrame");
       
       LaminaConImagen miCapa = new LaminaConImagen();
       
       miCapa.setBackground(Color.GREEN);//Color de fondo del panel
       
       add(miCapa);
       
       //Image miIcono = miVentana.getImage("src/icono.gif");
       
      // setIconImage(miIcono);//Debe ser del tamaño apropiado para que no sobrecargue memoria
    }

}

class LaminaConImagen extends JPanel{

    public void paintComponent(Graphics e){
    
        super.paintComponent(e);
       
        Graphics2D g2 =(Graphics2D) e;
        
        File miimagen = new File("t.png");
        
        try{
        
            imagen = ImageIO.read(miimagen);
            g2.drawImage(imagen,0,0,null);
        }catch(IOException i){
        
            System.out.println("No se ha podido cargar la imagen");
            System.exit(0);
        }
        
       
          g2.copyArea(0, 0, 15, 15, 15,15);
          g2.copyArea(0, 0, 15, 15, 30,30);
          g2.copyArea(0, 0, 15, 15, 45,45);
          g2.copyArea(0, 0, 15, 15, 60,60);
          g2.copyArea(0, 0, 15, 15, 75,75);
          g2.copyArea(0, 0, 15, 15, 90,90);
          g2.copyArea(0, 0, 15, 15, 105,105);//Copia de area
          g2.copyArea(0, 0, 15, 15, 120,120);
          g2.copyArea(0, 0, 15, 15,135,135);
          g2.copyArea(0, 0, 15, 15, 150,150);
          g2.copyArea(0, 0, 15, 15, 165,165);
          g2.copyArea(0, 0, 15, 15, 180,180);
          g2.copyArea(0, 0, 15, 15, 195,195);
          g2.copyArea(0, 0, 15, 15, 210,210);
          
   
        
    }
private Image imagen;
}