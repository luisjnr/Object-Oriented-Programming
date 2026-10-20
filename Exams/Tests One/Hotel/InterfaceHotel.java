import java.util.Scanner;

public class InterfaceHotel{
	Scanner scan = new Scanner(System.in);
	
	public int menu(String frase){
		System.out.println(frase);
		int opc = scan.nextInt();
		scan.nextLine();
		return opc;
	}
	
	public void metodos(Reserva res){
		do{
			switch (menu("1 - Calcular Diária\n2 - Passeio\n3 - Exibir Detalhes\n4 - Cancelar")){
				case 1:	System.out.println("Com taxa de limpeza? S/N");
					if(scan.nextLine().equalsIgnoreCase("s")){
						System.out.println("Digite o valor da taxa: ");
						System.out.println("Valor da diária: R$" + res.calcularDiaria(scan.nextDouble()));
					}
					else
						System.out.println("Valor da diária: R$" + res.calcularDiaria());
					break;
					
				case 2:System.out.println("Deseja digitar a quantidade? S/N");
					if(scan.nextLine().equalsIgnoreCase("s")){
						System.out.println("Digite o tipo de passeio e a quantidade em sequência: ");
						System.out.println("Valor do passeio: R$" + res.adicionarPasseio(scan.nextLine(), scan.nextInt()));
					}
					else{
						System.out.println("Digite o tipo de passeio: ");
						System.out.println("Valor do passeio: R$" + res.adicionarPasseio(scan.nextLine()));
					}
					break;
					
				case 3: System.out.println("Com detalhes? S/N");
					if(scan.nextLine().equalsIgnoreCase("s"))
						System.out.println("Hóspede\n" + res.exibirReserva(true));
					else
						System.out.println("Hóspede\n" + res.exibirReserva());
					break;
					
				case 4: return;
				
				default: System.out.println("Digite uma opção válida.");
			}
			
		} while(true);
		
	}
}
