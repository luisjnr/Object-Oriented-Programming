public class Pessoa {
	private String nome;
	private int cpf;
	private String endereco;
	private String rg;
	
	public Pessoa (String nome, int cpf, String endereco, String rg){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.rg = rg;
	} 
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
	
	public int getCpf(){
		return this.cpf;
	}
	
	public void getEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getEndereco(){
		return this.endereco;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public String getRg(){
		return this.rg;
	}
}
