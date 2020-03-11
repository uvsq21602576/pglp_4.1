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
	
	public String groupe() {
		ArrayList<Composant> ATraiter = new ArrayList<Composant>();
		ArrayList<Composant> ATraiterSuiv = new ArrayList<Composant>();
		ATraiterSuiv.add(racine);
		Composant c;
		String S = "";
		while(!ATraiter.isEmpty() || !ATraiterSuiv.isEmpty()) {
			if(ATraiter.isEmpty()) {
				ATraiter.addAll(ATraiterSuiv);
				ATraiterSuiv.clear();
				S+="---\n";
			}
			c = ATraiter.remove(0);
			S+= c.toString()+"\n";
			if(c instanceof Iterable) {
				Iterator<Composant> ite  = ((Iterable<Composant>) c).iterator();
				while(ite.hasNext()) {
					ATraiterSuiv.add(ite.next());
				}
			}
		}
		return S;
	}

}
