public class Biblioteca {
	private Funcionario[] funcionarios = new Funcionario[10];
	
	public boolean adicionaFuncionario(Bibliotecario bibliotecario){
		for (int i = 0; i < this.funcionarios.length; i++)
			if(this.funcionarios[i] == null){
				this.funcionarios[i] = bibliotecario;
				return true;
			}
		return false;
	}
	
	public boolean adicionaFuncionario(Auxiliar auxiliar){
		for (int i = 0; i < this.funcionarios.length; i++)
			if(this.funcionarios[i] == null){
				this.funcionarios[i] = auxiliar;
				return true;
			}
		return false;		
	}
	
	public boolean adicionaFuncionario(Atendente atendente){
		for (int i = 0; i < this.funcionarios.length; i++)
			if(this.funcionarios[i] == null){
				this.funcionarios[i] = atendente;
				return true;
			}
		return false;
	}
	
	public boolean excluiFuncionario(String nome){
		for (int i = 0; i < this.funcionarios.length; i++)
			if(this.funcionarios[i] != null)
				if(this.funcionarios[i].getNome().equalsIgnoreCase(nome)){
					this.funcionarios[i] = null;
					for (int j = i; j < (this.funcionarios.length - 1); j++)
						this.funcionarios[j] = funcionarios[j+1];
					return true;
				}
		return false;
	}
	
	public Funcionario buscaFuncionario(String nome){
		for (int i = 0; i < this.funcionarios.length; i++)
			if(this.funcionarios[i] != null)
				if(this.funcionarios[i].getNome().equalsIgnoreCase(nome))
					return this.funcionarios[i];
		return null;
	}
	
	public Double mostraSalario(String nome){
		for (int i = 0; i < this.funcionarios.length; i++)
			if(this.funcionarios != null)
				return this.funcionarios[i].calculaSalario();
		return 0.0;
	}
	
	public String executaTarefa(Funcionario funcionario, String tipo){
		if(funcionario instanceof Bibliotecario){
			Bibliotecario bibliotecario = (Bibliotecario) funcionario;
			return bibliotecario.processarEmprestimo(tipo);
		}
		else if(funcionario instanceof Auxiliar){
			Auxiliar auxiliar = (Auxiliar) funcionario;
			return auxiliar.organizarLivros(tipo);
		}
		else{
			Atendente atendente = (Atendente) funcionario;
			return atendente.atenderUsuario(tipo);
		}
	}
	
	public Funcionario[] getFuncionarios(){
		return this.funcionarios;
	}
	
}
