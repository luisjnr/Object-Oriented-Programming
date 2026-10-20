public class ContaBancaria{
	private Cliente cliente;
	private int numeroDaConta;
	private double saldo;
	
	public ContaBancaria(Cliente cliente, int numeroDaConta, double saldo){
		this.cliente = cliente;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	
	public ContaBancaria(Cliente cliente, int numeroDaConta){
		this.cliente = cliente;
		this.numeroDaConta = numeroDaConta;
		this.saldo = 0.0;
	}
	
	public boolean sacar(float saque){
		if(this.saldo >= saque){
			this.saldo -= saque;
			return true;
		}
		return false;
	}
	
	public boolean depositar(float deposito){
		if(deposito > 0){
			this.saldo += deposito;
			return true;
		}
		return false;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public void setNumeroDaConta(int numeroDaConta){
		this.numeroDaConta = numeroDaConta;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public Cliente getCliente(){
		return this.cliente;
	}
	
	public int getNumeroDaConta(){
		return this.numeroDaConta;	
	}
	
	public double getSaldo(){
		return this.saldo;
	}
}
