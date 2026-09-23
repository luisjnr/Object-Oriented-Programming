public class SetorPessoal{
	private Funcionario[] funcionario;
	
	public SetorPessoal(int tamanho){
		this.funcionario = new Funcionario[tamanho];
	}
	
	public boolean adicionarFuncionario(Funcionario funcionario){
		for(int i = 0; i < this.funcionario.length; i++)
			if(this.funcionario[i] == null){
				this.funcionario[i] = funcionario;
				return true;
			}
		return false;
	}
	
	public boolean removerFuncionario(Funcionario funcionario){
		for (int i = 0; i < this.funcionario.length; i++){
			if(this.funcionario[i] == funcionario){
				Funcionario temp = this.funcionario[i];
				this.funcionario[i] = this.funcionario[(this.funcionario.length-1)];
				this.funcionario[(this.funcionario.length-1)] = null;
				return true;
			}
		}
		return false;
	}
	
	public Funcionario buscarFuncionario(int matricula){
		for(Funcionario temp : this.funcionario){
			if(temp != null)
				if(temp.getMatricula() == matricula)
					return temp;
		}
		return null;
	}

	public Funcionario buscarFuncionario(String nome){
		for(Funcionario temp : this.funcionario){	
			if(temp != null)
				if(temp.getNome().equalsIgnoreCase(nome))
					return temp;
			}
		return null;
	}

	public Funcionario[] listarFuncionarios(int departamento){
		int tamanho = 0;
		for(int i = 0; i < this.funcionario.length; i++){
			if(this.funcionario[i] != null)
				if(this.funcionario[i].getDepartamento() == departamento)
					tamanho++;
		}
		
		Funcionario[] lista = new Funcionario[tamanho];
		
		for(int i = 0; i < this.funcionario.length; i++){
			if(this.funcionario[i] != null)
				if(this.funcionario[i].getDepartamento() == departamento)
					lista[i] = this.funcionario[i];
		}
		return lista;
	}
	
	public Funcionario[] listarFuncionarios(String funcao){
		int tamanho = 0;
		for(int i = 0; i < this.funcionario.length; i++){
			if(this.funcionario[i] != null)
				if(this.funcionario[i].getFuncao().equalsIgnoreCase(funcao))
					tamanho++;
		}
		
		Funcionario[] lista = new Funcionario[tamanho];
		
		for(int i = 0; i < this.funcionario.length; i++){
			if(this.funcionario[i] != null)
				if(this.funcionario[i].getFuncao().equalsIgnoreCase(funcao))
					lista[i] = this.funcionario[i];
		}
		return lista;
	}
	
	public Funcionario[] listarFuncionarios(){
		return this.funcionario;
	}
}
