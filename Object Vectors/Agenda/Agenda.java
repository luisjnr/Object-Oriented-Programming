public class Agenda {
	private String nomeDaAgenda;
	private Pessoa[] contatos;
	private int totalContatos;
	
	public Agenda(String nomeDaAgenda, int tamanho){
		this.contatos = new Pessoa[tamanho];
		this.nomeDaAgenda = nomeDaAgenda;
		this.totalContatos = 0;
	}
	
	public boolean adicionaPessoa(Pessoa pessoa){
		if(pessoa == null)
			return false;
		if(buscaContato(pessoa.getNome()) != null)
			return false;
		for (int i = 0; i < this.contatos.length; i++)
			if (this.contatos[i] == null){
				this.contatos[i] = pessoa;
				this.totalContatos++;
				return true;
			}
		return false;
	}
	
	public boolean removePessoa(Pessoa pessoa){
		if(pessoa == null)	
			return false;
		for (int i = 0; i < this.contatos.length; i++)
			if (this.contatos[i] == pessoa){
				for (int j = i; j < (contatos.length-1); j++)
					contatos[j] = contatos[j+1];
				contatos[contatos.length - 1] = null;
				this.totalContatos--;
				return true;
			}
		return false;
	}
	
	public boolean alteraInformacoes(Pessoa pessoa){
		if(pessoa == null)
			return false;
		for (int i = 0; i < contatos.length; i++){
			if(contatos[i] == null) 
				continue;
			if(contatos[i].getNome().equalsIgnoreCase(pessoa.getNome())){
				contatos[i] = pessoa;
				return true;
			}
		}
		return false;
	}
		
	public Pessoa[] buscaPessoas(){
		if(this.totalContatos == 0)
			return null;
		Pessoa[] pessoas = new Pessoa[this.totalContatos];
		int i = 0;
		for (Pessoa pessoa : this.contatos)
			if(pessoa != null)
				pessoas[i++] = pessoa;
		return pessoas;
	}
	
	public Pessoa buscaContato(String nome){
		if(nome == null)
			return null;
		Pessoa pessoa;
		for (int i = 0; i < this.totalContatos; i++){
			if(contatos[i] == null)
				continue;
			if(contatos[i].getNome().equalsIgnoreCase(nome)){
				pessoa = contatos[i];
				return pessoa;
			}
		}
		return null;
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
