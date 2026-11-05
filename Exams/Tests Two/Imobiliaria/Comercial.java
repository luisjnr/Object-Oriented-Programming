public class Comercial extends Edificacao {
	private String localizacao;
	
	public Comercial(String localizacao, String disponibilidade,
	Double preco, String descricao, boolean ativo){
		super(disponibilidade, preco, descricao, ativo);
		super.setTipo('C');
		if(localizacao.equalsIgnoreCase("bairro"))
			this.localizacao = localizacao;
		else if(localizacao.equalsIgnoreCase("centro"))
			this.localizacao = localizacao;
		else 
			this.localizacao = "Não informado.";
	}
	
	@Override
	public Double calculaPreco(){
		if(this.localizacao.equalsIgnoreCase("bairro") 
		&& this.getDisponibilidade().equalsIgnoreCase("locação"))
			return (super.calculaPreco() * 1.05);
		else if(this.localizacao.equalsIgnoreCase("bairro") 
		&& this.getDisponibilidade().equalsIgnoreCase("compra"))
			return (super.calculaPreco() * 1.07);
		else if(this.localizacao.equalsIgnoreCase("centro") 
		&& this.getDisponibilidade().equalsIgnoreCase("locação"))
			return (super.calculaPreco() * 1.15);
		else if(this.localizacao.equalsIgnoreCase("centro") 
		&& this.getDisponibilidade().equalsIgnoreCase("compra"))
			return (super.calculaPreco() * 1.2);
		return super.calculaPreco();
	}
	
	public String getLocalizacao(){
		return this.localizacao;
	}
	
	public void setLocalizacao(){
		if(localizacao.equalsIgnoreCase("bairro"))
			this.localizacao = localizacao;
		else if(localizacao.equalsIgnoreCase("centro"))
			this.localizacao = localizacao;
		else 
			this.localizacao = "Não informado.";
	}
}
	
