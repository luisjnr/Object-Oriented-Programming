import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro lado: ");
		int a = scan.nextInt();
		System.out.println("Digite o segundo lado: ");
		int b = scan.nextInt();
		System.out.println("Digite o terceiro lado: ");
		int c = scan.nextInt();
		if((a + b) > c && (a + c) > b && (b + c) > a)
			System.out.println("É um triângulo.");
		else
			System.out.println("Não é um triângulo.");
	}
}
