package fr.uvsq.uvsq21602576.pglp_4_1;

import java.util.ArrayList;
import java.util.Iterator;

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

	public ArrayList<String> hierarchie() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Groupe");
		Iterator<Composant> ite = this.iterator();
		Composant c;
		while(ite.hasNext()) {
			c = ite.next();
			for(String s : c.hierarchie()) {
				if(s.substring(0, 1).equals("\t"))
					s = "\t"+s;
				else
					s = "\t|-   "+s;
				list.add(s);
			}
		}
		return list;
	}
	
	public ArrayList<String> groupe() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Groupe");
		Iterator<Composant> ite = this.iterator();
		Composant c;
		while(ite.hasNext()) {
			c = ite.next();
			for(String s : c.hierarchie()) {
				if(s.substring(0, 1).equals("\t"))
					s = "\t"+s;
				else
					s = "\t|-   "+s;
				list.add(s);
			}
		}
		return list;
	}

	public Iterator<Composant> iterator() {
		return composantFils.iterator();
	}
}
