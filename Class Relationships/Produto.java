public class Produto{
	private int codigo;
	private String descricao;
	private double custo;
	private double preco;
	
	public Produto(int codigo, String descricao, double custo){
		this.codigo = codigo;
		this.descricao = descricao;
		this.custo = custo;
		this.calculaPreco();
	}
	
	public void calculaPreco(){
		this.preco = this.custo * 1.25;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public void setCusto(double custo){
		this.custo = custo;
		this.calculaPreco();
	}
	
	public double getCusto(){
		return this.custo;
	}
}
