public class Agenda {
	private String nomeDaAgenda;
	private Pessoa[] contatos;
	private int totalContatos;
	
	public Agenda(String nomeDaAgenda, int tamanho){
		this.contatos = new Pessoa[tamanho];
		this.nomeDaAgenda = nomeDaAgenda;
		this.totalContatos = 0;
	}
	
	public void setNomeDaAgenda(String nomeDaAgenda){
		this.nomeDaAgenda = nomeDaAgenda;
	}
	
	public String getNomeDaAgenda(){
		return this.nomeDaAgenda;
	}
	
	public void setContatos(Pessoa[] contatos){
		this.contatos = contatos;
	}
	
	public Pessoa[] getContatos(){
		return this.contatos;
	}
	
	public void setTotalContatos(int totalContatos){
		this.totalContatos = totalContatos;
	}
	
	public int getTotalContatos(){
		return this.totalContatos;
	}
}
