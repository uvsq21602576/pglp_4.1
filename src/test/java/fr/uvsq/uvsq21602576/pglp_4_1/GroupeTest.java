package fr.uvsq.uvsq21602576.pglp_4_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

/**
 * Classe de test pour Groupe.
 * @author Flora
 *
 */
public class GroupeTest {

    /**
     * Teste la méthode add avec un groupe.
     */
    @Test
    public void addTestGroupe() {
        Groupe g = new Groupe("G");
        g.add(new Groupe("G"));
        assertEquals(1, g.size());
        assertEquals(new Groupe("G"), g.get(0));
    }

    /**
     * Teste la méthode add avec un personnel.
     */
    @Test
    public void addTestPersonnel() {
        Groupe g = new Groupe("G");
        Personnel p = new Personnel.Builder("1", "1",
                LocalDate.of(2000, 01, 05),
                new Telephone("06...", "portable"))
                .build();
        g.add(p);
        assertEquals(1, g.size());
        assertEquals(p, g.get(0));
    }

    /**
     * Teste la méthode remove pour un groupe.
     */
    @Test
    public void removeTestGroupe() {
        Groupe g = new Groupe("G");
        g.add(new Groupe("G"));
        Composant g2 = g.remove(0);
        assertTrue(g2 instanceof Groupe);
        assertEquals(0, g.size());
        assertEquals(new Groupe("G"), (Groupe) g2);
    }

    /**
     * Teste la méthode remove pour un personnel.
     */
    @Test
    public void removeTestPersonnel() {
        Groupe g = new Groupe("G");
        Personnel p = new Personnel.Builder("1", "1",
                LocalDate.of(2000, 01, 05),
                new Telephone("06...", "portable"))
                .build();
        g.add(p);
        Composant g2 = g.remove(0);
        assertTrue(g2 instanceof Personnel);
        assertEquals(0, g.size());
        assertEquals(p, (Personnel) g2);
    }

    /**
     * Teste la méthode equals.
     */
    @Test
    public void equalsTrueTest() {
        Groupe g = new Groupe("G");
        Personnel p = new Personnel.Builder("1", "1",
                LocalDate.of(2000, 01, 05),
                new Telephone("06...", "portable"))
                .build();
        g.add(p);
        Groupe g2 = new Groupe("G");
        g2.add(p);
        assertTrue(g.equals(g2));
    }

    /**
     * Teste la méthode equals.
     */
    @Test
    public void equalsFalseTest() {
        Groupe g = new Groupe("G");
        Personnel p = new Personnel.Builder("1", "1",
                LocalDate.of(2000, 01, 05),
                new Telephone("06...", "portable"))
                .build();
        g.add(p);
        Groupe g2 = new Groupe("G");
        g2.add(p);
        Personnel p2 = new Personnel.Builder("2", "1",
                LocalDate.of(2000, 01, 05),
                new Telephone("06...", "portable"))
                .build();
        g2.add(p2);
        assertFalse(g.equals(g2));
    }

}
