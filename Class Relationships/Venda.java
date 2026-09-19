public class Venda{
	private int numero;
	private Consumidor comprador;
	private Produto produto;
	private int quantidade;
	
	public Venda(int numero, Consumidor comprador, Produto produto, int quantidade){
		this.numero = numero;
		this.comprador = comprador;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public String imprimir(){
		return "Nome: " + this.comprador.getNome() +
		"\nDescrição do Produto: " + this.produto.getDescricao() +
		"\nQuantidade: " + this.quantidade + "\nValor Total:" +
		(this.produto.getPreco() * this.quantidade) + "\nStatus: " +
		((this.produto.getPreco() * this.quantidade) <= 
		this.comprador.getLimiteDeCredito() ? "Aprovada! Compra dentro do limite de crédito."
		: "Negada! Compra ultrapassou o limite de crédito.");
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setComprador(Consumidor comprador){
		this.comprador = comprador;
	}
	
	public Consumidor getComprador(){
		return this.comprador;
	}
	
	public void setProduto(Produto produto){
		this.produto = produto;
	}
	
	public Produto getProduto(){
		return this.produto;
	}
	
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	
	public int getQuantidade(){
		return this.quantidade;
	}
}
