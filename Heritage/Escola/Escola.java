public class Escola {

	public static void main(String[] args){
		Professor professor = new Professor("Adriano", "123.456.123-76", "(38) 99736-5674", 
		"Estrutura de Dados I", 150.0, 100);
		Aluno aluno = new Aluno("Luis", "435.866.765-87", "(38) 99856-9374", 
		"22546", "POO", 38.0, 47.0);
		
		IO.println("Professor: " + professor.getNome() + 
		", Pagamento: " + professor.calculaPagamento());
		
		IO.println("Aluno: " + aluno.getNome() +
		", Situaçao: " + aluno.situacao());
	}

}
