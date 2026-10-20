public class Reserva {
	private int codigo, diarias;
	private String nomeHospede;
	private boolean incluiRefeicoes;
	
	public Reserva(int codigo, String nomeHospede, int diarias){
		this.codigo = codigo;
		this.nomeHospede = nomeHospede;
		this.diarias = diarias;
		this.incluiRefeicoes = false;
	}
	
	public Reserva(int codigo, String nomeHospede, int diarias, boolean incluiRefeicoes){
		this.codigo = codigo;
		this.nomeHospede = nomeHospede;
		this.diarias = diarias;
		this.incluiRefeicoes = true;	
	}
	
	public double calcularDiaria(){
		return ((200 * this.diarias) + 
		(this.diarias * (this.incluiRefeicoes ? 50 : 0)));
	}
	
	public double calcularDiaria(double taxaLimpeza){
		return ((200 * this.diarias) + 
		(this.diarias * (this.incluiRefeicoes ? 50 : 0)) + taxaLimpeza);
	}
	
	public double adicionarPasseio(String tipo){
		if(tipo.equalsIgnoreCase("cavalgada"))
			return 80.0;
		else if(tipo.equalsIgnoreCase("trilha"))
			return 60.0;
		else if(tipo.equalsIgnoreCase("pesca"))
			return 70.0;
		return 0.0;
	}
	
	public double adicionarPasseio(String tipo, int quantidade){
		if(tipo.equalsIgnoreCase("cavalgada"))
			return (80.0 * quantidade);
		else if(tipo.equalsIgnoreCase("trilha"))
			return (60.0 * quantidade);
		else if(tipo.equalsIgnoreCase("pesca"))
			return (70.0 * quantidade);
		return 0.0;
	}
	
	public String exibirReserva(){
		return "Reserva [" + this.codigo + "] - Hospede: [" 
		+ this.nomeHospede + "] - Diárias: [" + this.diarias + "]/n";
	}
	
	public String exibirReserva(boolean comDetalhes){
		return "Reserva [" + this.codigo + "] - Hospede: [" 
		+ this.nomeHospede + "] - Diárias: [" + this.diarias + 
		"] - Refeições inclusas: [" + (this.incluiRefeicoes ? "Sim" : "Não")
		 + "]/n";
	}
		
	public int getCodigo(){
		return this.codigo;
	}
	
	public int getDiarias(){
		return this.diarias;
	}
	
	public String getNomeHospede(){
		return this.nomeHospede;			
	}
	
	public boolean getIncluiRefeicoes(){
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
