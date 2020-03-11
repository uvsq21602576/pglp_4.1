package fr.uvsq.uvsq21602576.pglp_4_1;

import java.time.LocalDate;

public enum Main {
	MAIN;
	
	public void run() {
		Personnel p = new Personnel.Builder("1", "1", LocalDate.of(2000,01,05), new Telephone("06...","portable")).build();
		Personnel p2 = new Personnel.Builder("1", "2", LocalDate.of(2000,01,05), new Telephone("06...","portable")).build();
		Personnel p3 = new Personnel.Builder("2", "1", LocalDate.of(2000,01,05), new Telephone("06...","portable")).build();
		Personnel p4 = new Personnel.Builder("2", "2", LocalDate.of(2000,01,05), new Telephone("06...","portable")).build();
		Personnel p5 = new Personnel.Builder("3", "1", LocalDate.of(2000,01,05), new Telephone("06...","portable")).build();
		Personnel p6 = new Personnel.Builder("4", "1", LocalDate.of(2000,01,05), new Telephone("06...","portable")).build();

		Groupe g = new Groupe("G1");
		g.add(p);
		g.add(p2);
		Groupe g2 = new Groupe("G2");
		g2.add(p3);
		g2.add(p4);
		g2.add(g);
		g2.add(p6);
		Groupe g3 = new Groupe("G3");
		g3.add(p5);
		g3.add(g2);
		
		Annuaire A = new Annuaire(g3);
		System.out.println(A.hierachie());
		System.out.println(A.groupe());
	}

	public static void main(String[] args) {
		MAIN.run();
	}
}
