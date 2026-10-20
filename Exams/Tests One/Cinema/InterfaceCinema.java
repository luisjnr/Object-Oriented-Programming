import java.util.Scanner;

public class InterfaceCinema {
	Scanner scan = new Scanner(System.in);
	
	public int menu(String frase){
		System.out.println(frase);
		int opc = scan.nextInt();
		scan.nextLine();
		return opc;
	}
	
	public void metodos(SessaoCinema sessao){
		do
		{
			switch (menu("1 - Vender Ingresso\n2 - Calcular Bilheteria\n3 - Exibir Sessão\n4 - Cancelar")){
				case 1: System.out.println("Selecionar quantidade? S/N");
					if(scan.nextLine().equalsIgnoreCase("s")){
						System.out.println("Meia Entrada? S/N");
						if(scan.nextLine().equalsIgnoreCase("s")){
							System.out.println("Digite a quantidade: ");
							System.out.println("Valor total: " + sessao.venderIngresso(scan.nextInt(), true) + "\n");
						}
						else{
							System.out.println("Digite a quantidade: ");
							System.out.println("Valor total: " + sessao.venderIngresso(scan.nextInt()) + "\n");
						}
					}
					else
						System.out.println("Valor total: " + sessao.venderIngresso() + "\n");
					break;
				
				case 2:	System.out.println("Bilheteria: R$" + sessao.calcularBilheteria() + "\n");
					break;
				
				case 3: System.out.println("Mostrar lotação? S/N");
					if(scan.nextLine().equalsIgnoreCase("s")) 
						System.out.println(sessao.exibirSessao(true) + "\n");
					else
						System.out.println(sessao.exibirSessao() + "\n");
					break;
					
				case 4: return;
					
				default: System.out.println("Digite uma opção válida.");
			}
		} while (true);		
	}
}

