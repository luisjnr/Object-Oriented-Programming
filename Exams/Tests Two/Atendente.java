public class Atendente extends Funcionario{
	private String turno;
	
	public Atendente(int registro, String turno, String nome, Double salario){
		super(nome, salario, registro);
		if(turno.equalsIgnoreCase("manha"))	
			this.turno = turno;
		else if(turno.equalsIgnoreCase("noite"))
			this.turno = turno;
		else
			this.turno = "Não informado.";
	}
	
	@Override
	public Double calculaSalario(){
		if(turno.equalsIgnoreCase("noite"))
			return ((this.getSalario() * 1.2) * 0.9);
		return super.calculaSalario();
	}
	
	public String atenderUsuario(String nome){
		return "Usuário " + nome + " atendido no turno " 
		+ this.turno + ".";
	}
	
	public String getTurno(){
		return this.turno;
	}
	
	public void setTurno(String turno){
		if(turno.equalsIgnoreCase("manha"))	
			this.turno = turno;
		else if(turno.equalsIgnoreCase("noite"))
			this.turno = turno;
		else
			this.turno = "Não informado.";
	}
}
