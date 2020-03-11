package fr.uvsq.uvsq21602576.pglp_4_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Annuaire {
	Composant racine;

	public Annuaire(Composant racine) {
		this.racine = racine;
	}
	
	public String hierachie() {
		String S = "";
		ArrayList<String> list = racine.hierarchie();
		for(String s : list) {
			S+=s+"\n";
		}
		return S;
	}

}
