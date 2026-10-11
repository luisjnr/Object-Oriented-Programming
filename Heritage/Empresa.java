public class Empresa {

	public static void main(String[] args){
		Empregado empregado = new Empregado("Luis", "Rua Ceara, 645, Centro.",
		"(38) 99747-6424", 22, 10000.0, 10.0);
		Fornecedor fornecedor = new Fornecedor("Joao", "Rua Amazonas, 823, Centro.",
		"(38) 99987-3644", 10000.0, 1000.0);;
		
		System.out.println("Empregado: " + empregado.getNome() + 
		", Salário: " + empregado.calculaSalario());
		
		System.out.println("Fornecedor: " + fornecedor.getNome() +
		", Saldo: " + fornecedor.obterSaldo());
	}

}
