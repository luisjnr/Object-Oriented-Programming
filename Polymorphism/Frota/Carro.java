public class Carro extends Veiculo {
	private boolean cambioAutomatico;
	
	public Carro(int passageiros, int combustivel, Double rendimento, boolean cambioAutomatico){
		super(passageiros, combustivel, rendimento);
		this.cambioAutomatico = cambioAutomatico;
	}
	
	@Override
	public Double autonomia(){
		return (this.cambioAutomatico ? (super.autonomia() * 0.9) : super.autonomia());
	}
	
	public void setCambioAutomatico(boolean cambioAutomatico){
		this.cambioAutomatico = cambioAutomatico;
	}
	
	public boolean getCambioAutomatico(){
		return this.cambioAutomatico;
	}
}
