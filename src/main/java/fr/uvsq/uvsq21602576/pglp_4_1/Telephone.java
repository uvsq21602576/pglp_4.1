package fr.uvsq.uvsq21602576.pglp_4_1;

public class Telephone {
	private String information;
	private String numero;

	public Telephone(String num, String info) {
		this.information = info;
		this.numero = num;
	}
	
	@Override
	public boolean equals(Object O) {
		if(!(O instanceof Telephone))
			return false;
		else {
			Telephone T = (Telephone) O;
			return this.information.equals(T.getInformation()) && this.numero.equals(T.getNumero());
		}
	}
	
	public String getInformation() {
		return information;
	}
	
	public String getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return "(" + this.information + ") " + this.numero;
	}

}
