/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sensasprueba.app.bloques.proceso;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Camilo
 */
public class ProcesoTest {
    

    @Test
    public void testBusqueda() {
        System.out.println("busqueda");
        String string = "";
        Proceso proceso = new Proceso();
        
        try {
            proceso.busqueda(string);
        } catch (Exception e) {
            assertEquals(e, Exception.class);
        }

    }
  
    @Test
    public void testStringToList() {
     
        String convertir = "prueba";
        Proceso proceso = new Proceso();
        ArrayList<String> result = proceso.stringToList(convertir);
        assertEquals(result.getClass(), ArrayList.class);
       
    }

 
    @Test
    public void testIsWordOnBlock() {
        System.out.println("isWordOnBlock");
        Proceso proceso = new Proceso();
        boolean expResult = false;
        boolean result = proceso.isWordOnBlock();
        assertEquals(expResult, result);
    
    }
    
}
