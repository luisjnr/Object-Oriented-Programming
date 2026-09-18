import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Escreva uma palavra ou frase: ");
			String palavra = scan.nextLine().replace(" ", "").toLowerCase();
			String temp = "";
			for (int i = palavra.length(); i > 0; i--){
				temp += palavra.charAt(i - 1);
			}    
			System.out.println(palavra.equals(temp) ? "É um Palindromo." : "Não é um Palindromo.");
		}
    }

}
