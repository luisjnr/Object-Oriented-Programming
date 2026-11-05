public class Edificacao extends Imovel {
	protected String disponibilidade;
	
	public Edificacao(String disponibilidade, Double preco, 
	String descricao,boolean ativo){
		super(preco, descricao, ativo);
		if(disponibilidade.equalsIgnoreCase("compra"))
			this.disponibilidade = disponibilidade;
		else if(disponibilidade.equalsIgnoreCase("locação"))
			this.disponibilidade = disponibilidade;
		else
			this.disponibilidade = "Não informado.";
	}
	
	public String getDisponibilidade(){
		return this.disponibilidade;
	}
	
	public void setDisponibilidade(String disponibilidade){
		if(disponibilidade.equalsIgnoreCase("compra"))
			this.disponibilidade = disponibilidade;
		else if(disponibilidade.equalsIgnoreCase("locação"))
			this.disponibilidade = disponibilidade;
		else
			this.disponibilidade = "Não informado.";
	}
}
