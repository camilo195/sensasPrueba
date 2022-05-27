
package sensasprueba.app;

import javax.swing.JOptionPane;

import sensasprueba.app.bloques.proceso.Proceso;

/**
 *
 * @author Edwin Camilo
 */
public class SensasPrueba {
    
      Proceso proceso = new Proceso();
      boolean isConformed = false;
      
    public static void main(String[] args) {       
        SensasPrueba sensas = new SensasPrueba();
        sensas.run();
    }
    
   public void run(){
       String word=JOptionPane.showInputDialog("Introduce una palabra");
       if(!word.isEmpty()){
            proceso.busqueda(word);
            validate(word);
       }
   }
   
   public void validate(String word){
       if(word != null){
            String response;
            isConformed =proceso.isWordOnBlock();
            response = "["+word+ "]:"+" "+isConformed;
            JOptionPane.showMessageDialog(null, response);
       }
   }
   
}
