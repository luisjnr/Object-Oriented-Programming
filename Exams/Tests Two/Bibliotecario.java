public class Bibliotecario extends Funcionario {
	private String cargo;
	
	public Bibliotecario(int registro, String cargo, String nome, Double salario){
		super(nome, salario, registro);
		if(cargo.equalsIgnoreCase("junior"))
			this.cargo = cargo;
		else if(cargo.equalsIgnoreCase("senior"))
			this.cargo = cargo;
		else
			this.cargo = "Não informado.";
	}
	
	@Override
	public Double calculaSalario(){
		if(cargo.equalsIgnoreCase("junior"))
			return ((this.getSalario() * 1.1) * 0.9);
		else if(cargo.equalsIgnoreCase("senior"))
			return ((this.getSalario() * 1.3) * 0.9);
		return super.calculaSalario();
	}
	
	public String processarEmprestimo(String livro){
		return "Empréstimo de " + livro + " processado por " 
		+ this.cargo + ".";
	}
	
	public String getCargo(){
		return this.cargo;
	}
	
	public void setCargo(String cargo){
		if(cargo.equalsIgnoreCase("junior"))
			this.cargo = cargo;
		else if(cargo.equalsIgnoreCase("senior"))
			this.cargo = cargo;
		else
			this.cargo = "Não informado.";
	}
	
}
