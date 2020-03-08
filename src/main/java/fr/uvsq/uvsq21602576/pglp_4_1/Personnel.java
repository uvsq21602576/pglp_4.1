package fr.uvsq.uvsq21602576.pglp_4_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Personnel implements Composant{
	
	private final String nom;
	private final String prenom;
	private final String fonction;
	private final LocalDate dateNaissance;
	private final ArrayList<Telephone>	numeros;
	
	public static class Builder {
		private final String nom;
		private final String prenom;
		private final LocalDate dateNaissance;
		
		private String fonction = "Employé";
		private ArrayList<Telephone> numeros;
		
		public Builder(String nom, String prenom, LocalDate dateNaissance, Telephone numero) {
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			this.numeros = new ArrayList<Telephone>();
			numeros.add(numero);
		}
		
		public Builder fonction(String fonction) {
			this.fonction = fonction;
			return this;
		}
		
		public Builder addNumero(Telephone numero) {
			this.numeros.add(numero);
			return this;
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
	}

	public Personnel(Builder builder) {
		this.nom = builder.nom;
		this.prenom = builder.prenom;
		this.dateNaissance = builder.dateNaissance;
		this.fonction = builder.fonction;
		this.numeros = builder.numeros;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getFonction() {
		return fonction;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	
	public ArrayList<Telephone> getNumeros() {
		return new ArrayList<Telephone>(numeros);
	}
	
	@Override
	public String toString() {
		String S = this.nom + " " + this.prenom;
		S+= ", " + this.fonction;
		S+= " (" + this.dateNaissance.toString() + ")";
		S+= " [";
		for(Telephone t : numeros) {
			S+= t.toString() + ", ";
		}
		S= S.substring(0, S.length()-2);
		S+= "]";
		return S;
	}

	public Iterator<Composant> iterator() {
		return this.iterator();
	}

	public ArrayList<String> hierarchie() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(this.toString());
		return list;
	}

}
