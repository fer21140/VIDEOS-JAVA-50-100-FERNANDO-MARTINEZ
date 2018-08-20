//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
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
       
       add(miCapa);
       
       //Image miIcono = miVentana.getImage("src/icono.gif");
       
      // setIconImage(miIcono);//Debe ser del tamaño apropiado para que no sobrecargue memoria
    }

}

class Lamina extends JPanel{

    public void paintComponent(Graphics e){
    
        super.paintComponent(e);
        e.drawRect(50, 50, 80, 80);
        e.drawRect(150,50,80,80);
        e.drawLine(50,150, 230,150);//Une los puntos de la linea recta
        e.drawArc(100, 200,100,100,100,250);
    }

}