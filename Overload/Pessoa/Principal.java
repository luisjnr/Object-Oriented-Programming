public class Principal{

	public static void main(String[] args){
		Pessoa pes1 = new Pessoa("Luis"), 
		pes2 = new Pessoa("Carlos", "Masculino", 4, 2003);
		
		System.out.println("Pessoas\n");
		
		System.out.println("Nome: " + pes1.getNome() + "\nIdade: " + 
		pes1.mostraIdade() + "\n");
		
		System.out.println("Nome: " + pes2.getNome() + "\nIdade: " + 
		pes2.mostraIdade(9, 2026) + "\n");
	}
	
}
