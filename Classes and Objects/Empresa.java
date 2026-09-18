public class Empresa {
	
	public static void printFun(Funcionario[] fun, int m){
		if(m<0) return;
		printFun(fun, (m-1));
		System.out.println("Nome: " + fun[m].nome + ", Salário final: " + fun[m].salarioFinal() + ".");	
	}

    public static void main(String[] args) {
		Funcionario fun[] = new Funcionario[3];
		fun[0] = new Funcionario("Carlos", 20.0, 10.0);
		fun[1] = new Funcionario("Rafael", 30.0, 10.0);
		fun[2] = new Funcionario("João", 25.0, 10.0);
		
		System.out.println("Tabela Funcionários: ");
		printFun(fun, (fun.length-1));
    }

}
