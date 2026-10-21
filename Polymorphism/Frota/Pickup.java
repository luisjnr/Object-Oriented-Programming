public class Pickup extends Carro{
	private int capacidadeCarga;
	private int pesoCarga;
	
	public Pickup(int passageiros, int combustivel, Double rendimento,
	boolean cambioAutomatico, int capacidadeCarga, int pesoCarga){
		super(passageiros, combustivel, rendimento, cambioAutomatico);
		this.capacidadeCarga = capacidadeCarga;
		if(pesoCarga <= this.capacidadeCarga)
			this.pesoCarga = pesoCarga;
		else
			this.pesoCarga = this.capacidadeCarga;
	}
	
	@Override
	public Double autonomia(){
		if(this.pesoCarga == 0)
			return super.autonomia();
		else if(this.pesoCarga == this.capacidadeCarga)
			return (super.autonomia() / 2);
		return (super.autonomia() * 0.75);
	}
	
	public void setCapacidadeCarga(int capacidadeCarga){
		if(pesoCarga <= this.capacidadeCarga)
			this.pesoCarga = pesoCarga;
		else
			this.pesoCarga = this.capacidadeCarga;
	}
	
	public int getCapacidadeCarga(){
		return this.capacidadeCarga;
	}
	
	public void setPesoCarga(int pesoCarga){
		this.pesoCarga = pesoCarga;
	}
	
	public int getPesoCarga(){
		return this.pesoCarga;
	}
}
