import java.util.Scanner;

public class InterfaceLoja {
	
	public Scanner scan = new Scanner(System.in);
	
	public int menu(String frase){
		System.out.println(frase);
		int opc = scan.nextInt();
		scan.nextLine();
		return opc;
	}
	
	public void metodos(Produto prod){
		do{
			switch (menu(("1 - Vender Produto\n2 - Comprar Produto\n" + 
			"3 - Calcular Valor do Estoque\n4 - Exibir Detalhes\n5 - Cancelar"))){
				case 1: System.out.println("Com desconto? S/N"); 
					if(scan.nextLine().equalsIgnoreCase("S")){
						System.out.println("Digite a quantidade e o desconto em sequência:");
						System.out.println("Valor Total: " + prod.vender(scan.nextInt(), scan.nextDouble()));
					}
					else{
						System.out.println("Digite a quantidade:");
						System.out.println("Valor Total: " + prod.vender(scan.nextInt()));
					}
					break;
					
				case 2: System.out.println("Com frete? S/N"); 
					if(scan.nextLine().equalsIgnoreCase("S")){
						System.out.println("Digite a quantidade e o frete em sequência:");
						System.out.println("Valor Total: " + prod.comprar(scan.nextInt(), scan.nextDouble()));
					}
					else{
						System.out.println("Digite a quantidade:");
						System.out.println("Valor Total: " + prod.comprar(scan.nextInt()));
					}	
					break;
					
				case 3: System.out.println("Com imposto? S/N"); 
					if(scan.nextLine().equalsIgnoreCase("S")){
						System.out.println("Digite o imposto:");
						System.out.println("Valor Total: " + prod.calcularValorTotalEstoque(scan.nextDouble()));
					}
					else
						System.out.println("Valor Total: " + prod.calcularValorTotalEstoque());
					break;
					
				case 4: System.out.println("Com estoque? S/N"); 
					if(scan.nextLine().equalsIgnoreCase("S")){
						System.out.println(prod.exibirDetalhes(true) + "\n");
					}
					else
						System.out.println(prod.exibirDetalhes() + "\n");
					break;
					
				case 5: return;
				default: System.out.println("Digite uma opção válida.");				
			}
		} while (true);
	}
}

