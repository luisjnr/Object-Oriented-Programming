import java.util.Scanner;

public class InterfaceLocadora {
	
	Scanner scan = new Scanner(System.in);
	
	public int menu(String frase){
		System.out.println(frase);
		int opc = scan.nextInt();
		scan.nextLine();
		return opc;
	}
	
	public void metodos(Veiculo car){
		do{
			switch (menu(("1 - Locação por dias\n2 - Locação por dias e kms\n" + 
			"3 - Locação por dias, kms e seguro\n4 - Exibir Detalhes\n5 - Cancelar"))){
				case 1: System.out.println("Digite o total de dias: "); 
					System.out.println("Valor total: " + car.calcularLocacao(scan.nextInt()));
					break;
					
				case 2: System.out.println("Digite o total de dias e quilometros em sequência: "); 
					System.out.println("Valor total: " + car.calcularLocacao(scan.nextInt(), scan.nextInt()));
					break;
					
				case 3: System.out.println("Com seguro? S/N");
					if(scan.nextLine().equalsIgnoreCase("S")){
						System.out.println("Digite o total de dias e quilometros em sequência: "); 
						System.out.println("Valor total: " + car.calcularLocacao(scan.nextInt(), scan.nextInt(), true));
					}
					else
						System.out.println("Valor total: " + car.calcularLocacao(scan.nextInt(), scan.nextInt(), false));
					break;
					
				case 4: System.out.println(car.exibirDetalhes()); 
					break;
					
				case 5: return;
				default: System.out.println("Digite uma opção válida.");				
			}
		} while (true);
	}
}
