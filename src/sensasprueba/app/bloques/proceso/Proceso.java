package sensasprueba.app.bloques.proceso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sensasprueba.app.bloques.BloqueList;

/**
 *
 * @author Edwin Camilo
 * Procedimiento para determinacion
 * de palabras en lista de bloques
 */
public class Proceso {
    
    private ArrayList<String> stringConverted = new ArrayList<>();
    private List<String> obtained = new ArrayList<>();
    private BloqueList bloqueList = new BloqueList();
    private List<String> bloques = new ArrayList<>();
    
    private int position = 0;
    
    public void busqueda(String string){  
        
        bloques = bloqueList.AllBloquesList();
        stringConverted = stringToList(string); 
        System.out.println("Bloques " +bloques );   
        
        try {             
            for(String str : stringConverted){
                for(String bloque : bloques){          
                    if(str.equalsIgnoreCase(bloque)){
                        position = bloques.indexOf(bloque);           
                        obtained.add(bloque);                  
                        bloques.set(position, " ");  
                        break;
                     }                         
                }
            }   
            System.out.println("Lista buscados " + stringConverted);
            System.out.println("Lista Obtenidos" + obtained);
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }
 
    public ArrayList<String> stringToList(String convertir){     
        String[] strArray = convertir.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArray));   
        return list;                   
    
    }
      
    public boolean isWordOnBlock (){
        String obtainedString = obtained.toString();
        String wantedString = stringConverted.toString();     
        return (obtainedString.equalsIgnoreCase(wantedString)) ? true : false;      
    }  
    
}
