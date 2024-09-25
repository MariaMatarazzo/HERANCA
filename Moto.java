package Heranca;

public class Moto extends Veiculo {
private int cilindrada;
	
	
	public Moto (String marca, String modelo, int ano,String cor,int cilindrada) {
		super (ano,marca,modelo,cor); //herdando os atributos da superclasse
		this.cilindrada = cilindrada;
	}
	public int getcilindrada () {
		return cilindrada;
	}
	public void setcilindrada (int cilindrada) {
		this.cilindrada = cilindrada;
	}
}


