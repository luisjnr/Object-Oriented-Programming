public class ContaEspecial extends ContaBancaria{
	private Double limite;
	
	public ContaEspecial(Pessoa cliente, int numeroDaConta, Double saldo, Double limite){
		super(cliente, numeroDaConta, saldo);
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(Double valor){
		if((this.getSaldo() - valor) >= (this.getLimite() * -1)){
			this.setSaldo((this.getSaldo() - valor));
			return true;
		}
		return false;
	}
	
	public void setLimite(Double limite){
		this.limite = limite;
	}
	
	public Double getLimite(){
		return this.limite;
	}
	
}
