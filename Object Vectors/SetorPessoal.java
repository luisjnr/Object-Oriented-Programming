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
		for(int i = 0; i < this.funcionario.length; i++)
			if(this.funcionario[i] == funcionario){
				this.funcionario[i] = null;
				return true;
			}
		return false;
	}
	
	public Funcionario buscarFuncionario(int matricula){
		for(Funcionario temp : this.funcionario)	
			if(temp.getMatricula() == matricula)
				return temp;
		return null;
	}

	public Funcionario buscarFuncionario(String nome){
		for(Funcionario temp : this.funcionario)	
			if(temp.getNome().equalsIgnoreCase(nome))
				return temp;
		return null;
	}

	public Funcionario[] listarFuncionarios(int departamento){
		Funcionario[] lista = new Funcionario[this.funcionario.length];
		for(int i = 0; i < this.funcionario.length; i++)
			if(this.funcionario[i].getDepartamento() == departamento)
				lista[i] = this.funcionario[i];
		return lista;
	}
	
	public Funcionario[] listarFuncionarios(String funcao){
		Funcionario[] lista = new Funcionario[this.funcionario.length];
		for(int i = 0; i < this.funcionario.length; i++)
			if(this.funcionario[i].getFuncao().equalsIgnoreCase(funcao))
				lista[i] = this.funcionario[i];
		return lista;
	}
	
	public Funcionario[] listarFuncionarios(){
		return this.funcionario;
	}
}
