/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sensasprueba.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Camilo
 */
public class SensasPruebaTest {
    

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SensasPrueba.main(args);
     
        fail("The test case is a prototype.");
    }

  
    @Test
    public void testRun() {
        SensasPrueba proceso = new SensasPrueba();
        proceso.run();
        assertNotNull(this);
 
    }

  
    @Test
    public void testValidate() {
        System.out.println("validate");
        String word = "";
        SensasPrueba proceso = new SensasPrueba();
        proceso.validate(word);
     
    }
    
}
