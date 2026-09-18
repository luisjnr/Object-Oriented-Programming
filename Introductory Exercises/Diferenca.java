import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro Valor:");
		int a = scan.nextInt();
		System.out.println("Segundo Valor:");
		int b = scan.nextInt();
		if(a==b)
			System.out.println("Resultado: " + 0);
		else
			System.out.println(a > b ? "Resultado: " + (a-b) : "Resultado: " + (b-a));
    }

}
