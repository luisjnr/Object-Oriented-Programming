import java.util.Scanner;

public class FaixaPermitida {
	
	public static final int MIN = 0;
	public static final int MAX = 9;
	
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = scan.nextInt();
		if(valor >= MIN && valor <= MAX)
			System.out.println("O valor está na faixa permitida.");
		else 
			System.out.println("O valor não está na faixa permitida.");
    }

}
