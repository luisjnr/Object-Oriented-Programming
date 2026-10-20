public class Carro {
	private double combustivel, quilometragem;
	
	public Carro(double combustivel){
		setCombustivel(combustivel);
		setQuilometragem(0.0);
	}
	
	public void percorrerDistancia(int distancia){
		if((getCombustivel() * 12) >= distancia){
			setCombustivel((getCombustivel() - ((double)distancia / 12)));
			setQuilometragem((getQuilometragem() + distancia));
		}
		else
			System.out.println("Combústivel insuficiente.");
	}

	public void abastecer(double litros){
		setCombustivel((getCombustivel() + litros));
	}
	
	public double autonomia(){
		return (getCombustivel() * 12);
	}
	
	public double getCombustivel(){
		return this.combustivel;
	}
	
	public double getQuilometragem(){
		return this.quilometragem;
	}
	
	public void setCombustivel(double combustivel){
		this.combustivel = combustivel;
	}
	
	public void setQuilometragem(double quilometragem){
		this.quilometragem = quilometragem;
	}
}
