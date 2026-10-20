public class Empresa {
	
	public static void printFuncionario(Funcionario[] func, int m){
		if(m < 0) return;
		printFuncionario(func, (m-1));
		System.out.println("Nome: " + func[m].getNome() + 
		", Salário: " + func[m].mostraSalario(200) + "\n");
	}

    public static void main(String[] args) {
		Funcionario[] func = new Funcionario[2];
		func[0] = new Funcionario("Carlos", 1000, 12);
		func[1] = new Funcionario("João", 1000, 9);
		
		System.out.println("Funcionários\n");
		
		printFuncionario(func, (func.length - 1));
    }
}
