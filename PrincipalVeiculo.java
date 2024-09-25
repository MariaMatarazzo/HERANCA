package Heranca;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CRIANDO UMA PESSOA
		System.out.println ("/////Veiculo/////");
		Veiculo veiculo = new Veiculo (2024,"Chevrolet","Onix","Branco");
		System.out.println("\n Veiculo: ");
		System.out.println("Nome: " + veiculo.getAno());
		System.out.println("Marca: " + veiculo.getmarca());
		System.out.println("Modelo: " + veiculo.getmodelo());
		System.out.println("Cor: " + veiculo.getCor());
		

		//CRIANDO AUTOMOVEL

		System.out.println ("/////AUTOMOVEL/////");
		Automovel automovel = new Automovel ("Chevrolet","Onix",2024,"Branco",4,"1.4L de 106 cv");
		System.out.println("Automovel: ");
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Marca: " + automovel.getmarca());
		System.out.println("Modelo: " + automovel.getmodelo());
		System.out.println("Cor: " + automovel.getCor());
		System.out.println("Numero de Portas: " + automovel.getnumeroPortas());
		System.out.println("Motor: " + automovel.getmotor());
		

		//CRIANDO MOTO

		System.out.println ("/////PESSOA JURIDICA/////");
		Moto moto = new Moto ("GS1200","1200R",2024,"Branco",1200);
		System.out.println("Moto:  ");
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Marca: " + moto.getmarca());
		System.out.println("Modelo: " + moto.getmodelo());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Modelo: " + moto.getcilindrada());

	}

}
