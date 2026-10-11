public class PessoaEscola {
	private String nome;
	private String cpf;
	private String telefone;
	
	public PessoaEscola(String nome, String cpf, String telefone){
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;	
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
	
	public void setTelefone(){
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
}
