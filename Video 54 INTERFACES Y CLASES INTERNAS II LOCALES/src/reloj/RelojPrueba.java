/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;
import java.awt.Toolkit;
import java.util.*;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class RelojPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();
        miReloj.arranque(1000,true);
        
        JOptionPane.showMessageDialog(null,"!!Mira la consola, Presiona aceptar para terminar ciclo");
        
        System.exit(0); 
    }
    
}

class Reloj{

   
   
    public void arranque(int intervalo, final boolean sonido){

        class dameHora2 implements ActionListener {

        public void actionPerformed(ActionEvent evento) {

            Date hora = new Date();

            System.out.println("Te doy la hora cada 1 segundos " + hora);

            if (sonido) {
                Toolkit.getDefaultToolkit().beep();
            }//fin de if
    
    }//Fin de funcion abstracta
    
    }//Fin de clase interna
        
        ActionListener oyente = new dameHora2();
        Timer miTemporizador = new Timer(intervalo,oyente);
        miTemporizador.start();
        
        
    }    
    

    
    
    
}//Fin de clase reloj

