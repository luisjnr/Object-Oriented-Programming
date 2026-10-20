public class Vip extends Ingresso{
	private Double adicional;
	
	public Vip(Double valor, Double adicional){
		super(valor);
		this.adicional = adicional;
	}
	
	@Override
	public String mostraValor(){
		return Double.toString((this.getValor() + this.adicional));
	}
	
	public void setAdicional(){
		this.adicional = adicional;
	}
	
	public Double getAdicional(){
		return this.adicional;
	}
}
