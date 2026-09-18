import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] notas = new int[3];
		for (int i = 0; i < notas.length; i++){
			System.out.println("Nota " + (i+1) + ":");
			notas[i] = scan.nextInt();
		}
		int[] pesos = new int[3];
		for (int i = 0; i < pesos.length; i++){
			System.out.println("Peso " + (i+1) + ":");
			pesos[i] = scan.nextInt();
		}
		int media = 0, divisor = 0;
		for (int i = 0; i < notas.length; i++){
			media += notas[i] * pesos[i];
			divisor += pesos[i];
		}
		media /= divisor;
		if(media >= 8 && media <= 10)
			System.out.println("Nota A.");
		else if(media >= 7 && media < 8)
			System.out.println("Nota B.");
		else if(media >= 6 && media < 7)
			System.out.println("Nota C.");
		else if(media >= 5 && media < 6)
			System.out.println("Nota D.");
		else if(media >= 0 && media < 5)
			System.out.println("Nota E.");
    }

}
