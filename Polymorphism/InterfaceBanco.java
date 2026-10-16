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
}
