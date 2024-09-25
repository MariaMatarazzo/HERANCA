package Heranca;

import Construtores_11_09.Consulta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//CRIANDO UMA PESSOA
		System.out.println ("/////PESSOA/////");
		Pessoa pessoa = new Pessoa ("Joao da Silva","(15)98765-6789");
		System.out.println("\n pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());

		//CRIANDO PESSOA FISICA

		System.out.println ("/////PESSOA FISICA/////");
		PessoaFisica pessoaFisica = new PessoaFisica ("Joao da Silva","(15)98765-6789","787654345678","123.432.546.09");
		System.out.println("\n pessoa Fisica: ");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("Telefone: " + pessoaFisica.getRg());

		//CRIANDO PESSOA JURIDICA

		System.out.println ("/////PESSOA JURIDICA/////");
		PessoaJuridica pessoaJuridica = new PessoaJuridica ("Empresa M&M","(11)98795-9834","78765434/87654-09");
		System.out.println("\n Pessoa Juridica:  ");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("cnpj: " + pessoaJuridica.getCnpj());

	}

}
