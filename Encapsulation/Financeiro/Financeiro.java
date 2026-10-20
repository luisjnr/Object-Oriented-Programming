public class Financeiro {
	
	public static void printBoleto(Boleto[] bol, int m){
		if(m < 0) return;
		printBoleto(bol, (m-1));
		System.out.println(bol[m].exibir());
	}
	
	public static void main (String[] args) {
		Boleto[] bol = new Boleto[2];
		bol[0] = new Boleto(22, "WIFI", 19, 120.0); 
		bol[1] = new Boleto(13, "LUZ", 19, 250.0); 
		
		System.out.println(bol[0].pagar(16, 10.0, 120.0) ? 
		"Pagamento efetuado!" : "Pagamento Recusado! Valor insuficiente.");
		
		System.out.println(bol[1].pagar(20, 10.0, 250.0) ? 
		"Pagamento efetuado!" : "Pagamento Recusado! Valor insuficiente.");
		
		System.out.println("Boletos");
		
		printBoleto(bol, (bol.length - 1));

	}
}

