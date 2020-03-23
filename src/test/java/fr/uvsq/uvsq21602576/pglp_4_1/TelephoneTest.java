package fr.uvsq.uvsq21602576.pglp_4_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * CLasse de Test pour Telephone.
 * @author Flora
 */
public class TelephoneTest {

    /**
     * Teste la méthode equals.
     */
    @Test
    public void equalsTest() {
        Telephone t = new Telephone("06", "portable");
        Telephone t2 = new Telephone("06", "portable");
        assertTrue(t.equals(t2));
    }

    /**
     * Teste la méthode equals.
     */
    @Test
    public void equalsTest2() {
        Telephone t = new Telephone("065", "portable");
        Telephone t2 = new Telephone("06", "portable");
        assertFalse(t.equals(t2));
    }

    /**
     * Teste la méthode equals.
     */
    @Test
    public void equalsTest3() {
        Telephone t = new Telephone("06", "porta ble");
        Telephone t2 = new Telephone("06", "portable");
        assertFalse(t.equals(t2));
    }

    /**
     * Teste la méthode toString.
     */
    @Test
    public void toStringTest() {
        Telephone t = new Telephone("06", "portable");
        String expected = "(" + t.getInformation()
        + ") " + t.getNumero();
        assertEquals(expected, t.toString());
    }

}
