public class Smartphone extends Eletronico implements Desconto, Garantia {
	private int capacidadeArmazenamento;
	
	public Smartphone(String marca, String modelo, Double preco, int capacidadeArmazenamento){
		super(marca, modelo, preco);
		this.capacidadeArmazenamento = capacidadeArmazenamento;
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
		+ "\nPreco: R$" + this.getPreco() + "\nArmazenamento: " + this.capacidadeArmazenamento
		+ "\nGarantia: " + this.tempoGarantia();
	}
	
	public int tempoGarantia(){
		return 6;
	}
	
	public int getCapacidadeArmazenamento(){
		return this.capacidadeArmazenamento;
	}
	
	public void setCapacidadeArmazenamento(int capacidadeArmazenamento){
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
	
}
