package model;

public class Funcionarios {

	private String nome;
	private String endereco;
	private String telefone;
	private Dependentes dependentes;
	private float salario;
	private String cpf;
	
	public Funcionarios(String nome, String endereco, String telefone, Dependentes dependentes, float salario, String cpf) {
    this.nome=nome;
    this.endereco=endereco;
    this.telefone=telefone;
    this.dependentes=dependentes;
    this.salario=salario;
    this.cpf=cpf;
    
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Dependentes getDependentes() {
		return this.dependentes;
	}


	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	@Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Endereço: " + endereco + "\n"
                + "Telefone: " + telefone + "\n"
                + "Dependente: \n" + dependentes.toString()+"\n"
                + "Salário : " + salario +"\n"
                + " Cpf: " +cpf;
        
    }
}
	
	

