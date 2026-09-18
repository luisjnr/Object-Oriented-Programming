public class Funcionario {
	String nome;
	Double horasTrabalhadas, valorDaHora;
		
	public Funcionario(String nome, Double horasTrabalhadas, Double valorDaHora){
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorDaHora = valorDaHora;
	}
		
	public Double salarioFinal(){
		return (this.horasTrabalhadas * this.valorDaHora) * 0.89;
	}
}
