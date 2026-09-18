public class Veiculo {
	private String placa, modelo, tipo;
	private int quilometragem;
	
	public Veiculo(String placa, String modelo, String tipo){
		this.placa = placa;
		this.modelo = modelo;
		this.setTipo(tipo);
		this.quilometragem = 0;
	}
	
	public Veiculo(String placa, String modelo, String tipo, int quilometragem){
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		this.quilometragem = quilometragem;
	}
	
	public double calcularLocacao(int dias){
		this.quilometragem += (dias*100);
		if(this.tipo.equalsIgnoreCase("economico"))
			return ((100*dias) + ((100*dias) * 0.10));
		else if(this.tipo.equalsIgnoreCase("suv"))	
			return ((150*dias) + ((100*dias) * 0.10));
		return ((250*dias) + ((100*dias) * 0.10));
	}
	
	public double calcularLocacao(int dias, int kmRodados){
		this.quilometragem += (dias*kmRodados);
		if(this.tipo.equalsIgnoreCase("economico"))
			return ((100*dias) + ((kmRodados*dias) * 0.10));
		else if(this.tipo.equalsIgnoreCase("suv"))	
			return ((150*dias) + ((kmRodados*dias) * 0.10));
		return ((250*dias) + ((kmRodados*dias) * 0.10));
	}
	
	public double calcularLocacao(int dias, int kmRodados, boolean seguro){
		this.quilometragem += (dias*kmRodados);
		if(this.tipo.equalsIgnoreCase("economico"))
			return (((100*dias) + (dias * (seguro ? 50 : 0))) + ((kmRodados*dias) * 0.10));
		else if(this.tipo.equalsIgnoreCase("suv"))	
			return (((150*dias) + (dias * (seguro ? 50 : 0))) + ((kmRodados*dias) * 0.10));
		return (((250*dias) + (dias * (seguro ? 50 : 0))) + ((kmRodados*dias) * 0.10));
	}

	public String exibirDetalhes(){
		String preco;
		if(this.tipo.equalsIgnoreCase("economico"))
			preco = "R$100";
		else if(this.tipo.equalsIgnoreCase("suv"))
			preco = "R$150";
		else
			preco = "R$250";
		return "Placa: " + this.placa + "\nModelo: " + this.modelo +
		"\nTipo: " + this.tipo + "\nQuilometragem: " + 
		this.quilometragem + "\nPreço por dia: " + preco + "\n";
	}	
	
	public String getPlaca(){
		return this.placa;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public int getQuilometragem(){
		return this.quilometragem;
	}
	
	public void setPlaca(String placa){
		this.placa = placa;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public void setTipo(String tipo){
		if(tipo.equalsIgnoreCase("economico") || 
		tipo.equalsIgnoreCase("suv") || 
		tipo.equalsIgnoreCase("luxo"))
			this.tipo = tipo;
		else
			System.out.println("Erro! Insira um tipo válido.\n" + 
			"ECONOMICO, SUV OU LUXO.");
	}
	
	public void setQuilometragem(int quilometragem){
		this.quilometragem = quilometragem;
	}
}
