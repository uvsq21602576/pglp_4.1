package fr.uvsq.uvsq21602576.pglp_4_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GroupeTest {

	@Test
	public void addTestGroupe() {
		Groupe g = new Groupe();
		g.add(new Groupe());
		assertEquals(1,g.size());
		assertEquals(new Groupe(), g.get(0));
	}
	
	@Test
	public void removeTestGroupe() {
		Groupe g = new Groupe();
		g.add(new Groupe());
		Composant g2 = g.remove(0);
		assertTrue(g2 instanceof Groupe);
		assertEquals(0,g.size());
		assertEquals(new Groupe(), (Groupe)g2);
	}

}
