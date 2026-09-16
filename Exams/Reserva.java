public class Reserva {
	private int codigo, diarias;
	private String nomeHospede;
	private boolean incluiRefeicoes;
	
	public int getCodigo(){
		return this.codigo;
	}
	
	public int getDiarias(){
		return this.diarias;
	}
	
	public String nomeHospede(){
		return this.nomeHospede;			
	}
	
	public boolean incluiRefeicoes(){
		return this.incluiRefeicoes;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;	
	}
	
	public void setDiarias(int diarias){
		this.diarias = diarias;
	}
	
	public void setNomeHospede(String nomeHospede){
		this.nomeHospede = nomeHospede;
	}
	
	public void setIncluiRefeicoes(boolean incluiRefeicoes){
		this.incluiRefeicoes = incluiRefeicoes;
	}
}
