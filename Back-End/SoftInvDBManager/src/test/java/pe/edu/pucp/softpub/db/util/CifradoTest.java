package pe.edu.pucp.softpub.db.util;

import pe.edu.pucp.softinv.db.util.Cifrado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author andres
 */
public class CifradoTest {
    
    public CifradoTest() {
    }

    /**
     * Test of cifrarMD5 method, of class Cifrado.
     */
    @Test
    public void testCifrarMD5() {
        System.out.println("cifrarMD5");
        String texto = "francogallardo";        
        System.out.println(Cifrado.cifrarMD5(texto));
    }

}
