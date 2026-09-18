public class Pessoa{
	private String nome;
	private String sexo;
	private Data nascimento;
	
	public Pessoa(String nome){
		this.nome = nome;
		this.sexo = "Não declarado.";
		this.nascimento = new Data(1, 1, 2000);
	}
	
	public Pessoa(String nome, String sexo, Data nascimento){
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento;
	}
	
	public String mostraIdade(Data hoje){
		if(nascimento.getAno() > hoje.getAno())
			return "Essa pessoa nasceu após a data de referência.";
		else if(nascimento.getAno() == hoje.getAno())
			return "0";
		int idade = (hoje.getAno() - nascimento.getAno());
		if(hoje.getMes() < nascimento.getMes())
			idade--;
		else if(hoje.getDia() < nascimento.getDia())
			idade--;
		return Integer.toString(idade);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public String getSexo(){
		return this.sexo;
	}
	
	public void setNascimento(Data nascimento){
		this.nascimento = nascimento;
	}
	
	public Data getNascimento(){
		return this.nascimento;
	}
}
