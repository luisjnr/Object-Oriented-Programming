public class Empregado extends Pessoa {
	private int codigoSetor;
	private Double salarioBase;
	private Double imposto;
	
	public Empregado(String nome, String endereco, String telefone,
	int codigoSetor, Double salarioBase, Double imposto){
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public Double calculaSalario(){
		return (salarioBase * ((100 - imposto) / 100));
	}
	
	public void setCodigoSetor(int codigoSetor){
		this.codigoSetor = codigoSetor;
	}
	
	public int getCodigoSetor(){
		return this.codigoSetor;
	}
	
	public void setSalarioBase(Double salarioBase){
		this.salarioBase = salarioBase;
	}
	
	public Double getSalarioBase(){
		return this.salarioBase;
	}
	
	public void setImposto(Double imposto){
		this.imposto = imposto;
	}
	
	public Double getImposto(){
		return this.imposto;
	} 
}
