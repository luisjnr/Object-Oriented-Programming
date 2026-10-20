public class Boleto{

	private int codigo, diaDeVencimento;
	private String descricao;
	private double valor;
	private boolean status;
		
	public Boleto(int codigo, String descricao, int diaDeVencimento, double valor){
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setDiaDeVencimento(diaDeVencimento);
		this.setValor(valor);
		this.setStatus(false);
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	
	public int getDiaDeVencimento(){
		return this.diaDeVencimento;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	public double getValor(){
		return this.valor;
	}
	
	public boolean getStatus(){
		return this.status;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public void setDiaDeVencimento(int diaDeVencimento){
		this.diaDeVencimento = diaDeVencimento;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public void setStatus(boolean status){
		this.status = status;
	}
	
	public boolean pagar(int dia, double desconto, double valorPago){
		if(this.status)
			return false;
		if(dia <= this.diaDeVencimento && valorPago >= (this.valor * (((double)100-desconto) / 100))){
			this.setStatus(true);
			return true;
		}
		else if(dia > this.diaDeVencimento && valorPago >= (this.valor * 1.10)){
			this.setStatus(true);
			return true;
		}
		return false;
	}
	
	public String exibir(){
		return "Código: " + this.codigo + ", Descrição: " + this.descricao
		+ ", Dia de Vencimento: " + this.diaDeVencimento + ", Valor: " +
		this.valor + ", Status: " + (this.status ? "Pago" : "Não pago");
	}
}

