package Heranca;

public class Veiculo {

	private int ano;
	private String marca;
	private String modelo;
	private String cor;


	//Construtor
	public Veiculo (int ano, String marca,String modelo,String cor) {
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;

	}
	public int getAno () {
		return ano;
	}
	public void setAno (int ano) {
		this.ano = ano;
	}
	public String getmarca () {
		return marca;
	}
	public void setmarca(String marca) {
		this.marca = marca;
	}
	public String getmodelo () {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;

	}

}
