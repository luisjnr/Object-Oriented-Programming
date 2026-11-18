public abstract class Eletronico {
	private String marca;
	private String modelo;
	private Double preco;
	
	public Eletronico(String marca, String modelo, Double preco){
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	public abstract Double precoFinal();
	
	public abstract String detalhar();
	
	public String getMarca(){
		return this.marca;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public Double getPreco(){
		return this.preco;
	}
	
	public void setPreco(Double preco){
		this.preco = preco;
	}
}
