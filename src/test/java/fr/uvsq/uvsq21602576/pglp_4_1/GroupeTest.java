package fr.uvsq.uvsq21602576.pglp_4_1;

public class GroupeTest {

	@Test
	public void addTestGroupe() {
		Groupe g = new Groupe();
		g.add(new Groupe());
		assertEquals(1,g.size());
		assertEquals(new Groupe(), g.get(0));
	}

}
