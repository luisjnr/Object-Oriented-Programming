public class Main {

	public static void main(String[] args){
		Agenda agenda = new Agenda("Minha agenda", 5);
		Pessoa pessoa = new Pessoa("Luis", 19, 11, "(38) 992577724");
		System.out.println((agenda.adicionaPessoa(pessoa) ? "Sucesso!" : "Falha."));
		pessoa = new Pessoa("Carlos", 05, 12, "(38) 994753724");
		System.out.println((agenda.adicionaPessoa(pessoa) ? "Sucesso!" : "Falha."));
		pessoa = new Pessoa("Fernanda", 22, 03, "(38) 992593744");
		System.out.println((agenda.adicionaPessoa(pessoa) ? "Sucesso!" : "Falha."));
		pessoa = new Pessoa("Heros", 10, 05, "(38) 992585964");
		System.out.println((agenda.adicionaPessoa(pessoa) ? "Sucesso!" : "Falha."));
		pessoa = new Pessoa("João", 02, 11, "(38) 992542424");
		System.out.println((agenda.adicionaPessoa(pessoa) ? "Sucesso!" : "Falha."));
		
		pessoa = agenda.buscaContato("Carlos");
		pessoa.setTelefone("(38) 991146188");
		System.out.println((agenda.alteraInformacoes(pessoa) ? "Sucesso!" : "Falha."));
		System.out.println((agenda.removePessoa(pessoa) ? "Sucesso!" : "Falha."));
		
		Pessoa[] pessoas = agenda.buscaPessoas();		
		
		System.out.println("Pessoas que fazem aniversário em novembro:");
		
		for (int i = 0; i < pessoas.length; i++)
			if(pessoas[i].getMesDeNascimento() == 11)
				System.out.println(pessoas[i].getNome());
				
	}
	
}
