package fr.uvsq.uvsq21602576.pglp_4_1;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class PersonnelTest {
	
	@Test
	public void constructeurTest() {
		Personnel p = new Personnel.Builder("Nom", "Prenom", LocalDate.of(2000,01,05), new Telephone("06...","portable")).build();
		assertEquals("Nom", p.getNom());
		assertEquals("Prenom", p.getPrenom());
		assertEquals(LocalDate.of(2000,01,05), p.getDateNaissance());
		assertEquals("Employé", p.getFonction());
		
		assertEquals(1, p.getNumeros().size());
		assertEquals(new Telephone("06...", "portable"), p.getNumeros().get(0));
	}
	
	@Test
	public void constructeurTest2() {
		Personnel p = new Personnel.Builder("Nom", "Prenom", LocalDate.of(2000,01,05), new Telephone("06...","portable")).addNumero(new Telephone("01...", "fixe")).fonction("Directeur").build();
		assertEquals("Nom", p.getNom());
		assertEquals("Prenom", p.getPrenom());
		assertEquals(LocalDate.of(2000,01,05), p.getDateNaissance());
		assertEquals("Directeur", p.getFonction());
		
		assertEquals(2, p.getNumeros().size());
		assertEquals(new Telephone("01...", "fixe"), p.getNumeros().get(1));
		assertEquals(new Telephone("06...", "portable"), p.getNumeros().get(0));
	}
	
	@Test
	public void toStringTest() {
		Personnel p = new Personnel.Builder("Nom", "Prenom", LocalDate.of(2000,01,05), new Telephone("06...","portable")).build();
		String expected = p.getNom() + " " + p.getPrenom() + ", " + p.getFonction() + " (" + p.getDateNaissance().toString() + ") [" + p.getNumeros().get(0).toString() + "]";
		assertEquals(expected,p.toString());
	}
	
}
