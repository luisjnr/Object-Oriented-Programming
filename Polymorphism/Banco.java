void main(){
	InterfaceBanco inter = new InterfaceBanco();
	int n = inter.imput("Contas disponíveis: ", 0);
	ContaPoupanca[] contaP = new ContaPoupanca[n];
	ContaEspecial[] contaE = new ContaEspecial[n];
	
	do{
		switch (inter.menu(("1 - Acessar conta poupança\n2 - Acessar conta especial\n"
		+ "3 - Criar conta poupança\n4 - Criar conta corrente\n5 - Encerrar"))){
			case 1: long acesso = inter.imput("Cpf: ", 0L);
				int token = 0; 
					for (int j = 10; j >= 4; j--)
						token = ((token * 10) + (int)(acesso % j));
				boolean flag = true;
				for (int i = 0; i < contaP.length; i++)
					if(contaP[i] != null)
						if(token == contaP[i].getNumeroDaConta()){
							inter.conta(contaP[i]);
							flag = false;
							break;
						}
				if(flag)
					IO.println("Conta não existe.");
				break;
			case 2:	acesso = inter.imput("Cpf: ", 0L);	
				token = 0; 
					for (int j = 3; j <= 9; j++)
						token = ((token * 10) + (int)(acesso % j));
				flag = true;
				for (int i = 0; i < contaE.length; i++)
					if(contaE[i] != null)
						if(acesso == contaE[i].getNumeroDaConta()){
							inter.conta(contaE[i]);
							flag = false;
							break;
						}
				if(flag)
					IO.println("Conta não existe.");
				break;
			case 3: flag = true;
				for (int i = 0; i < contaP.length; i++)
					if(contaP[i] == null){
						Pessoa pessoa = new Pessoa(inter.imput("Nome: "), inter.imput("Cpf: ", 0L),
						inter.imput("Endereço: "), inter.imput("RG: "));
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
						contaP[i] = new ContaPoupanca(pessoa, numero, 0.0, inter.imput("Dia de rendimento: ", 0));
						break;
					}
				break;
			case 4: flag = true;
				for (int i = 0; i < contaE.length; i++)
					if(contaE[i] == null){
						Pessoa pessoa = new Pessoa(inter.imput("Nome: "), inter.imput("Cpf: ", 0L),
						inter.imput("Endereço: "), inter.imput("RG: "));
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
							int x = (int)(pessoa.getCpf() % i);
							numero = ((numero * 10) + (int)(pessoa.getCpf() % j));
						}
						contaE[i] = new ContaEspecial(pessoa, numero, 0.0, inter.imput("Limite: ", 0.0));
						break;
					}
				break;
			case 5:	return;
			default: IO.println("Digite uma opção válida.\n");
		}
		
	} while (true);
	
}
