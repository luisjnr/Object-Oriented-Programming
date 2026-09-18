import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[3];
		for (int i = 0; i < numeros.length; i++){
			System.out.println("Número " + (i + 1) + ":");
			numeros[i] = scan.nextInt();
		}
		int maior = numeros[0];
		for (int i = 0; i < numeros.length; i++)
			if(numeros[i] > maior)
				maior = numeros[i];
		System.out.println("Maior número: " + maior);
    }

}
