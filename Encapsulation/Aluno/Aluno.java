public class Aluno {
	private String nome, situacao;
	private double nota1, nota2, media;
	private int matricula;
	
	public Aluno(String nome, int matricula, double nota1, double nota2){
		setNome(nome);
		setMatricula(matricula);
		setNota1(nota1);
		setNota2(nota2);
		setMedia(media());
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setSituacao(String situacao){
		this.situacao = situacao;
	}
	
	public void setNota1(double nota){
		this.nota1 = nota;
	}
	
	public void setNota2(double nota){
		this.nota2 = nota;
	}
	
	public void setMedia(double media){
		this.media = media;
		verificaSituacao();
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getSituacao(){
		return this.situacao;
	}
	
	public double getNota1(){
		return this.nota1;
	}
	
	public double getNota2(){
		return this.nota2;
	}
	
	public double getMedia(){
		return this.media;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
	
	public double media(){
		return (this.nota1 + this.nota2) / 2;
	}
	
	private void verificaSituacao(){
		this.situacao = this.media >= 6 ? "Aprovado." : "Reprovado.";
	}
	
	public String resultadoFinal(){
		return "Aluno: " + this.nome + ", Matrícula: " 
		+ this.matricula + ", Média: " + this.media + 
		", Situação: " + this.situacao;
	}
}
