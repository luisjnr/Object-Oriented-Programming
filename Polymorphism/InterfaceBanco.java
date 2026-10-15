import java.util.Scanner;

public class InterfaceBanco {
	public Scanner scan = new Scanner(System.in);
	
	public int menu(String frase){
		IO.println(frase);
		int opc = scan.nextInt();
		scan.nextLine();
		return opc;
	}
	
	public String imput(String frase, String texto){
		IO.println(frase);
		texto = scan.nextLine();
		return texto;
	}
	
	public int imput(String frase, int inteiro){
		IO.println(frase);
		inteiro = scan.nextInt();
		return inteiro;
	}
	
	public Double imput(String frase, Double decimal){
		IO.println(frase);
		decimal = scan.nextDouble();
		return decimal;
	}
	
	public void metodos(ContaPoupanca conta){
		do{
			switch (menu("")){
				case 1:
					
					break;
				default: IO.println("Digite uma opção válida.");
			}
			
		} while (true);
		
	}
}
