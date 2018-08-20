//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
       miVentana.setTitle("CONTROLANDO EVENTOS DEL TECLADO");
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
        
        EventoTeclado teclaPresionada = new EventoTeclado();
        addKeyListener(teclaPresionada);
        
    }//Fin del constructor ventana
}//Fin de clase ventana


 
class Lamina extends JPanel{

    public void paintComponent(Graphics e){
      
        e.setColor(Color.BLUE);
       
        e.drawString("PRESIONA CUALQUIER TECLA PARA OBTENER SU CODIGO ANSI", 50, 100);
        
    }


}

class EventoTeclado implements KeyListener{

   
    public void keyTyped(KeyEvent ke) {//se ejecuta al presionar y soltar
        
        letra = ke.getKeyChar();
       
       JOptionPane.showMessageDialog(null,"Letra pulsada: "+letra+"   Código: "+codigo);
       
    }

 
    public void keyPressed(KeyEvent ke) {
        codigo=ke.getKeyCode();
       
    }


    public void keyReleased(KeyEvent ke) {//Al soltar tecla
        
    }
    private int codigo;
    private char letra;
}


