import java.util.Scanner;

public class Divisivel {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[4];
		for (int i = 0; i < numeros.length; i++){
			System.out.println("Número " + (i+1) + ":");
			numeros[i] = scan.nextInt();
		}
		System.out.println("Números divisíveis por 2 ou por 3: ");
		for (int i = 0; i < numeros.length; i++)
			if((numeros[i] % 2) == 0 || (numeros[i] % 3) == 0)
				System.out.println(numeros[i]);
    }

}
