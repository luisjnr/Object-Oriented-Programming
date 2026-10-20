public class ContaCorrente {
	private String cliente;
	private int numero, senha;
	private double saldo;
	
	public ContaCorrente(String cliente, int numero){
		setCliente(cliente);
		setNumero(numero);
		setSenha(0);
		setSaldo(0);
	}
	
	public boolean cadastrarSenha(int senha){
		if(this.senha == 0 && senha > 0){	
			setSenha(senha);
			return true;
		}	
		return false;
	}
	
	public boolean alterarSenha(int senha, int novaSenha){
		if(this.senha == senha && senha != 0 && novaSenha > 0 
		&& senha != novaSenha){
			setSenha(novaSenha);
			return true;
		}
		return false;
	}
	
	public boolean debitar(int senha, double valor){
		if(this.senha == senha && this.saldo >= valor && senha > 0){
			setSaldo((getSaldo() - valor));
			return true;
		}
		return false;
	}
	
	public boolean creditar(int senha, double valor){
		if(this.senha == senha && valor > 0 && senha > 0){
			setSaldo((getSaldo() + valor));
			return true;
		}
		return false;
	}
	
	public String consultaSaldo(int senha){
		if(this.senha == senha && senha > 0){
			return "Cliente: " + this.cliente + ", Saldo: " + this.saldo;
		}
		return "Senha incorreta!";
	}
	
	public String getCliente(){
		return this.cliente;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public int getSenha(){
		return this.senha;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setCliente(String cliente){
		this.cliente = cliente;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	private void setSenha(int senha){
		this.senha = senha;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
}

