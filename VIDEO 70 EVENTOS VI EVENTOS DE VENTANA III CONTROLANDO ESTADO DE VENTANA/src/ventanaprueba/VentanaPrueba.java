//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.*;
import java.awt.event.ActionListener;
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
       miVentana.setTitle("Ventana No.1 WindowStateListener CONTROLANDO ESTADO DE VENTANA");
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
        
        CambioDeEstado nuevoEstado = new CambioDeEstado();
        addWindowStateListener(nuevoEstado);
        Lamina texto = new Lamina();
        
        add(texto);
        
    }//Fin del constructor ventana
}//Fin de clase ventana

class CambioDeEstado implements WindowStateListener{//La instruccion windowAdapter permite sobreeescribir solamente los metodos a utilizar

    public void windowStateChanged(WindowEvent we) {
        
        //System.out.println(we.getNewState());//Imprime en consola 7 si ha sido minimizada, 0 si vuelve al estado normal, y 6 si fue maximizada
        if(we.getNewState() ==Frame.MAXIMIZED_BOTH){//Si se maximiza la ventana entonces nos informa
            
            JOptionPane.showMessageDialog(null,"La ventana está a pantalla completa");
        }
        else if(we.getNewState()==Frame.NORMAL){
        
            JOptionPane.showMessageDialog(null,"La ventana ha vuelto a su estado normal");
        }
        else if(we.getNewState()==Frame.ICONIFIED){
        
            JOptionPane.showMessageDialog(null,"La ventana está minimizada");
        }
    }
 
 }
 
class Lamina extends JPanel{

    public void paintComponent(Graphics e){
      
        e.setColor(Color.BLUE);
       
        e.drawString("MAXIMIZA O MINIMIZA LA PANTALLA PARA DETECTAR EL CAMBIO DE ESTADO", 50, 100);
        
    }


}



