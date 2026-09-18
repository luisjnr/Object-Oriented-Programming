public class Transporte {

    public static void main(String[] args) {
		Onibus[] bus = new Onibus[2]; 
		InterfaceTransporte inter = new InterfaceTransporte();
		bus[0] = new Onibus(22, "JANUÁRIA - ITACARAMBI", 40, 4.5);
		bus[1] = new Onibus(13, "MONTES CLAROS - BELO HORIZONTE", 40, 4.5);
		
		do{
			System.out.println("LINHAS DISPONÍVEIS");
			switch (inter.menu(("1 - " + bus[0].getLinha() + "\n2 - " +
			bus[1].getLinha() + "\n3 - Encerrar"))){
				case 1: inter.metodos(bus[0]);
					break;
					
				case 2: inter.metodos(bus[1]);
					break;
					
				case 3: return;
					
				default: System.out.println("Digite uma opção válida.");
			}
		} while (true);
    }
}
