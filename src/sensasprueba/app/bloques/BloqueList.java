
package sensasprueba.app.bloques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Edwin Camilo
 * Esta clase contiene una solo funcion
 * la cual devuelve una lista con todos las
 * letras de los bloques.
 */
public class BloqueList {
    
    Bloque bloque = new Bloque();
    List<String> allBloques = new ArrayList<>();
    
    List<String> listBloque1 = Arrays.asList(bloque.getBloque1()); 
    List<String> listBloque2 = Arrays.asList(bloque.getBloque2());
    List<String> listBloque3 = Arrays.asList(bloque.getBloque3());
    List<String> listBloque4 = Arrays.asList(bloque.getBloque4());
    List<String> listBloque5 = Arrays.asList(bloque.getBloque5());
    List<String> listBloque6 = Arrays.asList(bloque.getBloque6());
    List<String> listBloque7 = Arrays.asList(bloque.getBloque7());
    List<String> listBloque8 = Arrays.asList(bloque.getBloque8());
    List<String> listBloque9 = Arrays.asList(bloque.getBloque9());
    List<String> listBloque10 = Arrays.asList(bloque.getBloque10());
    List<String> listBloque11 = Arrays.asList(bloque.getBloque11());
    List<String> listBloque12 = Arrays.asList(bloque.getBloque12());
    List<String> listBloque13 = Arrays.asList(bloque.getBloque13());
    List<String> listBloque14 = Arrays.asList(bloque.getBloque14());
    List<String> listBloque15 = Arrays.asList(bloque.getBloque15());
    List<String> listBloque16 = Arrays.asList(bloque.getBloque16());
    List<String> listBloque17 = Arrays.asList(bloque.getBloque17());
    List<String> listBloque18 = Arrays.asList(bloque.getBloque18());
    List<String> listBloque19 = Arrays.asList(bloque.getBloque19());
    List<String> listBloque20 = Arrays.asList(bloque.getBloque20());

      
    public List<String> AllBloquesList(){
        
        allBloques.addAll(listBloque1);
        allBloques.addAll(listBloque2);
        allBloques.addAll(listBloque3);
        allBloques.addAll(listBloque4);
        allBloques.addAll(listBloque5);
        allBloques.addAll(listBloque6);
        allBloques.addAll(listBloque7);
        allBloques.addAll(listBloque8);
        allBloques.addAll(listBloque9);
        allBloques.addAll(listBloque10);
        allBloques.addAll(listBloque11);
        allBloques.addAll(listBloque12);
        allBloques.addAll(listBloque13);
        allBloques.addAll(listBloque14);
        allBloques.addAll(listBloque15);
        allBloques.addAll(listBloque16);
        allBloques.addAll(listBloque17);
        allBloques.addAll(listBloque18);
        allBloques.addAll(listBloque19);
        allBloques.addAll(listBloque20);
          
        return allBloques;
   }
}
