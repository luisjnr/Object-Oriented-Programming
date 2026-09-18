public class Contas{

	public static void main(String[] args){
		Pessoa cliente = new Pessoa("Luis", "973.908.643.32", "Rua Sergipe, 987", "(38) 9 9123-4677");
		ContaBancaria conta = new ContaBancaria(cliente, 22);
		
		System.out.println((conta.depositar(100) ? "Valor depositado." : "Falha ao depositar."));
		System.out.println("Cliente: [" + conta.getCliente().getNome() + "] - Saldo: R$" + conta.getSaldo());
		System.out.println((conta.sacar(50) ? "Saque efetuado." : "Falha ao sacar."));
		conta.getCliente().setRenda(10000);
		System.out.println("Cliente");
		System.out.println(conta.getCliente().informacoes());
	}

}
