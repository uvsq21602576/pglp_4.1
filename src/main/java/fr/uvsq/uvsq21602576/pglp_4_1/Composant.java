package fr.uvsq.uvsq21602576.pglp_4_1;

import java.util.ArrayList;
import java.util.Iterator;

public interface Composant extends Iterable<Composant> {
	
	public ArrayList<String> hierarchie();
}
