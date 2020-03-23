package fr.uvsq.uvsq21602576.pglp_4_1;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

/**
 * Classe de test pour Annuaire.
 * @author Flora
 */
public class AnnuaireTest {

    /**
     * Teste la méthode hierarchie.
     */
    @Test
    public void hierarchieTest() {
        Personnel p = new Personnel.Builder("1", "1",
                LocalDate.of(2000, 01, 05),
                new Telephone("06...", "portable"))
                .build();
        Personnel p2 = new Personnel.Builder("1", "2",
                LocalDate.of(2000, 01, 05),
                new Telephone("06...", "portable"))
                .build();

        Groupe g = new Groupe("G");
        g.add(p);
        g.add(p2);

        Annuaire a = new Annuaire(g);

        String expected = "Groupe G (2)\n" + "\t|-   "
                + p.toString() + "\n"
                + "\t|-   " + p2.toString() + "\n";
        assertEquals(expected, a.hierachie());
    }

    /**
     * Teste la méthode groupe.
     */
    @Test
    public void groupeTest() {
        Personnel p = new Personnel.Builder("1", "1",
                LocalDate.of(2000, 01, 05),
                new Telephone("06...", "portable"))
                .build();
        Personnel p2 = new Personnel.Builder("1", "2",
                LocalDate.of(2000, 01, 05),
                new Telephone("06...", "portable"))
                .build();

        Groupe g = new Groupe("G");
        g.add(p);
        g.add(p2);

        Annuaire a = new Annuaire(g);

        String expected = "---\n" + g.toString() + "\n"
                + "---\n" + p.toString() + "\n"
                + p2.toString() + "\n";
        assertEquals(expected, a.groupe());
    }
}
