public class Funcionario{
	private int matricula;
	private String nome;
	private int departamento;
	private Double salario;
	private String funcao;
	
	public Funcionario(int matricula, String nome, 
	int departamento, Double salario, String funcao){
		this.matricula = matricula;
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.funcao = funcao;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
					
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setDepartamento(int departamento){
		this.departamento = departamento;
	}
	
	public int getDepartamento(){
		return this.departamento;
	}
	
	public void setSalario(Double salario){
		this.salario = salario;
	}
	
	public Double getSalario(){
		return this.salario;
	}
	
	public void setFuncao(String funcao){
		this.funcao = funcao;
	}
	
	public String getFuncao(){
		return this.funcao;
	}
}
