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
        Reloj miReloj = new Reloj(1000,true);
        miReloj.arranque();
        
        JOptionPane.showMessageDialog(null,"!!Mira la consola, Presiona aceptar para terminar ciclo");
        
        System.exit(0); 
    }
    
}

class Reloj{

    public Reloj(int intervalo, boolean sonido){
      this.intervalo = intervalo;
      this.sonido = sonido;
    }
   
    public void arranque(){

        ActionListener oyente = new dameHora2();
        Timer miTemporizador = new Timer(intervalo,oyente);
        miTemporizador.start();
    }    
    
    private int intervalo;
    private boolean sonido;
    
    private class dameHora2 implements ActionListener {

        public void actionPerformed(ActionEvent evento) {

            Date hora = new Date();

            System.out.println("Te doy la hora cada 3 segundos " + hora);

            if (sonido) {
                Toolkit.getDefaultToolkit().beep();
            }//fin de if
    
    }//Fin de funcion abstracta
    
    }//Fin de clase interna
    
}//Fin de clase reloj

