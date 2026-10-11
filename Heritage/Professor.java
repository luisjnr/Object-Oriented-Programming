public class Professor extends PessoaEscola {
	private String disciplina;
	private Double valorHoraAula;
	private int quantidadeHoras;
	
	public Professor(String nome, String cpf, String telefone, 
	String disciplina, Double valorHoraAula, int quantidadeHoras){
		super(nome, cpf, telefone);
		this.disciplina = disciplina;
		this.valorHoraAula = valorHoraAula;
		this.quantidadeHoras = quantidadeHoras;
	}
	
	public Double calculaPagamento(){
		return (this.valorHoraAula * this.quantidadeHoras);
	}
	
	public void setDisciplina(String disciplina){
		this.disciplina = disciplina;
	}
	
	public String getDisciplina(){
		return this.disciplina;
	}
	
	public void setValorHoraAula(Double valorHoraAula){
		this.valorHoraAula = valorHoraAula;
	}
	
	public Double getValorHoraAula(){
		return this.valorHoraAula;
	}
	
	public void setQuantidadeHoras(int quantidadeHoras){
		this.quantidadeHoras = quantidadeHoras;
	}
	
	public int getQuantidadeHoras(){
		return this.quantidadeHoras;
	}
}
