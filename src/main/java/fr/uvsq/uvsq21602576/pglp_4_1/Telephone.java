package fr.uvsq.uvsq21602576.pglp_4_1;

public class Telephone {
	private String information;
	private String numero;

	public Telephone(String num, String info) {
		this.information = info;
		this.numero = num;
	}
	
	public boolean equals(Telephone T) {
		return this.information.equals(T.getInformation()) && this.numero.equals(T.getNumero());
	}
	
	public String getInformation() {
		return information;
	}
	
	public String getNumero() {
		return numero;
	}

}
