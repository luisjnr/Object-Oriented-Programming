public class ContaBancaria {
	private Pessoa cliente;
	private int numeroDaConta;
	private Double saldo;
	
	public ContaBancaria(Pessoa cliente, int numeroDaConta, Double saldo){
		this.cliente = cliente;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	
	public boolean sacar(Double valor){
		if(valor <= this.saldo){
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean depositar(Double valor){
		if(valor > 0){
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public void setCliente(Pessoa cliente){
		this.cliente = cliente;
	}
	
	public Pessoa getCliente(){
		return this.cliente;
	}
	
	public void setNumeroDaConta(int numeroDaConta){
		this.numeroDaConta = numeroDaConta;
	}
	
	public int getNumeroDaConta(){
		return this.numeroDaConta;
	}
	
	public void setSaldo(Double saldo){
		this.saldo = saldo;
	}
	
	public Double getSaldo(){
		return this.saldo;
	}
}
