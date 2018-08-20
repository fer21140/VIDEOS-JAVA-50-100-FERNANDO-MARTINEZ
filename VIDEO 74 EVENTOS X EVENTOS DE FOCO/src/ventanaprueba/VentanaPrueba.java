//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.*;
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


import javax.swing.*;

public class VentanaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Ventana miVentana = new Ventana();
       miVentana.setTitle("FOCO");
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       
    }
    
}

class Ventana extends JFrame{

    public Ventana(){
        
        setBounds(50,100,600,400);
        /*
        MiVentana ventanaOyente = new MiVentana();
        addWindowListener(ventanaOyente);
        */
        
        
        Lamina texto = new Lamina();
        
        add(texto);
        
       
        
    }//Fin del constructor ventana
}//Fin de clase ventana


 
class Lamina extends JPanel{

    public void paintComponent(Graphics e){
      
        e.setColor(Color.BLUE);
       
        e.drawString("HAZ CLICK EN EL PRIMER JTEXTFIELD, LUEGO EN CLICK EN EL OTRO", 50, 100);
        setLayout(null);
        cuadro1=new JTextField();
        cuadro2=new JTextField();
        
        cuadro1.setBounds(120,10,150,20);
        cuadro2.setBounds(120,50,150,20);
        
        add(cuadro1);
        add(cuadro2);
        
        FocoOyente elFoco = new FocoOyente();
        cuadro1.addFocusListener(elFoco);
        
    }
   
    private class FocoOyente implements FocusListener{

    
    public void focusGained(FocusEvent fe) {
        
    }

    
    public void focusLost(FocusEvent fe) {
       JOptionPane.showMessageDialog(null, "Has perdido la focalización");
    }


}
    JTextField cuadro1;
    JTextField cuadro2;
}




