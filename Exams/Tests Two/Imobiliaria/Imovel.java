public class Imovel {
	private String descricao;
	private Double preco;
	private boolean ativo;
	private char tipo;
	
	public Imovel(Double preco, String descricao, boolean ativo){
		this.preco = preco;
		this.descricao = descricao;
		this.ativo = ativo;
	}
	
	public Double calculaPreco(){
		return (this.ativo ? this.preco : 0.0);
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public Double getPreco(){
		return this.preco;
	}
	
	public void setPreco(Double preco){
		this.preco = preco;
	}
	
	public boolean isAtivo(){
		return this.ativo;
	}
	
	public void setAtivo(boolean ativo){
		this.ativo = ativo;
	}
	
	public char getTipo(){
		return this.tipo;
	}
	
	public void setTipo(char tipo){
		this.tipo = tipo;
	}
}
