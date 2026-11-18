public class Auxiliar extends Funcionario{
	private String setor;
	
	public Auxiliar(int registro, String setor, String nome, Double salario){
		super(nome, salario, registro);
		if(setor.equalsIgnoreCase("acervo"))
			this.setor = setor;
		else if(setor.equalsIgnoreCase("limpeza"))
			this.setor = setor;
		else
			this.setor = "Nao informado.";
	}
	
	@Override
	public Double calculaSalario(){
		if(setor.equalsIgnoreCase("acervo"))
			return ((this.getSalario() * 1.15) * 0.9);
		else if(setor.equalsIgnoreCase("limpeza"))
			return ((this.getSalario() * 1.05) * 0.9);
		return super.calculaSalario();
	}
	
	public String organizarLivros(String genero){
		return "Livros de " + genero + " organizados no " + this.setor + ".";
	}
	
	public String getSetor(){
		return this.setor;
	}
	
	public void setSetor(String setor){
		if(setor.equalsIgnoreCase("acervo"))
			this.setor = setor;
		else if(setor.equalsIgnoreCase("limpeza"))
			this.setor = setor;
		else
			this.setor = "Nao informado.";
	}
}
