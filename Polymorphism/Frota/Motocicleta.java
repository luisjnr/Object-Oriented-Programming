public class Motocicleta extends Veiculo {
	private int cilindrada;
	
	public Motocicleta(int passageiros, int combustivel, Double rendimento, int cilindrada){
		super(passageiros, combustivel, rendimento);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public Double autonomia(){
		return (super.autonomia() / this.getPassageiros());
	}
	
	public void setCilindrada(int cilindrada){
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada(){
		return this.cilindrada;
	}
}
