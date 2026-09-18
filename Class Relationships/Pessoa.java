public class Pessoa{
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private double renda;
	
	public Pessoa(String nome, String cpf, String endereco, String telefone, double renda){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.renda = 0.0;
	}
	
	public Pessoa(String nome, String cpf, String endereco, String telefone){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.renda = 0.0;
	}
	
	public String informacoes(){
		return "Nome: [" + this.nome + "] - Cpf: [" + this.cpf + 
		"] - Endereço: [" + this.endereco + "] - Telefone: [" +
		this.telefone + "] - Renda: [R$" + this.renda + "]\n";	
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public void setRenda(double renda){
		this.renda = renda;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public String getEndereco(){
		return this.endereco;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	public double getRenda(){
		return this.renda;
	}
}
