public class Data{
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(){
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
	}
	
	public String retornaData(){
		return this.dia + "/" + this.mes + "/" + this.ano + ".\n";
	}
	
	public String calculaTempo(Data data){
		int dia = data.getDia() >= this.dia ? (data.getDia() - this.dia) 
		: (this.dia - data.getDia());
		
		int mes = data.getMes() >= this.mes ? (data.getMes() - this.mes) 
		: (this.mes - data.getMes()); 
		
		int ano = data.getAno() >= this.ano ? (data.getAno() - this.ano) 
		: (this.ano - data.getAno()); 
		
		ano = (((ano*12) - mes) / 12);
		
		if(data.getAno() != this.ano && mes != 0)
			mes = 12 - mes;
		
		if(ano == 1)
			ano--;
		
		return ano + " ano(s), " + mes + " mes(es), " + dia + " dia(s).\n";
	}
	
	public int getDia(){
		return this.dia;
	}
	
	public void setDia(int dia){
		this.dia = dia;
	}
	
	public int getMes(){
		return this.mes;
	}
	
	public void setMes(int mes){
		this.mes = mes;
	}
	
	public int getAno(){
		return this.ano;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
}
