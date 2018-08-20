//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904

package ventanaprueba;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


import javax.swing.*;

public class VentanaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Ventana miVentana = new Ventana();
       miVentana.setTitle("Ventana No.1 WindowAdapter");
       miVentana.setVisible(true);
       miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el programa totalmente
       Ventana miVentana2 = new Ventana();
       
       miVentana2.setBounds(700,100,600,400);
       miVentana2.setTitle("Ventana No.2 WindowAdapter");
       miVentana2.setVisible(true);
       miVentana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}

class Ventana extends JFrame{

    public Ventana(){
        
        setBounds(50,100,600,400);
        /*
        MiVentana ventanaOyente = new MiVentana();
        addWindowListener(ventanaOyente);
        */
        
        addWindowListener(new MiVentana());//Simplificamos codigo anterior
        
    }//Fin del constructor ventana
}//Fin de clase ventana

class MiVentana extends WindowAdapter{//La instruccion windowAdapter permite sobreeescribir solamente los metodos a utilizar

  
 
    public void windowIconified(WindowEvent we) {
    System.out.println("Ventana minimizada");//En esta clase no es necesario sobreeescribir los métodos abstractos
    }

  

}


