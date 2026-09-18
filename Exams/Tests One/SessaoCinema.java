public class SessaoCinema {
	private int numeroDaSala, capacidade, ingressosVendidos;
	private String filme;
	private double precoIngresso;
	
	public SessaoCinema(int numeroDaSala, String filme, int capacidade){
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.ingressosVendidos = 0;
		this.precoIngresso = 25.0;
	}
	
	public SessaoCinema(int numeroDaSala, String filme, int capacidade, double precoIngresso){
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.ingressosVendidos = 0;
		this.precoIngresso = precoIngresso;
	}
	
	public double venderIngresso(){
		if(this.capacidade >= (this.ingressosVendidos + 1)){
			this.ingressosVendidos++;
			return this.precoIngresso;
		}
		return -1.0;
	}
	
	public double venderIngresso(int quantidade){
		if(this.capacidade >= (this.ingressosVendidos + quantidade)){
			this.ingressosVendidos += quantidade;
			return (quantidade * this.precoIngresso);
		}
		return -1.0;
	}
	
	public double venderIngresso(int quantidade, boolean meiaEntrada){
		if(this.capacidade >= (this.ingressosVendidos + quantidade)){
			this.ingressosVendidos += quantidade;
			return ((quantidade * this.precoIngresso) * (meiaEntrada ? 0.50 : 1));
		}
		return -1.0;
	}
	
	public double calcularBilheteria(){
		return (ingressosVendidos * precoIngresso);
	}
	
	public String exibirSessao(){
		return "Sala " + this.numeroDaSala + " - Filme: " + this.filme
		+ " - Ingresso: R$" + this.precoIngresso;
	}
	
	public String exibirSessao(boolean mostrarLotacao){
		return "Sala " + this.numeroDaSala + " - Filme: " + this.filme
		+ " - Ingresso: R$" + this.precoIngresso + (mostrarLotacao ? 
		(" - Lotação: [" + this.ingressosVendidos + "/" + this.capacidade + "]\n") : "");
	}
	
	public int getNumeroDaSala(){
		return this.numeroDaSala;
	}
	
	public int getCapacidade(){
		return this.capacidade;
	}
	
	public int getIngressosVendidos(){
		return this.ingressosVendidos;
	}
	
	public String getFilme(){
		return this.filme;
	}
	
	public double getPrecoIngresso(){
		return this.precoIngresso;	
	}
	
	public void setNumeroDaSala(int numeroDaSala){
		this.numeroDaSala = numeroDaSala;
	}
	
	public void setCapacidade(int capacidade){
		this.capacidade = capacidade;
	}
	
	public void setIngressosVendidos(int ingressosVendidos){
		this.ingressosVendidos = ingressosVendidos;
	}
	
	public void setFilme(String filme){
		this.filme= filme;
	}
	
	public void setPrecoIngresso(double precoIngresso){
		this.precoIngresso = precoIngresso;
	}
	
}

