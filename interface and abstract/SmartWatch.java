public class SmartWatch extends Eletronico implements Garantia {
	private boolean resistenteAgua;
	
	public SmartWatch(String marca, String modelo, Double preco, boolean resistenteAgua){
		super(marca, modelo, preco);
		this.resistenteAgua = resistenteAgua;
	}
	
	@Override
	public Double precoFinal(){
		return this.getPreco();
	}
	
	@Override
	public String detalhar(){
		return "Marca: " + this.getMarca() + "\nModelo: " + this.getModelo()
		+ "\nPreco: R$" + this.getPreco() + "\nResistência a água: " + 
		(this.resistenteAgua ? "Sim " : "Não ") + "\nGarantia: " + this.tempoGarantia();
	}
	
	public int tempoGarantia(){
		return (this.resistenteAgua ? 24 : 12);
	}
	
	public boolean isResistenteAgua(){
		return this.resistenteAgua;
	}
	
	public void setResistenteAgua(){
		this.resistenteAgua = resistenteAgua;	
	}
}
