package model;

public class Dev_Pleno extends Funcionarios {

	public Dev_Pleno(String nome, String endereco, String telefone, Dependentes dependentes, float salario, String cpf) {
		super(nome, endereco, telefone, dependentes, salario, cpf);
		
	}
	
	private String linguagem;
	
	public String getLinguagem () {
		return linguagem;
	}
	
	public void setLinguagem (String linguagem) {
		this.linguagem=linguagem;
	}
	
	
	public void  orientar(Dev_jun dev_jun) {
		
	}

}
