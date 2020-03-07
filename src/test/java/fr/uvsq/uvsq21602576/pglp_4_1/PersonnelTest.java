package fr.uvsq.uvsq21602576.pglp_4_1;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class PersonnelTest {
	
	@Test
	public void constructeurTest() {
		Personnel p = new Personnel.Builder("Nom", "Prenom", LocalDate.of(2000,01,05), new Telephone("06...","portable")).build();
		assertEquals(p.getNom(), "Nom");
		assertEquals(p.getPrenom(), "Prenom");
		assertEquals(p.getDateNaissance(), LocalDate.of(2000,01,05));
		
		assertEquals(p.getNumeros().size(),1);
		assertEquals(p.getNumeros().get(0), new Telephone("06...", "portable"));
	}
	
}
