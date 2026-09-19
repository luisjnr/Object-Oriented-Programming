public class Consumidor{
	private String nome;
	private String cpf;
	private double renda;
	private double limiteDeCredito;
	
	public Consumidor(String nome, String cpf, double renda){
		this.nome = nome;
		this.cpf = cpf;
		this.renda = renda;
		this.calculaLimite();
	}
	
	public Consumidor(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
		this.renda = 0;
		this.calculaLimite();	
	}
	
	public void calculaLimite(){
		this.limiteDeCredito = this.renda * 2.5;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setRenda(){
		this.renda = renda;
		calculaLimite();
	}
	
	public double getRenda(){
		return this.renda;
	}
	
	public double getLimiteDeCredito(){
		return this.limiteDeCredito;	
	}
}
