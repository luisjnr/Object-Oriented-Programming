public class Empresa{

	public static void main(String[] args){
		SetorPessoal setor = new SetorPessoal(3);
		Funcionario[] funcionario = new Funcionario[3];
		funcionario[0]= new Funcionario(22, "Luis", 22, 100000.0, "Tech Lead");
		funcionario[1]= new Funcionario(14, "Heros", 22, 100000.0, "Tech Lead");
		funcionario[2]= new Funcionario(13, "Carlos", 13, 100000.0, "Tech Lead");
		
		for (int i = 0; i < 3; i++){
			System.out.println((setor.adicionarFuncionario(funcionario[i]) ? "Sucesso!" : "Falha."));
		}
		
		Funcionario[] lista = setor.listarFuncionarios();
		
		System.out.println("\nLista 1");
		
		for (int i = 0; i < lista.length; i++){
			System.out.println(lista[i].listar());
		}
		
		lista = setor.listarFuncionarios(22);
		
		System.out.println("Lista 2");		

		for (int i = 0; i < lista.length; i++)
			System.out.println(lista[i].listar());
			
		
		System.out.println((setor.removerFuncionario(funcionario[0]) ? "Sucesso!\n" : "Falha.\n"));
		
		lista = setor.listarFuncionarios("Tech Lead");
		
		System.out.println("Lista 3");
			
		for (int i = 0; i < lista.length; i++)
			System.out.println(lista[i].listar());
			
		System.out.println("Buscar");
		System.out.println(setor.buscarFuncionario("Carlos").listar());
		System.out.println(setor.buscarFuncionario(14).listar());
		
		
	}
}
