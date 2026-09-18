import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		double salario = scan.nextFloat();
		if(salario < 5000){
			salario *= 1.30;
			System.out.printf("Salário após aumento: %.2f", salario);
		}
		else
			System.out.println("O salário não está apto para aumento.");
    }
}
