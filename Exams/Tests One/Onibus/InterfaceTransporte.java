import java.util.Scanner;

public class InterfaceTransporte {
	
	Scanner scan = new Scanner(System.in);
	
	public int menu(String frase){
		System.out.println(frase);
		int opc = scan.nextInt();
		scan.nextLine();
		return opc;
	}
	
	public void metodos(Onibus bus){
		do{
			switch (menu(("1 - Embarcar Passageiro\n2 - Desembarcar Passegeiro\n" 
			+ "3 - Calcular Renda\n4 - Exibir Informações\n5 - Cancelar"))){	
				case 1: System.out.println("Digitar quantidade? S/N");
					if(scan.nextLine().equalsIgnoreCase("S")){
						System.out.println("Digite a quantidade: ");
						System.out.println((bus.embarcarPassageiro(scan.nextInt())
						? "Passageiros embarcados." : "Limite de passageiros atingidos."));
					}
					else
						System.out.println((bus.embarcarPassageiro()
						? "Passageiro embarcado." : "Limite de passageiros atingidos."));
					break;

				case 2:	System.out.println("Digitar quantidade? S/N");
					if(scan.nextLine().equalsIgnoreCase("S")){
						System.out.println("Digite a quantidade: ");
						System.out.println((bus.desembarcarPassageiro(scan.nextInt())
						? "Passageiros desembarcados." : "Quantidade de passageiros insuficiente."));
					}
					else
						System.out.println((bus.desembarcarPassageiro()
						? "Passageiro desembarcado." : "Quantidade de passageiros insuficiente."));
					break;
					
				case 3: System.out.println("1 - Integrado\n2 - Simples\n");
					if(scan.nextInt() == 1)
						System.out.println("Renda: R$" + bus.calcularRenda("Integrado"));
					else
						System.out.println("Renda: R$" + bus.calcularRenda("Simples"));
					break;
					
				case 4: System.out.println("Detalhado? S/N");
					if(scan.nextLine().equalsIgnoreCase("S"))
						System.out.println(bus.exibirInfo(true));
					else
						System.out.println(bus.exibirInfo());
					break;
					
				case 5: return;
					
				default: System.out.println("Digite uma opção válida.");
			}	
		} while (true);
	}
}
