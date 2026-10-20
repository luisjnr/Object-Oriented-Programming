public class Pessoa{
	
	private String nome, sexo;
	private int mesDeNascimento = 0, anoDeNascimento = 0;
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	public Pessoa(String nome, String sexo, int mesDeNascimento, int anoDeNascimento){
		this.nome = nome;
		this.sexo = sexo;
		this.mesDeNascimento = mesDeNascimento;
		this.anoDeNascimento = anoDeNascimento;	
	}
	
	public String mostraIdade(){ 
		if(this.anoDeNascimento > 2018)
			return "Essa pessoa nasceu após a data de referência.";
		else if(this.anoDeNascimento == 2018)
			return "0";
		return Integer.toString(((2018 - this.anoDeNascimento) - 
		(this.mesDeNascimento < 10 ? 1 : 0)));
	}
	
	public String mostraIdade(int mes, int ano){
		if(this.anoDeNascimento > 2018)
			return "Essa pessoa nasceu após a data de referência.";
		else if(this.anoDeNascimento == 2018)
			return "0";
		return Integer.toString(((ano - this.anoDeNascimento) - 
		(this.mesDeNascimento < mes ? 1 : 0)));
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getSexo(){
		return this.sexo;
	}
	
	public int getMesDeNascimento(){
		return this.mesDeNascimento;
	}
	public int getAnoDeNascimento(){
		return this.anoDeNascimento;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public void setAnoDeNascimento(int anoDeNascimento){
		this.anoDeNascimento = anoDeNascimento;
	}
	
	public void setMesDeNascimento(int mesDeNascimento){
		this.mesDeNascimento = mesDeNascimento;
	}
}
