package fr.uvsq.uvsq21602576.pglp_4_1;

import java.util.ArrayList;

public class Groupe implements Composant{
	private ArrayList<Composant> composantFils;
	
	public Groupe() {
		composantFils = new ArrayList<Composant>();
	}

	public void add(Composant c) {
		composantFils.add(c);
	}
	
	public Composant get(int index) {
		return composantFils.get(index);
	}
	
	public Composant remove(int index) {
		return composantFils.remove(index);
	}
	
	@Override
	public boolean equals(Object O) {
		if(O==null || !(O instanceof Groupe))
			return false;
		else {
			Groupe G = (Groupe) O;
			if(this.size()==G.size() && G.containsAll(composantFils))
				return true;
			else
				return false;
		}
	}
	
	public boolean containsAll(ArrayList<Composant> c) {
		return composantFils.containsAll(c);
	}
	
	public int size() {
		return composantFils.size();
	}
}
