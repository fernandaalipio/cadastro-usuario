package model;

public class Supervisor extends Funcionarios{


	public Supervisor(String nome, String endereco, String telefone, Dependentes dependentes, float salario, String cpf) {
		super(nome, endereco, telefone, dependentes, salario, cpf);	
	}
	
	private String setor;
	private String equipe;

	public String getSetor() {
		return setor;
	}
	
	public void setSetor (String setor) {
		this.setor=setor;
	}
	
	public String getEquipe () {
		return equipe;
	}
	
	public void setEquipe (String equipe) {
		this.equipe=equipe;
	}
	
	
	public void Supervisionar (Dev_Pleno dev) {
		
	}
	
	
	
	
	}
	
	

