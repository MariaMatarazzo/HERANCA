package Heranca;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	
	
	public PessoaJuridica (String nome, String telefone, String cnpj) {
		super (nome,telefone); //herdando os atributos da superclasse
		this.cnpj = cnpj;
	}
	public String getCnpj () {
		return cnpj;
	}
	public void setCpf (String cpf) {
		this.cnpj = cnpj;
	}
}
