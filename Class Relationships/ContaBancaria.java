public class ContaBancaria{
	private Pessoa cliente;
	private int numeroDaConta;
	private double saldo;
	
	public ContaBancaria(Pessoa cliente, int numeroDaConta, double saldo){
		this.cliente = cliente;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	
	public ContaBancaria(Pessoa cliente, int numeroDaConta){
		this.cliente = cliente;
		this.numeroDaConta = numeroDaConta;
		this.saldo = 0.0;
	}
	
	public void setPessoa(Pessoa cliente){
		this.cliente = cliente;
	}
	
	public void setNumeroDaConta(int numeroDaConta){
		this.numeroDaConta = numeroDaConta;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public Pessoa getCliente(){
		return this.cliente;
	}
	
	public int getNumeroDaConta(){
		return this.numeroDaConta;	
	}
	
	public double getSaldo(){
		return this.saldo;
	}
}
