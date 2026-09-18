public class Produto {
	private String nome, categoria;
	private double preco;
	private int estoque;
	
	public Produto(String nome, double preco, int estoque, String categoria){
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		this.categoria = categoria;
			
	}
	
	public double vender(int quantidade){
		if(quantidade <= this.estoque){
			this.estoque -= quantidade;
			return (quantidade * this.preco);
		}
		System.out.println("Quantidade indisponível. Estoque: " + this.estoque);
		return 0.0;
	}
	
	public double vender(int quantidade, double desconto){
		if(quantidade <= this.estoque){
			this.estoque -= quantidade;
			if((quantidade * this.preco) <= desconto)
				return 0.0;
			return ((quantidade * this.preco) - desconto);
		}
		System.out.println("Quantidade indisponível. Estoque: " + this.estoque);
		return 0.0;
	}
	
	public double comprar(int quantidade){
		this.estoque += quantidade;
		return (quantidade * this.preco);
	}
	
	public double comprar(int quantidade, double frete){
		this.estoque += quantidade;
		return ((quantidade * this.preco) + frete);
	}
	
	public double calcularValorTotalEstoque(){
		return (this.preco * this.estoque);
	}
	
	public double calcularValorTotalEstoque(double imposto){
		return ((this.preco * this.estoque) * ((imposto / 100) + 1));
	}
	
	public String exibirDetalhes(){
		return "Nome: " + this.nome + "\nPreço: " + this.preco + 
		"\nCategoria: " + this.categoria;
	}
	
	public String exibirDetalhes(boolean mostrarEstoque){
		return "Nome: " + this.nome + "\nPreço: " + this.preco + 
		"\nCategoria: " + this.categoria + (mostrarEstoque ? 
		("\nEstoque: " + this.estoque) : "");
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public void setEstoque(int estoque){
		this.estoque = estoque;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCategoria(){
		return this.categoria;
	}
	
	public double getPreco(){
		return this.preco;
	}
	
	public int getEstoque(){
		return this.estoque;
	}
	
}

