//CREADO POR FERNANDO MARTINEZ CARNET 1190-17-4904
package detectordefuentes;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;


public class DetectorDeFuentes {

    
    public static void main(String[] args) {
      
        String fuente = JOptionPane.showInputDialog(null,"Ingresa la fuente de letra para comprobar si existe en tu sistema");
        boolean existeLaFuente=false;
        
        String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        
        for(String nombreDeFuentes:nombresDeFuentes){
        
                if(nombreDeFuentes.toUpperCase().equals(fuente.toUpperCase())){
                
                    existeLaFuente=true;
                    
                }//Fin de if comprobador de existencia
            
        }//Fin de ciclo for buscador de fuente
        
        if(existeLaFuente){
        
        JOptionPane.showMessageDialog(null, "La fuente de formato de letra existe");
            
        }else{
        
            JOptionPane.showMessageDialog(null,"La fuente de formato de letra no existe");
        
        }
        
        
    }//Fin de main
    
}

