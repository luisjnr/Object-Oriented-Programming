public class Residencial extends Edificacao {
	private String tipoResidencia;
	
	public Residencial(String tipoResidencia, 
	String disponibilidade, Double preco, String descricao, boolean ativo){
		super(disponibilidade, preco, descricao, ativo);
		super.setTipo('R');
		if(tipoResidencia.equalsIgnoreCase("casa"))
			this.tipoResidencia = tipoResidencia;
		else if(tipoResidencia.equalsIgnoreCase("apartamento"))
			this.tipoResidencia = tipoResidencia;
		else
			this.tipoResidencia = "Não informado.";
	}
	
	@Override
	public Double calculaPreco(){
		if(this.tipoResidencia.equalsIgnoreCase("casa") 
		&& this.getDisponibilidade().equalsIgnoreCase("locação"))
			return (super.calculaPreco() * 1.1);
		else if(this.tipoResidencia.equalsIgnoreCase("casa") 
		&& this.getDisponibilidade().equalsIgnoreCase("compra"))
			return (super.calculaPreco() * 1.05);
		else if(this.tipoResidencia.equalsIgnoreCase("apartamento") 
		&& this.getDisponibilidade().equalsIgnoreCase("locação"))
			return (super.calculaPreco() * 1.15);
		else if(this.tipoResidencia.equalsIgnoreCase("apartamento") 
		&& this.getDisponibilidade().equalsIgnoreCase("compra"))
			return (super.calculaPreco() * 1.03);
		return super.calculaPreco();
	}
	
	public String getTipoResidencia(){
		return this.tipoResidencia;
	}
	
	public void setTipoResidencia(String tipoResidencia){
		if(tipoResidencia.equalsIgnoreCase("casa"))
			this.tipoResidencia = tipoResidencia;
		else if(tipoResidencia.equalsIgnoreCase("apartamento"))
			this.tipoResidencia = tipoResidencia;
		else
			this.tipoResidencia = "Não informado.";
	}
}
