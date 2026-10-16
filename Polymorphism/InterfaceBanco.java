import java.util.Scanner;

public class InterfaceBanco {
	public Scanner scan = new Scanner(System.in);
	
	public int menu(String frase){
		IO.println(frase);
		int opc = scan.nextInt();
		scan.nextLine();
		return opc;
	}
	
	public String imput(String frase){
		IO.println(frase);
		String texto = scan.nextLine();
		return texto;
	}
	
	public long imput(String frase, long inteiro){
		IO.println(frase);
		inteiro = scan.nextLong();
		scan.nextLine();
		return inteiro;
	}
	
	public int imput(String frase, int inteiro){
		IO.println(frase);
		inteiro = scan.nextInt();
		scan.nextLine();
		return inteiro;
	}
	
	public Double imput(String frase, Double decimal){
		IO.println(frase);
		decimal = scan.nextDouble();
		scan.nextLine();
		return decimal;
	}
	
	public void conta(ContaPoupanca conta){
		do{
			switch (menu("1 - Depositar\n2 - Sacar\n3 - Calcular novo saldo\n4 - Cancelar")){
				case 1: IO.println(conta.depositar(imput("Valor a ser depositado: ", 0.0)));	
					break;
				case 2: IO.println(conta.sacar(imput("Valor a ser sacado: ", 0.0)));	
					break;
				case 3: IO.println(conta.calcularNovoSaldo(imput("Taxa de rendimento: ", 0.0)));	
					break;
				case 4: return;
				default: IO.println("Digite uma opção válida.\n");
			}
			
		} while (true);
	}
	
	public void conta(ContaEspecial conta){
		do{
			switch (menu("1 - Depositar\n2 - Sacar\n3 - Cancelar")){
				case 1: IO.println(conta.depositar(imput("Valor a ser depositado: ", 0.0)));		
					break;
				case 2: IO.println(conta.sacar(imput("Valor a ser depositado: ", 0.0)));		
					break;
				case 3: return;
				default: IO.println("Digite uma opção válida.\n");
			}
			
		} while (true);
	}
	
	public void conta(ContaPoupanca[] contaP, ContaEspecial[] contaE){
		do{
			switch (menu(("1 - Acessar conta poupança\n2 - Acessar conta especial\n"
			+ "3 - Criar conta poupança\n4 - Criar conta especial\n5 - Encerrar"))){
				case 1: long acesso = imput("Cpf: ", 0L);
					int token = 0; 
						for (int j = 10; j >= 4; j--)
							token = ((token * 10) + (int)(acesso % j));
					boolean flag = true;
					for (int i = 0; i < contaP.length; i++)
						if(contaP[i] != null)
							if(token == contaP[i].getNumeroDaConta()){
								conta(contaP[i]);
								flag = false;
								break;
							}
					if(flag)
						IO.println("Conta não existe.");
					break;
				case 2:	acesso = imput("Cpf: ", 0L);	
					token = 0; 
						for (int j = 3; j <= 9; j++)
							token = ((token * 10) + (int)(acesso % j));
					flag = true;
					for (int i = 0; i < contaE.length; i++)
						if(contaE[i] != null)
							if(acesso == contaE[i].getNumeroDaConta()){
								conta(contaE[i]);
								flag = false;
								break;
							}
					if(flag)
						IO.println("Conta não existe.");
					break;
				case 3: int cont = 0;
					for(ContaPoupanca conta : contaP)
						if(conta != null)
							cont++;
					if(cont == contaP.length){
						IO.println("Máximo de contas alcançadas.");
						break;
					}
					flag = true;
					for (int i = 0; i < contaP.length; i++)
						if(contaP[i] == null){
							Pessoa pessoa = new Pessoa(imput("Nome: "), imput("Cpf: ", 0L),
							imput("Endereço: "), imput("RG: "));
							for (int j = 0; j < contaP.length; j++)
								if(contaP[j] != null)
									if(contaP[j].getCliente().getCpf() == pessoa.getCpf()){
										IO.println("Usuário já possui conta.");
										flag = false;
										break;
									}
							if(!flag)
								break;
							int numero = 0; 
							for (int j = 10; j >= 4; j--){
								numero = ((numero * 10) + (int)(pessoa.getCpf() % j));
							}
							contaP[i] = new ContaPoupanca(pessoa, numero, 0.0, imput("Dia de rendimento: ", 0));
							break;
						}
					break;
				case 4: cont = 0;
					for(ContaEspecial conta : contaE)
						if(conta != null)
							cont++;
					if(cont == contaE.length){
						IO.println("Máximo de contas alcançadas.");
						break;
					} 
				flag = true;
					for (int i = 0; i < contaE.length; i++)
						if(contaE[i] == null){
							Pessoa pessoa = new Pessoa(imput("Nome: "), imput("Cpf: ", 0L),
							imput("Endereço: "), imput("RG: "));
							for (int j = 0; j < contaE.length; j++)
								if(contaE[j] != null)
									if(contaE[j].getCliente().getCpf() == pessoa.getCpf()){
										IO.println("Usuário já possui conta.");
										flag = false;
										break;
									}
							if(!flag)
								break;
							int numero = 0; 
							for (int j = 3; j <= 9; j++){
								numero = ((numero * 10) + (int)(pessoa.getCpf() % j));
							}
							contaE[i] = new ContaEspecial(pessoa, numero, 0.0, imput("Limite: ", 0.0));
							break;
						}
					break;
				case 5:	return;
				default: IO.println("Digite uma opção válida.\n");
			}
			
		} while (true);
	}
}
