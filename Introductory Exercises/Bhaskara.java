import java.util.Scanner;

public class Bhaskara {

	public static double raiz(double num){ 
		return Math.sqrt(num);
	}

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int a = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int b = scan.nextInt();
		System.out.println("Digite o terceiro número: ");
		int c = scan.nextInt();
		int delta = (b * b) - (4 * a * c);
		if(delta < 0)
			System.out.println("Não existem raízes.");
		else{	
			double x = (-b+raiz(delta)) / 2;
			double y = (-b-raiz(delta)) / 2;
			if(x==y)
				System.out.printf("Raiz: %.2f", x);
			else
				System.out.printf("Raizes:\nX: %.2f\nY: %.2f", x, y);
		}
    }

}
