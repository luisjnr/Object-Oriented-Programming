public class Fornecedor extends Pessoa {
	private Double credito;
	private Double divida;
	
	public Double obterSaldo(){
		return (credito - divida);
	}
	
	public void setCredito(Double credito){
		this.credito = credito;
	}
	
	public Double getCredito(){
		return this.credito = credito;
	}
	
	public void setDivida(Double divida){
		this.divida = divida;
	}
	
	public Double getDivida(){
		return this.divida;
	}
}
