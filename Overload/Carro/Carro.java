public class Carro{
	private double combustivel;
	
	public Carro(){
		this.combustivel = 0.0;
	}
	
	public Carro(double combustivel){
		this.combustivel = combustivel;
	}
	
	public double getCombustivel(){
		return this.combustivel;
	}
	
	public void setCombustivel(double combustivel){
		this.combustivel = combustivel;
	}
	
	public double autonomia(){
		return (this.combustivel * 12);
	}
	
	public double autonomia(String tipoCombustivel){
		if(tipoCombustivel.equalsIgnoreCase("gasolina") ||
		tipoCombustivel.equalsIgnoreCase("etanol"))
			return (tipoCombustivel.equalsIgnoreCase("gasolina") ? 
			(this.combustivel * 12) : (this.combustivel * 8));
		System.out.println("Digite um combústivel válido.");
		return 0.0;
	}
	
	public double autonomia(String tipoCombustivel, double abastecimento){
		if(tipoCombustivel.equalsIgnoreCase("gasolina") ||
		tipoCombustivel.equalsIgnoreCase("etanol")){
			this.combustivel += abastecimento;
			return (tipoCombustivel.equalsIgnoreCase("gasolina") ? 
			(this.combustivel * 12) : (this.combustivel * 8));
		}
		System.out.println("Digite um combústivel válido.");
		return 0.0;
	}
	
	public double autonomia(String tipoCombustivel, boolean carga){
		if(tipoCombustivel.equalsIgnoreCase("gasolina") ||
		tipoCombustivel.equalsIgnoreCase("etanol"))
			return (((tipoCombustivel.equalsIgnoreCase("gasolina") ?
			(this.combustivel * 12) : (this.combustivel * 8)) * 
			(carga ? 0.7 : 1)));
		System.out.println("Digite um combústivel válido.");
		return 0.0;
	}
	
	public double autonomia(String tipoCombustivel, double abastecimento, boolean carga){
		if(tipoCombustivel.equalsIgnoreCase("gasolina") ||
		tipoCombustivel.equalsIgnoreCase("etanol")){
			this.combustivel += abastecimento;
			return ((tipoCombustivel.equalsIgnoreCase("gasolina") ?
			(this.combustivel * 12) : (this.combustivel * 8)) * 
			(carga ? 0.7 : 1));
		}
		System.out.println("Digite um combústivel válido.");
		return 0.0;
	}
}
