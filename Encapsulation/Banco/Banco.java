public class Banco {
	
	public static void main (String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente("Carlos", 22);
		
		System.out.println(conta1.alterarSenha(123, 234) ? 
		"Senha alterada com sucesso!" : 
		"Erro! Digite ou cadastre uma senha válida.");
		
		System.out.println(conta1.cadastrarSenha(22) ? "Senha cadastrada!"
		: "Erro! Já existe uma senha/Senha inválida.");
		
		System.out.println(conta1.debitar(22, 10.0) ? 
		"Saldo debitado com sucesso!" : 
		"Erro! Senha incorreta/Saldo insuficiente ");
		
		System.out.println(conta1.creditar(22, 10.0) ? "Saldo creditado!"
		: "Erro! Senha incorreta.");
		
		System.out.println(conta1.consultaSaldo(22));
		
		System.out.println(conta1.debitar(22, 10.0) ? 
		"Saldo debitado com sucesso!" : 
		"Erro! Senha incorreta/Saldo insuficiente ");
		
		System.out.println(conta1.consultaSaldo(22));
		
		System.out.println(conta1.cadastrarSenha(13) ? "Senha cadastrada!"
		: "Erro! Já existe uma senha/Senha inválida.");
		
		System.out.println(conta1.alterarSenha(22, 13) ? 
		"Senha alterada com sucesso!" : 
		"Erro! Digite ou cadastre uma senha válida.");
	}
}

