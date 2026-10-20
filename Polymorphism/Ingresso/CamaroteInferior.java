public class CamaroteInferior extends Vip {
	private String localizacao;
	
	public CamaroteInferior(Double valor, Double adicional, String localizacao){
		super(valor, adicional);
		this.localizacao = localizacao;
	}
	
	@Override
	public String mostraValor(){
		if(this.localizacao.equalsIgnoreCase("lateral"))
		return Double.toString(((this.getValor() + this.getAdicional()) * 1.2));
		else if(this.localizacao.equalsIgnoreCase("frontal"))
		return Double.toString(((this.getValor() + this.getAdicional()) * 1.35));
		return Double.toString(0.0);
	}
	
	public void setLocalizacao(String localizacao){
		this.localizacao = localizacao;
	}
	
	public String getLocalizacao(){
		return this.localizacao;
	}
}
