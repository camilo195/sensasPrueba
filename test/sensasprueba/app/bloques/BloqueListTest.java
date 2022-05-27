/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sensasprueba.app.bloques;

import java.util.List;
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
public class BloqueListTest {
    
    public BloqueListTest() {
    }

    @Test
    public void testAllBloquesList() {
        System.out.println("AllBloquesList");
        BloqueList bloquelist = new BloqueList();
        List<String> result = bloquelist.AllBloquesList();
        assertNotNull(result);

    }
    
}
