public class Ingresso {
	private Double valor;
	
	public Ingresso(Double valor){
		this.valor = valor;
	}
	
	public String mostraValor(){
		return Double.toString(this.valor);
	}
	
	public void setValor(Double valor){
		this.valor = valor;
	}
	
	public Double getValor(){
		return this.valor;
	}
}
