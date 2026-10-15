public class ContaPoupanca extends ContaBancaria{
	private int diaDeRendimento;
	
	public ContaPoupanca(Pessoa cliente, int numeroDaConta, Double saldo, int diaDeRendimento){
		super(cliente, numeroDaConta, saldo);
		this.diaDeRendimento = diaDeRendimento;
	}
	
	public Double calcularNovoSaldo(Double taxa){
		return (this.getSaldo() * (taxa + 1));
	}
	
	public void setDiaDeRendimento(int setDiaDeRendimento){
		this.diaDeRendimento = diaDeRendimento;
	}
	
	public int getDiaDeRendimento(){
		return this.diaDeRendimento;
	}
}
