package model;

public class Dependentes {

	private String nome;
	private String cpf;
	private String cpf_func;

	public Dependentes(String nome, String cpf, String cpf_func) {
		this.nome=nome;
		this.cpf=cpf;
		this.cpf_func=cpf_func;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf_func() {
		return cpf_func;
	}

	public void setCpf_func(String cpf_func) {
		this.cpf_func = cpf_func;
	}
	
	
	@Override
    public String toString(){
        return "Nome do Dependente: " + this.nome + "\n"
                + "Cpf do Dependente: " + this.cpf + "\n"
                + "Cpf do funcionário " +this.cpf_func;
    }
	
}