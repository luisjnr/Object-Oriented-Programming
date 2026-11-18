public class FoneDeOuvido extends Eletronico implements Desconto {
	private String tipoConexao;
	
	public FoneDeOuvido(String marca, String modelo, Double preco, String tipoConexao){
		super(marca, modelo, preco);
		this.tipoConexao = tipoConexao;
	}
	
	public Double aplicarDesconto(Double porcentagem){
		return (precoFinal() * ((100 - porcentagem) / 100));
	}
	
	@Override
	public Double precoFinal(){
		return this.getPreco();
	}
	
	@Override
	public String detalhar(){
		return "Marca: " + this.getMarca() + "\nModelo: " + this.getModelo()
		+ "\nPreco: R$" + this.getPreco() + "\nConexão: " + this.tipoConexao;
	}
	
	public String getTipoConexao(){
		return this.tipoConexao;
	}
	
	public void setTipoConexao(String tipoConexao){
		this.tipoConexao = tipoConexao;
	}
}
