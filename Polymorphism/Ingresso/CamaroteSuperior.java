public class CamaroteSuperior extends Vip{
	private char classe;
	
	public CamaroteSuperior(Double valor, Double adicional, char classe){
		super(valor, adicional);
		this.classe = classe;
	}
	
	@Override
	public String mostraValor(){
		if(this.classe == 'A')
			return Double.toString(((this.getValor() + this.getAdicional()) * 1.75));
		else if(this.classe == 'B')
			return Double.toString(((this.getValor() + this.getAdicional()) * 1.5));
		return Double.toString(0.0);
	}
	
	public void setClasse(char classe){
		this.classe = classe;
	}
	
	public char getClasse(){
		return this.classe;
	}
}
