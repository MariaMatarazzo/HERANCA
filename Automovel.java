package Heranca;

public class Automovel extends Veiculo {
	
	private int numeroPortas;
	private String motor;

	//Construtor
	public Automovel (String marca, String modelo, int ano,String cor,int numeroPortas,String motor) {
		super (ano,marca,modelo,cor); //herdando os atributos da superclasse
		this.numeroPortas = numeroPortas;
		this.motor = motor;
	}
	public int getnumeroPortas () {
		return numeroPortas;
	}
	public void setnumeroPortas (int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public String getmotor () {
		return motor;
	}
	public void setmotor (String motor) {
		this.motor = motor;
	}
}


