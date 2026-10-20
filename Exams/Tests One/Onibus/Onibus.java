public class Onibus {
	
	private int numero, capacidade, passageirosAtuais;
	private String linha;
	private double tarifa;
	
	public Onibus(int numero, String linha, int capacidade, double tarifa){
		this.numero = numero;
		this.linha = linha;
		this.capacidade = capacidade;
		this.tarifa = tarifa;
		this.passageirosAtuais = 0;
	}
	
	public Onibus(int numero, String linha, int capacidade){	
		this.numero = numero;
		this.linha = linha;
		this.capacidade = capacidade;
		this.tarifa = 4.5;
		this.passageirosAtuais = 0;
	}
	
	public boolean embarcarPassageiro(){
		if((this.capacidade - this.passageirosAtuais) >= 1){
			this.passageirosAtuais += 1;
			return true;
		}
		return false;
	}
	
	public boolean embarcarPassageiro(int quantidade){
		if((this.capacidade - this.passageirosAtuais) >= quantidade){
			this.passageirosAtuais += quantidade;
			return true;
		}
		return false;
	}
	
	public boolean desembarcarPassageiro(){
		if(this.passageirosAtuais > 0){
			this.passageirosAtuais -= 1;
			return true;
		}
		return false;
	}
	
	public boolean desembarcarPassageiro(int quantidade){
		if(this.passageirosAtuais >= quantidade){
			this.passageirosAtuais -= quantidade;
			return true;
		}
		return false;
	}
	
	public double calcularRenda(String tipoTarifa){
		if(tipoTarifa.equalsIgnoreCase("simples"))
			return (this.passageirosAtuais * this.tarifa);
		else if(tipoTarifa.equalsIgnoreCase("integrada"))
			return ((this.passageirosAtuais * this.tarifa) * 1.5);
		System.out.println("Tipo de tarifa inválida.");
		return 0.0;
	}

	public String exibirInfo(){		
		return "Ônibus: " + this.numero + "\nLinha: " + this.linha;
	}
	
	public String exibirInfo(boolean detalhado){
		if(detalhado){
			return "Ônibus: " + this.numero 
			+ "\nLinha: " + this.linha 
			+ "\nPassageiros: " + this.passageirosAtuais + "/"  + this.capacidade
			+ "\nTarifa R$" + tarifa;
		}
		return "Ônibus: " + numero 
			+ "\nLinha: " + linha 
			+ "\nTarifa R$" + tarifa;
	}
		
	public int getNumero(){	
		return this.numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public String getLinha(){
		return this.linha;
	}
	
	public void setLinha(String linha){
		this.linha = linha;
	}
	
	public int getCapacidade(){
		return this.capacidade;
	}
	
	public void setCapacidade(int capacidade){
		this.capacidade = capacidade;
	}
	
	public int getPassageirosAtuais(){
		return this.passageirosAtuais;
	}
	
	public void setPassageirosAtuais(int passageirosAtuais){
		this.passageirosAtuais = passageirosAtuais;
	}
	
	public double getTarifa(){
		return this.tarifa;
	}
	
	public void setTarifa(double tarifa){
		this.tarifa = tarifa;
	}
	
}
