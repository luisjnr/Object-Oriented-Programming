import java.util.Scanner;

public class Locadora {

    public static void main(String[] args) {
		Veiculo car[] = new Veiculo[3];
		car[0] = new Veiculo("J3KZ-4E95", "FIAT UNO", "ECONOMICO");
		car[1] = new Veiculo("CJF8-FJ87", "HILUX", "SUV");
		car[2] = new Veiculo("L4KW-FJK4", "MUSTANG", "LUXO");
		InterfaceLocadora inter = new InterfaceLocadora();
		
		do{
			switch (inter.menu("1 - Econômico\n2 - Suv\n3 - Luxo\n4 - Encerrar")){
				case 1: inter.metodos(car[0]);
					break;
					
				case 2: inter.metodos(car[1]);
					break;
					
				case 3: inter.metodos(car[2]);
					break;
					
				case 4: return;
				default: System.out.println("Digite uma opção válida.");
			}
		} while (true);
    }
}
