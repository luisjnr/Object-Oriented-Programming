public class Notebook extends Eletronico implements Desconto, Garantia{
	private String processador;
	
	public Notebook(String marca, String modelo, Double preco, String processador){
		super(marca, modelo, preco);
		this.processador = processador;
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
		+ "\nPreco: R$" + this.getPreco() + "\nProcessador: " + this.processador
		+ "\nGarantia: " + this.tempoGarantia();
	}
	
	public int tempoGarantia(){
		return 6;
	}
	
	public String getProcessador(){
		return this.processador;
	}
	
	public void setProcessador(String processador){
		this.processador = processador;
	}
}
