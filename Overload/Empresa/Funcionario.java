public class Funcionario {
	private String nome;
	private double salarioBase;
	private int tempoDeServico;
	
	public Funcionario(String nome, double salarioBase, int tempoDeServico){
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.tempoDeServico = tempoDeServico;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public double getSalarioBase(){
		return this.salarioBase;
	}
	
	public int getTempoDeServico(){
		return this.tempoDeServico;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setSalarioBase(double salarioBase){
		this.salarioBase = salarioBase;
	}
	
	public void setTempoDeServico(int tempoDeServico){
		this.tempoDeServico	= tempoDeServico;
	}
	
	public double mostraSalario(){
		if(this.tempoDeServico <= 10)
			return (this.salarioBase * 1.12);
		return (this.salarioBase * 1.17);
	}
	
	public double mostraSalario(double totalDeVendas){
		if(this.tempoDeServico <= 10)
			return ((this.salarioBase * 1.05) + totalDeVendas * 1.015);
		return ((this.salarioBase * 1.1) + totalDeVendas * 1.02);
	}
}
