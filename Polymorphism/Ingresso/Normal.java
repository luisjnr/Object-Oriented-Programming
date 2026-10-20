public class Normal extends Ingresso {
	private boolean pista;
	
	public Normal(Double valor, boolean pista){
		super(valor);
		this.pista = pista;
	}

	@Override
	public String mostraValor(){
		return Double.toString((this.pista ? (this.getValor() * 1.1) : this.getValor()));
	}
	
	public void setPista(boolean pista){
		this.pista = pista;
	}
	
	public boolean getPista(){
		return this.pista;
	}
}
