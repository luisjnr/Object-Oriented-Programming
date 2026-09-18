public class Caneta {
	
	private String modelo, cor;
	private Double ponta;
	protected int carga; 
	public boolean tampa;
	
	public Caneta(String modelo, String cor, Double ponta, int carga, boolean tampa){
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampa = tampa;
	}
	
	void status(){
		System.out.println("Caneta: " + this.modelo + ", Cor: " + this.cor + ", Ponta: " + this.ponta + ", Carga: " + this.carga + (tampa == true ? ", Caneta tampada." : ", Caneta destampada."));
	}
	
	void rabiscar(){
		if(this.tampa)
			System.out.println("Caneta tampada! Impossível rabiscar.");
		else 
			System.out.println("Rabiscando.");
	}
	
	void tampar(){
		this.tampa = true;
	}
	
	void destampar(){
		this.tampa = false;
	}
=======
	private String modelo, cor;
	private double ponta;
	private int carga;
	private boolean tampa;
	
	public Caneta(String modelo, String cor, double ponta, int carga){
		setModelo(modelo);
		setCor(cor);
		setPonta(ponta);
		setCarga(carga);
		tampar();
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public String getCor(){
		return this.cor;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public double getPonta(){
		return this.ponta;	
	}
	
	public void setPonta(double ponta){
		this.ponta = ponta;
	}
	
	public int getCarga(){
		return this.carga;
	}
	
	public void setCarga(int carga){
		this.carga = carga;
	}
	
	public boolean getTampa(){
		return this.tampa;
	}
	
	public void setTampa(boolean tampa){
		this.tampa = tampa;
	}
	
	public void status(){
		System.out.println("Uma caneta " + this.cor + 
		(this.tampa ? "Tampada." : "Destampada.") + "\nModelo: " + this.modelo
		+ "\nPonta: " + this.ponta + "\nCarga: " + this.carga);
	}
	
	public void rabiscar(){
		if(this.tampa)	
			System.out.println("Impossível rabiscar! Caneta tampada.");
		else
			System.out.println("Rabiscando.");
	}
	
	protected void tampar(){
		setTampa(true);
	}

	protected void destampar(){
		setTampa(false);
	}
	
}
