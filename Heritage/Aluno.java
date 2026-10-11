public class Aluno extends PessoaEscola{
	private String matricula;
	private String curso;
	private Double nota1;
	private Double nota2;
	
	public Aluno(String nome, String cpf, String telefone,
	String matricula, String curso, Double nota1, Double nota2){
		super(nome, cpf, telefone);
		this.matricula = matricula;
		this.curso = curso;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public Double calculaMedia(){
		return ((this.nota1 + this.nota2) / 2);
	}
	
	public String situacao(){
		return (this.calculaMedia() >= 6 ? "Aprovado." : "Reprovado");
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public void setCurso(String curso){
		this.curso = curso;
	}
	
	public String getCurso(){
		return this.curso;
	}
	
	public void setNota1(Double nota1){
		this.nota1 = nota1;
	}
	
	public Double getNota1(){
		return this.nota1;
	}
	
	public void setNota2(){
		this.nota2 = nota2;
	}
	
	public Double getNota2(){
		return this.nota2;
	}
}
