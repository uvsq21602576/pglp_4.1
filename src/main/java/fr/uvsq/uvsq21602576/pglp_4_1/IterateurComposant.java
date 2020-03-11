package fr.uvsq.uvsq21602576.pglp_4_1;

import java.util.ArrayList;

public class IterateurComposant {
	private ArrayList<Composant> list;

	public IterateurComposant(ArrayList<Composant> groupe) {
		this.list = new ArrayList<Composant>();
		this.list.addAll(groupe);
	}
	
	public boolean hasNext() {
		return !this.list.isEmpty();
	}
	
	public Composant next() {
		return list.remove(0);
	}

}
